package com.github.kadehar.guessthenumber.game;

import com.github.kadehar.guessthenumber.player.Player;
import com.github.kadehar.guessthenumber.result.Lose;
import com.github.kadehar.guessthenumber.result.Result;
import com.github.kadehar.guessthenumber.result.Win;

public class Game {
    private final Player computer;
    private final Player user;

    public Game(Player computer, Player user) {
        this.computer = computer;
        this.user = user;
    }

    public Result play() {
        byte computerNumber = computer.number();
        byte userNumber = user.number();

        if (computerNumber == userNumber) {
            return new Win();
        } else {
            return new Lose(computerNumber);
        }
    }
}
