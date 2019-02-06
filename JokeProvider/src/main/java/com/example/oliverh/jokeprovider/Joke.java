package com.example.oliverh.jokeprovider;

public class Joke {
    private String hook;
    private String punchline;

    Joke() {
        hook = "";
        punchline = "";
    }

    Joke( String iHook, String iPunchline ) {
        hook = iHook;
        punchline = iPunchline;
    }
}
