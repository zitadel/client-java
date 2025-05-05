package com.zitadel.utils;

import java.net.URL;

public class URLUtil {

    private URLUtil() {
        //
    }

    @SuppressWarnings("HttpUrlsUsage")
    public static URL buildHostname(String hostname) {
        try {
            if (!hostname.startsWith("http://") && !hostname.startsWith("https://")) {
                hostname = "https://" + hostname; // default to https
            }

            return new URL(hostname);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
