package com.github.kadehar.guessthenumber.tests.greetings;

import com.github.kadehar.guessthenumber.greetings.Greeting;
import com.github.kadehar.guessthenumber.fakes.greetings.FakeGreeting;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingsTest {
    @Test
    public void greetingsMessageTest() {
        Greeting greeting = new FakeGreeting();

        assertEquals("\tFake title!\tFake subtitle!\n", greeting.message());
    }
}
