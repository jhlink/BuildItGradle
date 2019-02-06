package com.example.oliverh.jokeprovider;

import java.util.ArrayList;
import java.util.Random;

public class JokeProvider {
    static private ArrayList<String> jokeList;
    private Random randomGenerator;

    public JokeProvider() {
        if ( jokeList == null )  {
            initializeJokeList();
            randomGenerator = new Random();
        }
    }

    private void initializeJokeList() {
        jokeList = new ArrayList<>();
        jokeList.add("My email password has been hacked. That's the third time I've had to rename the cat.");
        jokeList.add("Did you hear about the monkeys who shared an Amazon account? They were Prime mates.");
        jokeList.add("My name is Microsoft. Can I crash at your place tonight?");
        jokeList.add("People act like the North Pole and the South Pole are exactly the same, but really, there's a whole world of difference between them.");
        jokeList.add("If you sit down to enjoy a hot cup of coffee, then your boss will ask you to do something that will last until the coffee is cold.");
    }

    public String getJoke() {
        if ( jokeList == null ) {
            initializeJokeList();
        }

        int selectedJokeIndex = randomJokeListIndex();

        return jokeList.get(selectedJokeIndex);
    }

    private int randomJokeListIndex() {
        if ( jokeList == null ) {
            return 0;
        }

        return randomGenerator.nextInt(jokeList.size());
    }
}
