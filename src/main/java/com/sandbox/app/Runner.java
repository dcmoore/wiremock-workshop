package com.sandbox.app;

class Runner {
  public static void main(String[] args) {
    ConsoleIO io = new ConsoleIO();
    DadJokeClient dadJokeClient = new DadJokeClient();
    new Shell().doStuff(io, dadJokeClient);
  }
}
