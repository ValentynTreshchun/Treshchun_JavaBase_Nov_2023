package com.hillel.treshchun.lessons.lesson6;

import java.util.Scanner;

public class HW7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gameRepeat;
        System.out.println("Welcome to the Guess-a-number game.\nYou will need to guess a random number from 0 to 10 and you'll have 3 attempts per number");
        do {
            int randNumber = (int) (Math.random() * 11);
            int guessNumber = 0;
            for (int i = 3; i > 0; i--) {
                System.out.print("\nEnter your guess: ");
                while (!scanner.hasNextInt()){
                        System.out.print("Wrong data entered, please enter an integer: ");
                        scanner.nextLine();
                    }
                guessNumber = scanner.nextInt();
                scanner.nextLine();
                if (guessNumber == randNumber){
                    System.out.println("You won! The random number is indeed " + randNumber + "\n");
                    break;
                } else {
                    System.out.println("Wrong guess. You have " + (i-1) + " attempts left");
                }
            }
            if (guessNumber != randNumber){
                System.out.println("You lost. The true random number was " + randNumber);
            }
            System.out.print("Would you like to play again? Y/N: ");
            gameRepeat = scanner.nextLine();
        } while (gameRepeat.equals("y") || gameRepeat.equals("Y") || gameRepeat.equals("yes") || gameRepeat.equals("Yes"));
        System.out.println("Game over");
        System.exit(0);
    }
}
