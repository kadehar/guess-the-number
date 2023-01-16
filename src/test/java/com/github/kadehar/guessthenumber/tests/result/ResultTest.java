package com.github.kadehar.guessthenumber.tests.result;

import com.github.kadehar.guessthenumber.fakes.result.FakeLoseResult;
import com.github.kadehar.guessthenumber.fakes.result.FakeWinResult;
import com.github.kadehar.guessthenumber.result.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResultTest {
    @Test
    public void winResultTest() {
        Result win = new FakeWinResult();

        assertEquals("Fake win!", win.message());
    }

    @Test
    public void loseResultTest() {
        Result lose = new FakeLoseResult();

        assertEquals("Fake lose result!\nNumber: 4", lose.message());
    }
}
