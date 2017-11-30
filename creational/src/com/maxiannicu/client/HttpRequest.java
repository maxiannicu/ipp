package com.maxiannicu.client;

import com.maxiannicu.url.WebUrl;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class HttpRequest {
    private final WebUrl url;

    public HttpRequest(WebUrl url) {
        this.url = url;
    }

    public WebUrl getUrl() {
        return url;
    }
}
