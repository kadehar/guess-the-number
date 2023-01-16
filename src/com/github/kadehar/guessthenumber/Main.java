package com.github.kadehar.guessthenumber;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        System.out.println("\tGuess the number!");
        System.out.println("\tTry to win! Good luck!");
        System.out.println();
        byte computerNumber = (byte) ThreadLocalRandom.current()
                .nextInt(1, 11);

        System.out.print("Please, enter number: ");
        byte userNumber = new Scanner(System.in).nextByte();

        if (computerNumber == userNumber) {
            System.out.println("Congrats! You win!");
        } else {
            System.out.println("Sorry, you lose!");
            System.out.println("Computer made a number " + computerNumber);
        }
    }
}
