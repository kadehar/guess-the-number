package com.github.kadehar.guessthenumber.result;

public class Lose implements Result {

    private final byte number;

    public Lose(byte number) {
        this.number = number;
    }

    @Override
    public String message() {
        return String.format("Sorry, you lose!\nComputer number was: %d", number);
    }
}
