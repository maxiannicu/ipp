package com.maxiannicu.imp.http.java;

import com.maxiannicu.client.HttpClient;
import com.maxiannicu.client.HttpClientFactory;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class JavaHttpClientFactory implements HttpClientFactory {
    @Override
    public HttpClient newClient() {
        return new JavaHttpClient();
    }

    @Override
    public String getName() {
        return "Java Default library";
    }
}
