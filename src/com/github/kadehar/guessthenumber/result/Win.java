package com.github.kadehar.guessthenumber.result;

public class Win implements Result {
    @Override
    public String message() {
        return "Congrats! You win!";
    }
}
