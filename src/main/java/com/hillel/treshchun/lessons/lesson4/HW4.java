package com.hillel.treshchun.lessons.lesson4;

public class HW4 {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;
        int c = 3;
        char unit = 'm';
        String volumeUnit = "m^3";

        int volumeABC = a * b * c;
        int lengthABC = 4 * (a + b + c);

        System.out.println("Об'єм паралелепіпеда = " + volumeABC + ' ' + unit);
        System.out.println("Периметр паралелепіпеда = " + lengthABC + ' ' + volumeUnit);

    }
}
