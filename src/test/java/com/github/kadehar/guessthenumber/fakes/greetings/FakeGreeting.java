package com.github.kadehar.guessthenumber.fakes.greetings;

import com.github.kadehar.guessthenumber.greetings.Greeting;

public class FakeGreeting implements Greeting {
    @Override
    public String message() {
        return "\tFake title!\tFake subtitle!\n";
    }
}
