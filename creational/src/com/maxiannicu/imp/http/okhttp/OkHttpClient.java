package com.maxiannicu.imp.http.okhttp;

import com.maxiannicu.client.HttpClient;
import com.maxiannicu.client.HttpRequest;
import com.maxiannicu.client.HttpResponse;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class OkHttpClient implements HttpClient {
    private final okhttp3.OkHttpClient client;

    public OkHttpClient(okhttp3.OkHttpClient client) {
        this.client = client;
    }

    @Override
    public HttpResponse call(HttpRequest request) {
        Request build = new Request.Builder()
                .url(request.getUrl().toString())
                .build();

        try {
            Response response = client.newCall(build)
                    .execute();
            return new HttpResponse(response.body().string(), response.code());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
