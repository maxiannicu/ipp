package com.maxiannicu.client;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public interface HttpClientFactory {
    HttpClient newClient();

    String getName();
}
