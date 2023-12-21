package com.hillel.treshchun.lessons.lesson8;

import java.util.Arrays;
import java.util.Scanner;

public class HW10 {
    public static void main(String[] args) {
        final int lotLen = 7;
        int [] lotteryNum = new int [lotLen];
        int [] playerNum = new int [lotLen];
        int coincidentCount;                            // a variable to store the number of coincidences
        int [] coincidentIndex = new int [lotLen];      // an array to store indexes of numbers that matched
        Scanner scanner = new Scanner(System.in);
        String gameRepeat;

        System.out.println("Welcome to the lottery game!");

        // we know that both arrays are the same so I used one for cycle to fill them both.
        // if the size was different, I would need to use two separate cycles.
        // filling both arrays with random numbers 0-9
        do {
            for (int i = 0; i < lotteryNum.length; i++) {
                lotteryNum[i] = (int) (Math.random() * 10);
                playerNum[i] = (int) (Math.random() * 10);
            }

            // Sorting the first array using insertion method

            for (int i = 1; i < lotteryNum.length; i++) {
                int temp = lotteryNum[i];
                int j = i - 1;
                while (j >= 0 && lotteryNum[j] > temp) {
                    lotteryNum[j + 1] = lotteryNum[j];
                    j--;
                }
                lotteryNum[j + 1] = temp;
            }

            // Sorting the second array using insertion method

            for (int i = 1; i < playerNum.length; i++) {
                int temp = playerNum[i];
                int j = i - 1;
                while (j >= 0 && playerNum[j] > temp) {
                    playerNum[j + 1] = playerNum[j];
                    j--;
                }
                playerNum[j + 1] = temp;
            }


//        for (int i = 0; i < lotLen; i++) {
//            coincidentIndex[i] = -1;
//        }

            Arrays.fill(coincidentIndex, -1); // method suggested by IntelliJIDEA, so I used it :)

            coincidentCount = 0;

            for (int i = 0; i < lotLen; i++) {
                if (lotteryNum[i] == playerNum[i]) {
                    coincidentCount++;
                    coincidentIndex[i] = i;
                }
            }

            System.out.println("Coincidence count:" + coincidentCount);
            System.out.print("Coincidence indexes:");
            for (int i = 0; i < coincidentIndex.length; i++) {
                if (coincidentIndex[i] != -1) {
                    System.out.print(" " + i);
                }
            }
            System.out.println();
            System.out.println("\nControl section. Sorted arrays:");
            System.out.println("Lottery numbers: " + Arrays.toString(lotteryNum));
            System.out.println("Player numbers:  " + Arrays.toString(playerNum));

            System.out.println("Would you like to play again?: ");
            gameRepeat = scanner.nextLine();

        } while (gameRepeat.equals("y") || gameRepeat.equals("Y") || gameRepeat.equals("yes") || gameRepeat.equals("Yes"));
        System.out.println("Game over");

    }
}
