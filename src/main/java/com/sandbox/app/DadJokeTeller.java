package com.sandbox.app;

import java.io.IOException;

public class DadJokeTeller {

    public static void tellJokes(IO io, DadJokeClient dadJokeClient) {
        io.display("Welcome to the best Dad Jokes application ever built in the history of programming ever!!!");

        boolean funnyDadJokeHasBeenTold = false;
        int numJokeAttempts = 0;

        while (!funnyDadJokeHasBeenTold) {
            try {
                io.display(dadJokeClient.getNextJoke());
                funnyDadJokeHasBeenTold = io.askBoolean("You lol yet?");
                numJokeAttempts++;
            } catch (IOException e) {
                io.display("I can haz teh internet connection next time pleaze?");
                break;
            }
        }

        io.display(MessagePicker.exitMessage(numJokeAttempts));
    }
}
