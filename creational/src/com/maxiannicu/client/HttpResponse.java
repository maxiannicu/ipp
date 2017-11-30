package com.maxiannicu.client;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class HttpResponse {
    private final String output;
    private final int statusCode;

    public HttpResponse(String output, int statusCode) {
        this.output = output;
        this.statusCode = statusCode;
    }

    public String getOutput() {
        return output;
    }

    public int getContentLength(){
        return output.length();
    }

    public int getStatusCode(){
        return statusCode;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new HttpResponse(output, statusCode);
    }
}
