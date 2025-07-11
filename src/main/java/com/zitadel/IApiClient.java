package com.zitadel;

import com.fasterxml.jackson.core.type.TypeReference;

import javax.annotation.Nullable;
import java.util.Collection;
import java.util.Map;

interface IApiClient {
    Object invokeAPI(
            String operationId,
            String pathTemplate,
            String method,
            Map<String, Object> pathParams,
            Map<String, Object> queryParams,
            Map<String, Collection<String>> headerParams,
            @Nullable Object body,
            Map<Integer, TypeReference<?>> responseTypes
    ) throws ApiException;
}
