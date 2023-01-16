package com.github.kadehar.guessthenumber.fakes.result;

import com.github.kadehar.guessthenumber.result.Result;

public class FakeWinResult implements Result {
    @Override
    public String message() {
        return "Fake win!";
    }
}
