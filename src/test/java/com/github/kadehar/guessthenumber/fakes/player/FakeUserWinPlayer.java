package com.github.kadehar.guessthenumber.fakes.player;

import com.github.kadehar.guessthenumber.player.Player;

public class FakeUserWinPlayer implements Player {
    @Override
    public byte number() {
        return 4;
    }
}
