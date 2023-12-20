package com.hillel.treshchun.lessons.lesson7;

import java.util.Arrays;

public class HW9 {
    public static void main(String[] args) {
        int [] team1 = new int [25];
        int [] team2 = new int [25];
        int sum = 0;
        double avgAge1 = 0;
        double avgAge2 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + (int)(Math.random()*23);
            sum += team1[i];
        }
        avgAge1 = (double)sum / team1.length;

        sum = 0;

        for (int i = 0; i < team2.length; i++) {
            team2[i] = 18 + (int)(Math.random()*23);
            sum += team2[i];
        }
        avgAge2 = (double)sum / team2.length;

        System.out.println("Team 1 age values: " + Arrays.toString(team1));
        System.out.println("Team 1 average age = " + avgAge1);
        System.out.println("Team 2 age values: " + Arrays.toString(team2));
        System.out.println("Team 2 average age = " + avgAge2);


    }
}
