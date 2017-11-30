package com.maxiannicu.url;

import java.util.Map;

/**
 * Created by Nicu Maxian on 29-Nov-17.
 */
public class WebUrl {
    private String host;
    private boolean secureConnection;
    private Map<String, String> queryParameters;

    public WebUrl(String host, boolean secureConnection, Map<String, String> queryParameters) {
        this.host = host;
        this.secureConnection = secureConnection;
        this.queryParameters = queryParameters;
    }

    public boolean hasQueryParam(String key) {
        return queryParameters.containsKey(key);
    }

    public String getQueryParam(String key) {
        return queryParameters.get(key);
    }

    @Override
    public String toString() {
        String baseUrl = String.format("%s://%s", getSchema(), getHost());
        if (queryParameters.size() > 0) {
            baseUrl = String.format("%s?%s", baseUrl, getQueryParams());
        }
        return baseUrl;
    }

    private String getSchema() {
        return secureConnection ? "https" : "http";
    }

    private String getHost() {
        return host.contains("://") ? host.split("://")[1] : host;
    }

    private String getQueryParams() {
        StringBuilder collect = queryParameters.entrySet()
                .stream()
                .collect(StringBuilder::new, (builder, b) -> {
                    if (builder.length() > 0) {
                        builder.append('?');
                    }
                    builder.append(String.format("%s=%s", b.getKey(), b.getValue()));
                },(a,b) -> {});

        return collect.toString();
    }
}
