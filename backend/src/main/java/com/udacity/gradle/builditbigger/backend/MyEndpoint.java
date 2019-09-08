package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;
import com.udacity.gradle.javajokelib.JavaJokeLib;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    JavaJokeLib javaJoke = new JavaJokeLib();
    /** A simple endpoint method that gets jokes from a Java library */
    @ApiMethod(name = "javaJoke")
    public MyBean javaJoke() {
        MyBean response = new MyBean();
        response.setData(javaJoke.getJoke());

        return response;
    }

}
