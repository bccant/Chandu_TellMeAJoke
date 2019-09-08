package com.udacity.gradle.javajokelib;

import java.util.Random;

public class JavaJokeLib {

    String jokesList = "You'll never guess who I bumped into on my way to the opticians. Everyone.\n" +
            "I had a ploughman's lunch today. He wasn't very happy.\n" +
            "Aim for the stars. But first, aim for their bodyguards.\n" +
            "What concert only costs 45 cents? 50 Cent and Nickleback.\n" +
            "There are three kinds of people in this world. Those who can count and those who can't.\n" +
            "Always remember - you're unique. Just like everyone else.\n" +
            "Two blondes walk into a building... You'd think one of them would have seen it.\n" +
            "What's the best thing about babies? Making them.\n" +
            "Light travels faster than sound. That's why some people appear bright until you hear them speak.\n" +
            "Why don't lobsters like sharing? Because they're shellfish.\n" +
            "What animal do you look like when you get in the bath? A little bear.\n" +
            "Just think - half the people you know are below average.\n" +
            "If you choke a Smurf, what color does it turn?" +
            "I'm a nobody. Nobody is perfect. Therefore I'm perfect.";

    public String getJoke() {
        String jokeLines[] = jokesList.split("\\r?\\n");
        Random r = new Random();
        int rand = r.nextInt(jokeLines.length);

        return jokeLines[rand];
    }
}
