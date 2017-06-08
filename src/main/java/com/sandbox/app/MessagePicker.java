package com.sandbox.app;

class MessagePicker {
    public static String exitMessage(int numJokeAttempts) {
        switch (numJokeAttempts) {
            case 0:
                return "";
            case 1:
                return "We out here killin it erry day";
            case 2:
                return "Do come again";
            case 3:
                return "We'll be better next time";
            default:
                return "I think you're the problem";
        }
    }
}
