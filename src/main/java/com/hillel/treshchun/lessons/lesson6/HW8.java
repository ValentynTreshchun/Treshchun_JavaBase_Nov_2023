package com.hillel.treshchun.lessons.lesson6;

import java.util.Scanner;

public class HW8 {
    public static void main(String[] args) {
        int shipsAmount;
        int controlSum = 0;
        int unluckyOne = 4;
        int unluckyTwo = 9;
        boolean luckyBothEntered = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to the JP ships number registration application\nPlease enter two unlucky numbers separated with a space: ");
        while (!luckyBothEntered){
            boolean second = true;
            while (!scanner.hasNextInt()){
                System.out.print("Wrong data in first position, please enter two integers again, separated by a space: ");
                scanner = new Scanner(System.in);
            }
            unluckyOne = scanner.nextInt();
            System.out.println("first unlucky = " + unluckyOne);
            while (!scanner.hasNextInt()){
                System.out.print("Wrong data in second position, please enter two integers again, separated by a space: ");
                second = false;
                scanner = new Scanner(System.in);
            }
            if (second) {
                unluckyTwo = scanner.nextInt();
                System.out.println("second unlucky = " + unluckyTwo);
                luckyBothEntered = true;
            }
        }
//        unluckyOne = scanner.nextInt();
//        unluckyTwo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Unlucky numbers in this batch are " + unluckyOne + " and " + unluckyTwo);

        System.out.print("Please enter the amount of ships you would like to register (0 - 2^31):");
        while (!scanner.hasNextInt()){
            System.out.println("Wrong data entered, please enter an integer: ");
            scanner = new Scanner(System.in);
        }
        shipsAmount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A number will be assigned to " + shipsAmount + " ships.");

        for (int i = 1; i <= shipsAmount; i++) {
            int j = i;
            boolean isLucky = true;
            while (j/10 > 0 || j % 10 > 0) {
                if (j % 10 != unluckyOne && j % 10 != unluckyTwo) {
                    j /= 10;
                }
                else {
                    isLucky = false;
                    ++ shipsAmount;
                    break;
                }
            }
            if (isLucky) {
                System.out.println(i);
                ++ controlSum;
            }
        }
        System.out.println("Total ship registration numbers assigned: " + controlSum);
    }
}
