package com.maxiannicu;

import com.maxiannicu.abstractfactory.Factory;
import com.maxiannicu.abstractfactory.Headphones;
import com.maxiannicu.abstractfactory.Phone;
import com.maxiannicu.client.HttpClient;
import com.maxiannicu.client.HttpClientFactory;
import com.maxiannicu.client.HttpRequest;
import com.maxiannicu.client.HttpResponse;
import com.maxiannicu.url.WebUrl;
import com.maxiannicu.url.WebUrlBuilder;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
public class Application {
    private static Application instance;

    public static Application getInstance(){
        if (instance == null)
            instance =  new Application();

        return instance;
    }

    public void runCallOn(HttpClientFactory factory){

        WebUrl build = WebUrlBuilder.create("https://jsonplaceholder.typicode.com/comments")
                .useHttps()
                .addQueryParameter("postId",3)
                .build();

        HttpClient httpClient = factory.newClient();

        HttpResponse call = httpClient.call(new HttpRequest(build));
        System.out.println(factory.getName());
        System.out.printf("Call to %s\n", build.toString());
        System.out.printf("Status %d\n", call.getStatusCode());
        System.out.printf("Content length %d\n", call.getContentLength());
        System.out.println();
    }

    public void printAbstactFactory(Factory factory){
        System.out.println(factory.getManufacturerName());

        Headphones headphones = factory.buildHeadphones();
        System.out.println("Headphone "+headphones.getPower()+ " watt");

        Phone phone = factory.buildPhone();
        System.out.println("Phone "+phone.getModel());
        System.out.println("RAM : "+phone.getRam()+" MB");
        System.out.println("Cpu: "+phone.getCpuFrequncy()+" Mhz");
        System.out.println();
    }
}
