package com.github.kadehar.guessthenumber.player;

import java.util.Scanner;

public class UserPlayer implements Player {
    @Override
    public byte number() {
        System.out.print("Please, enter number: ");
        return new Scanner(System.in).nextByte();
    }
}
