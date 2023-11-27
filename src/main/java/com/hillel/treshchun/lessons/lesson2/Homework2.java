package com.hillel.treshchun.lessons.lesson2;

public class Homework2 {
    public static void main(String[] args) {
//        Створити дві змінні з широтою і довготою вашого поточного
//        розташування або розташування будь-якої пам'ятки у світі; Вивести на екран
//        Pip Ivan observatory
//        48° 2′ 49″ N, 24° 37′ 38″ E
//        48.046944°, 24.627222°
//        Ideal state:
//        The Pip Ivan observatory is located at 48° 2′ 49″ N, 24° 37′ 38″ E
    char degS = '\u00B0';
    char minS = '\'';
    char secS = '\"';

    byte latDeg = 48;
    byte latMin = 2;
    byte latSec = 49;

    byte lonDeg = 24;
    byte lonMin = 37;
    byte lonSec = 38;

    float lonDec = 48.046944F;
    float latDec = 24.627222F;

    String locText = "The Pip Ivan observatory is located at ";
    String locTextDec = "In decimal format: ";

        System.out.print(locText + latDeg + degS + ' ' + latMin + minS + ' ' + latSec + secS + " N,");
//   The following  line starts with an ' ' to avoid an arithmetic operation on byte and char;
        System.out.println(" " + lonDeg + degS + ' ' + lonMin + minS + ' ' + lonSec + secS + " E.");
//  Breaking into two lines for ease of reading
        System.out.println(locTextDec + lonDec + ", " + latDec + '.');

        System.out.println("\nThe same, using concatenated variables:\n");

    String latitude = "" + latDeg + degS + " " + latMin + minS + " " + latSec + secS + " N";
    String longtitude = "" + lonDeg + degS + " " + lonMin + minS + " " + lonSec + secS + " E";

        System.out.println(locText + latitude + " " + longtitude + '.');









    }
}
