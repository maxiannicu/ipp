package com.maxiannicu.imp.http.java;

import com.maxiannicu.client.HttpClient;
import com.maxiannicu.client.HttpRequest;
import com.maxiannicu.client.HttpResponse;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class JavaHttpClient implements HttpClient {
    @Override
    public HttpResponse call(HttpRequest request) {
        HttpURLConnection connection = null;
        try {
            //Create connection
            URL url = new URL(request.getUrl().toString());
            connection = (HttpURLConnection) url.openConnection();

            //Get Response
            InputStream is = connection.getInputStream();
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            StringBuilder response = new StringBuilder(); // or StringBuffer if Java version 5+
            String line;
            while ((line = rd.readLine()) != null) {
                response.append(line);
                response.append('\n');
            }
            rd.close();

            return new HttpResponse(response.toString(), connection.getResponseCode());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }
}
