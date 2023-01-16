package com.github.kadehar.guessthenumber;

import com.github.kadehar.guessthenumber.game.Game;
import com.github.kadehar.guessthenumber.greetings.BaseGreeting;
import com.github.kadehar.guessthenumber.greetings.Greeting;
import com.github.kadehar.guessthenumber.player.ComputerPlayer;
import com.github.kadehar.guessthenumber.player.Player;
import com.github.kadehar.guessthenumber.player.UserPlayer;
import com.github.kadehar.guessthenumber.result.Result;
import com.github.kadehar.guessthenumber.title.BaseGameSubTitle;
import com.github.kadehar.guessthenumber.title.BaseGameTitle;

public class Main {
    public static void main(String[] args) {
        Greeting greeting = new BaseGreeting(
                new BaseGameTitle(),
                new BaseGameSubTitle()
        );
        greeting.show();
        Player computer = new ComputerPlayer();
        Player user = new UserPlayer();
        Game game = new Game(computer, user);
        Result result = game.play();
        System.out.println(result.message());
    }
}
