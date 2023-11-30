package com.hillel.treshchun.lessons.lesson4;

public class HW5 {
    public static void main(String[] args) {

        int liInfntryAssault = 13;
        int liArcherAssault = 24;
        int liKnightAssault = 46;

        int minInfantryAssault = 9;
        int minArcherAssault = 35;
        int minKnightAssault = 12;

        double liToMinRatio = 1.5;

        int liPerTypeCount = 860;

        double liPower = liPerTypeCount * (liInfntryAssault + liArcherAssault + liKnightAssault);
        double minPower = liPerTypeCount * liToMinRatio * (minInfantryAssault + minArcherAssault + minKnightAssault);

        System.out.println("Li total army assault power = " + liPower);
        System.out.println("Min total army assault power = " + minPower);
        System.out.println(liPower > minPower ? "Li Army shall win!" : "Min Army shall win!");



    }
}
