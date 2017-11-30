package com.maxiannicu.url;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nicu Maxian on 29-Nov-17.
 */
public class WebUrlBuilder {
    private String host;
    private boolean secureConnection;
    private Map<String,String> queryParameters;

    private WebUrlBuilder(String host) {
        this.host = host;
        this.secureConnection = false;
        this.queryParameters = new HashMap<>();
    }

    public static WebUrlBuilder create(String host){
        return new WebUrlBuilder(host);
    }

    public WebUrlBuilder useHttps(){
        secureConnection = true;
        return this;
    }

    public WebUrlBuilder addQueryParameter(String key, Object value){
        queryParameters.put(key,value.toString());
        return this;
    }

    public WebUrl build(){
        return new WebUrl(host, secureConnection, queryParameters);
    }
}
