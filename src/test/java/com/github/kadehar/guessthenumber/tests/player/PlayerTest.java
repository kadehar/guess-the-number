package com.github.kadehar.guessthenumber.tests.player;

import com.github.kadehar.guessthenumber.fakes.player.FakeComputerPlayer;
import com.github.kadehar.guessthenumber.fakes.player.FakeUserWinPlayer;
import com.github.kadehar.guessthenumber.player.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    public void computerPlayerTest() {
        Player pc = new FakeComputerPlayer();

        assertEquals(4, pc.number());
    }

    @Test
    public void userPlayerTest() {
        Player pc = new FakeUserWinPlayer();

        assertEquals(4, pc.number());
    }
}
