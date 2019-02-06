package com.example.oliverh.jokeprovider;

import java.util.ArrayList;

public class JokeProvider {
    static private ArrayList<Joke> jokeList;

    JokeProvider() {
        if ( jokeList == null )  {
            jokeList = new ArrayList<>();
            jokeList.add(new Joke("What did the baby digital watch say to the mommy analog watch?",
                            "Look Ma, no hands!"));
            jokeList.add(new Joke("Why did the crab never share?",
                    "Because he's shellfish!"));
            jokeList.add(new Joke("What's the smartest animal?",
                    "A fish because they stay in schools!"));
            jokeList.add(new Joke("How much money does a skunk have?",
                    "One scent!"));
            jokeList.add(new Joke("What vegetables do librarians like?",
                    "Quiet peas."));
            jokeList.add(new Joke("Why didn't the sun go to college?",
                    "Because it already had a million degrees!"));
            jokeList.add(new Joke("What do you call friends who love math?",
                    "Algebros"));
        }
    }

    public String getJoke() {
       return "What's a joke?";
    }
}
