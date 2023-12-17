package com.hillel.treshchun.lessons.lesson6;

import java.util.Scanner;

public class Stream_int_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        System.out.println("Enter your guess: ");
        while (!scanner.hasNextInt()){
            System.out.print("\nWrong data entered, please enter an integer: ");
//            if the user enters more than one \n in console, this cycle will repeat '\n' + 1 times.
//            what is the correct way to clear the input?
            scanner.nextLine();
//            scanner = new Scanner(System.in);
        }
        a = scanner.nextInt();
        scanner.nextLine();
        System.out.println("A = " + a);
    }
}
