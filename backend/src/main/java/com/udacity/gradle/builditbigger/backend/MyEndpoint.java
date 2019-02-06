package com.udacity.gradle.builditbigger.backend;

import com.example.oliverh.jokeprovider.Joke;
import com.example.oliverh.jokeprovider.JokeProvider;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

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

    @ApiMethod(name = "getJoke")
    public Joke getJoke() {
        JokeProvider joker = new JokeProvider();
        Joke newJoke = joker.getJoke();

        return newJoke;
    }


}
