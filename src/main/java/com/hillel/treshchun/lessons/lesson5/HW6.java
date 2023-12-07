package com.hillel.treshchun.lessons.lesson5;

import java.util.Scanner;

public class HW6 {
    public static void main(String[] args) {
        String team1Name = "default";

        int t1P1Frags = 0;
        int t1P2Frags = 0;
        int t1P3Frags = 0;
        int t1P4Frags = 0;
        int t1P5Frags = 0;

        String team2Name = "default";

        int t2P1Frags = 0;
        int t2P2Frags = 0;
        int t2P3Frags = 0;
        int t2P4Frags = 0;
        int t2P5Frags = 0;

        double team1AVG = 0;
        double team2AVG = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the latest edition of Counter-Strike! \nEnter the name of the first team and press \"Enter\":");
        team1Name = scanner.nextLine();
        System.out.print("Enter frags value for 5 players of " + team1Name + ", separated by \" \" or by \'Enter\': ");

        if (scanner.hasNextInt()) {
            t1P1Frags = scanner.nextInt();
        } else {
            System.out.println("Error: not an integer entered for player 1");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            t1P2Frags = scanner.nextInt();
        } else {
            System.out.println("Error: not an integer entered for player 2");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            t1P3Frags = scanner.nextInt();
        } else {
            System.out.println("Error: not an integer entered for player 3");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            t1P4Frags = scanner.nextInt();
        } else {
            System.out.println("Error: not an integer entered for player 4");
            System.exit(0);
        }
        if (scanner.hasNextInt()) {
            t1P5Frags = scanner.nextInt();
        } else {
            System.out.println("Error: not an integer entered for player 5");
            System.exit(0);
        }

//        System.out.println("P1: " + t1P1Frags + " P2: " + t1P2Frags + " P3: " + t1P3Frags + " P4: " + t1P4Frags + " P5: " + t1P5Frags);

        System.out.print("Enter the name of the second team and press \"Enter\":");
        scanner.nextLine(); //to avoid getting an empty string. not needed if scanner.next() is used to read the next string

        team2Name = scanner.nextLine(); //or just use scanner.next() here
        System.out.print("Enter frags value for 5 players of " + team2Name + ", separated by \" \" or by \'Enter\': ");

        if (scanner.hasNextInt()){
            t2P1Frags = scanner.nextInt();

            if (scanner.hasNextInt()){
                t2P2Frags = scanner.nextInt();

                if (scanner.hasNextInt()){
                    t2P3Frags = scanner.nextInt();

                    if (scanner.hasNextInt()){
                    t2P4Frags = scanner.nextInt();

                    if (scanner.hasNextInt()){
                        t2P5Frags = scanner.nextInt();
                    } else {
                        System.out.println("Error: not an integer entered for player 5");
                        System.exit(0);
                    }
                    } else {
                        System.out.println("Error: not an integer entered for player 4");
                        System.exit(0);
                    }
                } else {
                    System.out.println("Error: not an integer entered for player 3");
                    System.exit(0);
                }
            } else {
                System.out.println("Error: not an integer entered for player 2");
                System.exit(0);
            }
        } else {
            System.out.println("Error: not an integer entered for player 1");
            System.exit(0);
        }

        team1AVG = (t1P1Frags + t1P2Frags + t1P3Frags + t1P4Frags + t1P5Frags)/5.0;
        team2AVG = (t2P1Frags + t2P2Frags + t2P3Frags + t2P4Frags + t2P5Frags)/5.0;

        if (team1AVG > team2AVG){
            System.out.println("Team " + team1Name + " won with average score: " + team1AVG);
        } else if (team1AVG < team2AVG) {
            System.out.println("Team " + team2Name + " won with average score: " + team2AVG);
        } else {
            System.out.println("It's a draw between " + team1Name + " and " + team2Name + " with avg score = " + team1AVG);
        }

    }
}
