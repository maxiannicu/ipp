package com.maxiannicu.url;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by Nicu Maxian on 30-Nov-17.
 */
@RunWith(JUnit4.class)
public class WebUrlBuilderTest {
    @Test
    public void create() {
        WebUrl build = WebUrlBuilder.create("google.com")
                .build();

        Assert.assertEquals(build.toString(),"http://google.com");
    }

    @Test
    public void useHttps() {
        WebUrl build = WebUrlBuilder.create("google.com")
                .useHttps()
                .build();

        Assert.assertEquals(build.toString(),"https://google.com");
    }

    @Test
    public void addQueryParameter() {
        WebUrl build = WebUrlBuilder.create("google.com")
                .addQueryParameter("a",3)
                .addQueryParameter("b",121)
                .build();

        Assert.assertEquals("3",build.getQueryParam("a"));
        Assert.assertEquals("121",build.getQueryParam("b"));
    }

}