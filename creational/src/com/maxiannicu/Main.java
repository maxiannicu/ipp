package com.maxiannicu;

import com.maxiannicu.imp.abstractfactory.apple.AppleFactory;
import com.maxiannicu.imp.abstractfactory.samsung.SamsungFactory;
import com.maxiannicu.imp.http.java.JavaHttpClientFactory;
import com.maxiannicu.imp.http.okhttp.OkHttpClientFactory;

public class Main {

    public static void main(String[] args) {

        Application instance = Application.getInstance();

        instance.runCallOn(new JavaHttpClientFactory());
        instance.runCallOn(new OkHttpClientFactory());
        instance.printAbstactFactory(new AppleFactory());
        instance.printAbstactFactory(new SamsungFactory());
    }
}
