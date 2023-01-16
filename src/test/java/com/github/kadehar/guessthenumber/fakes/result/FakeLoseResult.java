package com.github.kadehar.guessthenumber.fakes.result;

import com.github.kadehar.guessthenumber.result.Result;

public class FakeLoseResult implements Result {
    @Override
    public String message() {
        return "Fake lose result!\nNumber: 4";
    }
}
