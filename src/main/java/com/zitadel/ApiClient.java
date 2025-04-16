package com.zitadel;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.zitadel.auth.Authenticator;
import com.zitadel.auth.NoAuthAuthenticator;
import com.zitadel.utils.StringUtil;
import org.apache.hc.client5.http.entity.UrlEncodedFormEntity;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.client5.http.protocol.HttpClientContext;
import org.apache.hc.core5.http.*;
import org.apache.hc.core5.http.io.entity.ByteArrayEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.entity.FileEntity;
import org.apache.hc.core5.http.io.entity.StringEntity;
import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;
import org.apache.hc.core5.http.message.BasicNameValuePair;
import org.openapitools.jackson.nullable.JsonNullableModule;

import javax.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.text.DateFormat;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApiClient {

  public static final String USER_AGENT = String.format("zitadel-client/%s (lang=java; lang_version=%s; os=%s; arch=%s)", Version.VERSION, System.getProperty("java.version"), System.getProperty("os.name"), System.getProperty("os.arch")).toLowerCase(Locale.ENGLISH);
  private static final List<String> bodyMethods = Arrays.asList("POST", "PUT", "DELETE", "PATCH");
  private final Authenticator authenticator;
  private final DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ISO_OFFSET_DATE_TIME;
  private final DateFormat dateFormat;
  @Nullable
  protected String tempFolderPath = null;
  private boolean debugging = false;
  private CloseableHttpClient httpClient;
  private ObjectMapper objectMapper;

  public ApiClient(Authenticator authenticator, CloseableHttpClient httpClient) {
    objectMapper = new ObjectMapper();
    objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    objectMapper.configure(DeserializationFeature.FAIL_ON_INVALID_SUBTYPE, false);
    objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
    objectMapper.enable(SerializationFeature.WRITE_ENUMS_USING_TO_STRING);
    objectMapper.enable(DeserializationFeature.READ_ENUMS_USING_TO_STRING);
    objectMapper.registerModule(new JavaTimeModule());
    objectMapper.registerModule(new JsonNullableModule());
    objectMapper.setDateFormat(ApiClient.buildDefaultDateFormat());
    dateFormat = ApiClient.buildDefaultDateFormat();
    this.httpClient = httpClient;
    this.authenticator = authenticator;
  }

  public ApiClient() {
    this(new NoAuthAuthenticator(), HttpClients.custom()
      .setUserAgent(USER_AGENT)
      .build());
  }

  public ApiClient(Authenticator authenticator) {
    this(authenticator, HttpClients.custom()
      .setUserAgent(USER_AGENT)
      .build());
  }

  public static DateFormat buildDefaultDateFormat() {
    return new RFC3339DateFormat();
  }

  /**
   * Sets the object mapper.
   *
   * @param objectMapper object mapper
   * @return API client
   */
  @SuppressWarnings("unused")
  public ApiClient setObjectMapper(ObjectMapper objectMapper) {
    this.objectMapper = objectMapper;
    return this;
  }

  /**
   * Sets the HTTP client.
   *
   * @param httpClient HTTP client
   * @return API client
   */
  @SuppressWarnings("unused")
  public ApiClient setHttpClient(CloseableHttpClient httpClient) {
    this.httpClient = httpClient;
    return this;
  }

  /**
   * The path of temporary folder used to store downloaded files from endpoints
   * with file response. The default value is <code>null</code>, i.e. using
   * the system's default temporary folder.
   *
   * @return Temp folder path
   */
  @Nullable
  @SuppressWarnings("unused")
  public String getTempFolderPath() {
    return tempFolderPath;
  }

  /**
   * Set temp folder path
   *
   * @param tempFolderPath Temp folder path
   * @return API client
   */
  @SuppressWarnings("unused")
  public ApiClient setTempFolderPath(String tempFolderPath) {
    this.tempFolderPath = tempFolderPath;
    return this;
  }

  /**
   * Check that whether debugging is enabled for this API client.
   *
   * @return True if debugging is on
   */
  @SuppressWarnings("unused")
  public boolean isDebugging() {
    return debugging;
  }

  /**
   * Enable/disable debugging for this API client.
   *
   * @param debugging To enable (true) or disable (false) debugging
   * @return API client
   */
  @SuppressWarnings("unused")
  public ApiClient setDebugging(boolean debugging) {
    this.debugging = debugging;
    return this;
  }

  /**
   * Format the given Date object into string.
   *
   * @param date Date
   * @return Date in string format
   */
  public String formatDate(Date date) {
    return dateFormat.format(date);
  }

  /**
   * Format the given parameter object into string.
   *
   * @param param Object
   * @return Object in string format
   */
  public String parameterToString(Object param) {
    if (param == null) {
      return "";
    } else if (param instanceof Date) {
      return formatDate((Date) param);
    } else if (param instanceof OffsetDateTime) {
      return offsetDateTimeFormatter.format((OffsetDateTime) param);
    } else if (param instanceof Collection) {
      StringBuilder b = new StringBuilder();
      for (Object o : (Collection<?>) param) {
        if (b.length() > 0) {
          b.append(',');
        }
        b.append(o);
      }
      return b.toString();
    } else {
      return String.valueOf(param);
    }
  }

  /**
   * Formats the specified query parameter to a list containing a single {@code Pair} object.
   * <p>
   * Note that {@code value} must not be a collection.
   *
   * @param name  The name of the parameter.
   * @param value The value of the parameter.
   * @return A list containing a single {@code Pair} object.
   */
  public List<Pair> parameterToPair(String name, Object value) {
    List<Pair> params = new ArrayList<>();

    // preconditions
    if (name == null || name.isEmpty() || value == null || value instanceof Collection) {
      return params;
    }

    params.add(new Pair(name, escapeString(parameterToString(value))));
    return params;
  }

  /**
   * Formats the specified collection query parameters to a list of {@code Pair} objects.
   * <p>
   * Note that the values of each of the returned Pair objects are percent-encoded.
   *
   * @param collectionFormat The collection format of the parameter.
   * @param name             The name of the parameter.
   * @param value            The value of the parameter.
   * @return A list of {@code Pair} objects.
   */
  public List<Pair> parameterToPairs(String collectionFormat, String name, Collection<?> value) {
    List<Pair> params = new ArrayList<>();

    // preconditions
    if (name == null || name.isEmpty() || value == null || value.isEmpty()) {
      return params;
    }

    // create the params based on the collection format
    if ("multi".equals(collectionFormat)) {
      for (Object item : value) {
        params.add(new Pair(name, escapeString(parameterToString(item))));
      }
      return params;
    }

    // collectionFormat is assumed to be "csv" by default
    String delimiter = ",";

    // escape all delimiters except commas, which are URI reserved
    // characters
    if ("ssv".equals(collectionFormat)) {
      delimiter = escapeString(" ");
    } else if ("tsv".equals(collectionFormat)) {
      delimiter = escapeString("\t");
    } else if ("pipes".equals(collectionFormat)) {
      delimiter = escapeString("|");
    }

    StringBuilder sb = new StringBuilder();
    for (Object item : value) {
      sb.append(delimiter);
      sb.append(escapeString(parameterToString(item)));
    }

    params.add(new Pair(name, sb.substring(delimiter.length())));

    return params;
  }

  /**
   * Check if the given MIME is a JSON MIME.
   * JSON MIME examples:
   * application/json
   * application/json; charset=UTF8
   * APPLICATION/JSON
   * application/vnd.company+json
   *
   * @param mime MIME
   * @return True if MIME type is boolean
   */
  public boolean isJsonMime(String mime) {
    String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
    return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
  }

  /**
   * Select the Accept header's value from the given accepts array:
   * if JSON exists in the given array, use it;
   * otherwise use all of them (joining into a string)
   *
   * @param accepts The accepts array to select from
   * @return The Accept header to use. If the given array is empty,
   * null will be returned (not to set the Accept header explicitly).
   */
  @Nullable
  public String selectHeaderAccept(String[] accepts) {
    if (accepts.length == 0) {
      return null;
    }
    for (String accept : accepts) {
      if (isJsonMime(accept)) {
        return accept;
      }
    }
    return StringUtil.join(accepts, ",");
  }

  /**
   * Select the Content-Type header's value from the given array:
   * if JSON exists in the given array, use it;
   * otherwise use the first one of the array.
   *
   * @param contentTypes The Content-Type array to select from
   * @return The Content-Type header to use. If the given array is empty,
   * or matches "any", JSON will be used.
   */
  public String selectHeaderContentType(String[] contentTypes) {
    if (contentTypes.length == 0 || contentTypes[0].equals("*/*")) {
      return "application/json";
    }
    for (String contentType : contentTypes) {
      if (isJsonMime(contentType)) {
        return contentType;
      }
    }
    return contentTypes[0];
  }

  /**
   * Escape the given string to be used as URL query value.
   *
   * @param str String
   * @return Escaped string
   */
  public String escapeString(String str) {
    try {
      return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
    } catch (UnsupportedEncodingException e) {
      return str;
    }
  }

  /**
   * Transforms response headers into map.
   *
   * @param headers HTTP headers
   * @return a map of string array
   */
  protected Map<String, List<String>> transformResponseHeaders(Header[] headers) {
    Map<String, List<String>> headersMap = new HashMap<>();
    for (Header header : headers) {
      List<String> valuesList = headersMap.get(header.getName());
      if (valuesList != null) {
        valuesList.add(header.getValue());
      } else {
        valuesList = new ArrayList<>();
        valuesList.add(header.getValue());
        headersMap.put(header.getName(), valuesList);
      }
    }
    return headersMap;
  }

  /**
   * Parse content type object from header value
   */
  private ContentType getContentType(String headerValue) throws ApiException {
    try {
      return ContentType.parse(headerValue);
    } catch (UnsupportedCharsetException e) {
      throw new ApiException("Could not parse content type " + headerValue);
    }
  }

  /**
   * Get the content-type of a response or null if one was not provided
   */
  @Nullable
  private String getResponseMimeType(HttpResponse response) throws ApiException {
    Header contentTypeHeader = response.getFirstHeader("Content-Type");
    if (contentTypeHeader != null) {
      return getContentType(contentTypeHeader.getValue()).getMimeType();
    }
    return null;
  }

  /**
   * Serialize the given Java object into string according the given
   * Content-Type (only JSON is supported for now).
   *
   * @param obj         Object
   * @param contentType Content type
   * @param formParams  Form parameters
   * @return Object
   */
  public HttpEntity serialize(@Nullable Object obj, Map<String, Object> formParams, ContentType contentType) throws ApiException {
    String mimeType = contentType.getMimeType();
    if (isJsonMime(mimeType)) {
      try {
        return new StringEntity(objectMapper.writeValueAsString(obj), contentType.withCharset(StandardCharsets.UTF_8));
      } catch (JsonProcessingException e) {
        throw new ApiException(e);
      }
    } else if (mimeType.equals(ContentType.MULTIPART_FORM_DATA.getMimeType())) {
      MultipartEntityBuilder multiPartBuilder = MultipartEntityBuilder.create();
      for (Entry<String, Object> paramEntry : formParams.entrySet()) {
        Object value = paramEntry.getValue();
        if (value instanceof File) {
          multiPartBuilder.addBinaryBody(paramEntry.getKey(), (File) value);
        } else if (value instanceof byte[]) {
          multiPartBuilder.addBinaryBody(paramEntry.getKey(), (byte[]) value);
        } else {
          Charset charset = contentType.getCharset();
          if (charset != null) {
            ContentType customContentType = ContentType.create(ContentType.TEXT_PLAIN.getMimeType(), charset);
            multiPartBuilder.addTextBody(paramEntry.getKey(), parameterToString(paramEntry.getValue()),
              customContentType);
          } else {
            multiPartBuilder.addTextBody(paramEntry.getKey(), parameterToString(paramEntry.getValue()));
          }
        }
      }
      return multiPartBuilder.build();
    } else if (mimeType.equals(ContentType.APPLICATION_FORM_URLENCODED.getMimeType())) {
      List<NameValuePair> formValues = new ArrayList<>();
      for (Entry<String, Object> paramEntry : formParams.entrySet()) {
        formValues.add(new BasicNameValuePair(paramEntry.getKey(), parameterToString(paramEntry.getValue())));
      }
      return new UrlEncodedFormEntity(formValues, contentType.getCharset());
    } else {
      // Handle files with unknown content type
      if (obj instanceof File) {
        return new FileEntity((File) obj, contentType);
      } else if (obj instanceof byte[]) {
        return new ByteArrayEntity((byte[]) obj, contentType);
      }
      throw new ApiException("Serialization for content type '" + contentType + "' not supported");
    }
  }

  /**
   * Deserialize response body to Java object according to the Content-Type.
   *
   * @param <T>       Type
   * @param response  Response
   * @param valueType Return type
   * @return Deserialized object
   * @throws ApiException API exception
   * @throws IOException  IO exception
   */
  @SuppressWarnings("unchecked")
  @Nullable
  public <T> T deserialize(CloseableHttpResponse response, TypeReference<T> valueType) throws ApiException, IOException, ParseException {
    if (valueType == null) {
      return null;
    }
    HttpEntity entity = response.getEntity();
    Type valueRawType = valueType.getType();
    if (valueRawType.equals(byte[].class)) {
      return (T) EntityUtils.toByteArray(entity);
    } else if (valueRawType.equals(File.class)) {
      return (T) downloadFileFromResponse(response);
    }
    String mimeType = getResponseMimeType(response);
    if (mimeType == null || isJsonMime(mimeType)) {
      // Assume json if no mime type
      // convert input stream to string
      String content = EntityUtils.toString(entity);

      if ("".equals(content)) { // returns null for empty body
        return null;
      }

      return objectMapper.readValue(content, valueType);
    } else if (mimeType.toLowerCase(Locale.ENGLISH).startsWith("text/")) {
      // convert input stream to string
      return (T) EntityUtils.toString(entity);
    } else {
      Map<String, List<String>> responseHeaders = transformResponseHeaders(response.getHeaders());
      throw new ApiException(
        "Deserialization for content type '" + mimeType + "' not supported for type '" + valueType + "'",
        response.getCode(),
        responseHeaders,
        EntityUtils.toString(entity)
      );
    }
  }

  private File downloadFileFromResponse(CloseableHttpResponse response) throws IOException {
    Header contentDispositionHeader = response.getFirstHeader("Content-Disposition");
    String contentDisposition = contentDispositionHeader == null ? null : contentDispositionHeader.getValue();
    File file = prepareDownloadFile(contentDisposition);
    Files.copy(response.getEntity().getContent(), file.toPath(), StandardCopyOption.REPLACE_EXISTING);
    return file;
  }

  protected File prepareDownloadFile(@Nullable String contentDisposition) throws IOException {
    String filename = null;
    if (contentDisposition != null && !contentDisposition.isEmpty()) {
      // Get filename from the Content-Disposition header.
      Pattern pattern = Pattern.compile("filename=['\"]?([^'\"\\s]+)['\"]?");
      Matcher matcher = pattern.matcher(contentDisposition);
      if (matcher.find())
        filename = matcher.group(1);
    }

    String prefix;
    String suffix = null;
    if (filename == null) {
      prefix = "download-";
      suffix = "";
    } else {
      int pos = filename.lastIndexOf('.');
      if (pos == -1) {
        prefix = filename + "-";
      } else {
        prefix = filename.substring(0, pos) + "-";
        suffix = filename.substring(pos);
      }
      // Files.createTempFile requires the prefix to be at least three characters long
      if (prefix.length() < 3)
        prefix = "download-";
    }

    if (tempFolderPath == null)
      return Files.createTempFile(prefix, suffix).toFile();
    else
      return Files.createTempFile(Paths.get(tempFolderPath), prefix, suffix).toFile();
  }

  /**
   * Returns the URL of the client as defined by the server (if exists) or the base path.
   *
   * @return The URL for the client.
   */
  public String getBaseURL() {
    return this.authenticator.getHost();
  }

  /**
   * Build full URL by concatenating base URL, the given sub path and query parameters.
   *
   * @param path                  The sub path
   * @param queryParams           The query parameters
   * @param collectionQueryParams The collection query parameters
   * @param urlQueryDeepObject    URL query string of the deep object parameters
   * @return The full URL
   */
  @SuppressWarnings({"DuplicatedCode", "DuplicateExpressions"})
  private String buildUrl(String path, List<Pair> queryParams, @Nullable List<Pair> collectionQueryParams, @Nullable String urlQueryDeepObject) {
    String baseURL = getBaseURL();

    final StringBuilder url = new StringBuilder();
    url.append(baseURL).append(path);

    if (queryParams != null && !queryParams.isEmpty()) {
      // support (constant) query string in `path`, e.g. "/posts?draft=1"
      String prefix = path.contains("?") ? "&" : "?";
      for (Pair param : queryParams) {
        if (param.getValue() != null) {
          if (prefix != null) {
            url.append(prefix);
            prefix = null;
          } else {
            url.append("&");
          }
          String value = parameterToString(param.getValue());
          // query parameter value already escaped as part of parameterToPair
          url.append(escapeString(param.getName())).append("=").append(value);
        }
      }
    }

    if (collectionQueryParams != null && !collectionQueryParams.isEmpty()) {
      String prefix = url.toString().contains("?") ? "&" : "?";
      for (Pair param : collectionQueryParams) {
        if (param.getValue() != null) {
          if (prefix != null) {
            url.append(prefix);
            prefix = null;
          } else {
            url.append("&");
          }
          String value = parameterToString(param.getValue());
          // collection query parameter value already escaped as part of parameterToPairs
          url.append(escapeString(param.getName())).append("=").append(value);
        }
      }
    }

    if (urlQueryDeepObject != null && !urlQueryDeepObject.isEmpty()) {
      url.append(url.toString().contains("?") ? "&" : "?");
      url.append(urlQueryDeepObject);
    }

    return url.toString();
  }

  protected boolean isSuccessfulStatus(int statusCode) {
    return statusCode >= 200 && statusCode < 300;
  }

  protected boolean isBodyAllowed(String method) {
    return bodyMethods.contains(method);
  }

  @Nullable
  protected <T> T processResponse(CloseableHttpResponse response, TypeReference<T> returnType) throws ApiException, IOException, ParseException {
    int statusCode = response.getCode();
    if (statusCode == HttpStatus.SC_NO_CONTENT) {
      return null;
    }

    Map<String, List<String>> responseHeaders = transformResponseHeaders(response.getHeaders());

    if (isSuccessfulStatus(statusCode)) {
      return this.deserialize(response, returnType);
    } else {
      String message = EntityUtils.toString(response.getEntity());
      throw new ApiException(message, statusCode, responseHeaders, message);
    }
  }

  /**
   * Invoke API by sending HTTP request with the given options.
   *
   * @param <T>                   Type
   * @param path                  The sub-path of the HTTP URL
   * @param method                The request method, one of "GET", "POST", "PUT", and "DELETE"
   * @param queryParams           The query parameters
   * @param collectionQueryParams The collection query parameters
   * @param urlQueryDeepObject    A URL query string for deep object parameters
   * @param body                  The request body object - if it is not binary, otherwise null
   * @param headerParams          The header parameters
   * @param cookieParams          The cookie parameters
   * @param formParams            The form parameters
   * @param accept                The request's Accept header
   * @param contentType           The request's Content-Type header
   * @param authNames             The authentications to apply
   * @param returnType            Return type
   * @return The response body in type of string
   * @throws ApiException API exception
   */
  @SuppressWarnings({"deprecation", "unused"})
  @Nullable
  public <T> T invokeAPI(
    String path,
    String method,
    List<Pair> queryParams,
    List<Pair> collectionQueryParams,
    @Nullable String urlQueryDeepObject,
    @Nullable Object body,
    Map<String, String> headerParams,
    Map<String, String> cookieParams,
    Map<String, Object> formParams,
    String accept,
    String contentType,
    String[] authNames,
    TypeReference<T> returnType) throws ApiException {
    if (body != null && !formParams.isEmpty()) {
      throw new ApiException("Cannot have body and form params");
    }

    final String url = buildUrl(path, queryParams, collectionQueryParams, urlQueryDeepObject);

    ClassicRequestBuilder builder = ClassicRequestBuilder.create(method);
    builder.setUri(url);

    if (accept != null) {
      builder.addHeader("Accept", accept);
    }
    for (Entry<String, String> keyValue : headerParams.entrySet()) {
      builder.addHeader(keyValue.getKey(), keyValue.getValue());
    }

    for (Map.Entry<String, String> keyValue : this.authenticator.getAuthHeaders().entrySet()) {
      if (!headerParams.containsKey(keyValue.getKey())) {
        builder.addHeader(keyValue.getKey(), keyValue.getValue());
      }
    }

    HttpClientContext context = HttpClientContext.create();

    ContentType contentTypeObj = getContentType(contentType);
    if (body != null || !formParams.isEmpty()) {
      if (isBodyAllowed(method)) {
        // Add entity if we have content and a valid method
        builder.setEntity(serialize(body, formParams, contentTypeObj));
      } else {
        throw new ApiException("method " + method + " does not support a request body");
      }
    } else {
      // for empty body
      builder.setEntity(new StringEntity("", contentTypeObj));
    }

    try (CloseableHttpResponse response = httpClient.execute(builder.build(), context)) {
      return processResponse(response, returnType);
    } catch (IOException | ParseException e) {
      throw new ApiException(e);
    }
  }
}
