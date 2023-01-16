package com.github.kadehar.guessthenumber.player;

import java.util.concurrent.ThreadLocalRandom;

public class ComputerPlayer implements Player {
    @Override
    public byte number() {
        return (byte) ThreadLocalRandom.current().nextInt(1, 11);
    }
}
