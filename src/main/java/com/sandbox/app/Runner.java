package com.sandbox.app;

class Runner {
    public static void main(String[] args) {
        DadJokeTeller.tellJokes(new ConsoleIO(), new DadJokeClient());
    }
}
