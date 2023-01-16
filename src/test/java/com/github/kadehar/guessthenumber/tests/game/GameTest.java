package com.github.kadehar.guessthenumber.tests.game;

import com.github.kadehar.guessthenumber.fakes.player.FakeComputerPlayer;
import com.github.kadehar.guessthenumber.fakes.player.FakeUserLosePlayer;
import com.github.kadehar.guessthenumber.fakes.player.FakeUserWinPlayer;
import com.github.kadehar.guessthenumber.game.Game;
import com.github.kadehar.guessthenumber.player.Player;
import com.github.kadehar.guessthenumber.result.Result;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    @Test
    public void userWinPlayTest() {
        Player pc = new FakeComputerPlayer();
        Player user = new FakeUserWinPlayer();

        Game game = new Game(pc, user);
        Result result = game.play();

        assertEquals("Congrats! You win!", result.message());
    }

    @Test
    public void userLosePlayTest() {
        Player pc = new FakeComputerPlayer();
        Player user = new FakeUserLosePlayer();

        Game game = new Game(pc, user);
        Result result = game.play();

        assertEquals("Sorry, you lose!\nComputer number was: 4", result.message());
    }
}
