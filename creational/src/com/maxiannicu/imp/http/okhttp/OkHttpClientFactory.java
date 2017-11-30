package com.maxiannicu.imp.http.okhttp;

import com.maxiannicu.client.HttpClient;
import com.maxiannicu.client.HttpClientFactory;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class OkHttpClientFactory implements HttpClientFactory {
    @Override
    public HttpClient newClient() {
        return new OkHttpClient(new okhttp3.OkHttpClient());
    }

    @Override
    public String getName() {
        return "OkHttp client";
    }
}
