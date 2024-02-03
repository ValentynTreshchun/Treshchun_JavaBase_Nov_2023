package com.hillel.treshchun.lessons.lesson16;

import java.util.Arrays;

public class HW18Arrays {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3};
        int [] arrD = {1, 2, 3, 4};
        int [] arrN = null;
        int [][] arrNN = null;
        int [][] arr2_2 = {{1, 2},{3, 4}};
        int [][] arr3_2 = {{1, 2},{3, 4},{5, 6}};
        int [][] arrR = {{1, 2},{3, 4, 7},{5, 6}};



        System.out.println("Average round = " + Average(arr));
        System.out.println("Average double = " + Average(arrD));
        System.out.println("Average if empty = " + Average(arrN));

        System.out.println("Arr2_2" + Arrays.deepToString(arr2_2));
        System.out.println("Arr2 is square = " + IsSquare(arr2_2));

        System.out.println("Arr3_2" + Arrays.deepToString(arr3_2));
        System.out.println("Arr3 is square = " + IsSquare(arr3_2));

        System.out.println("ArrN" + Arrays.deepToString(arrNN));
        System.out.println("ArrN is square = " + IsSquare(arrNN));

        System.out.println("Weird array" + Arrays.deepToString(arrR));
        System.out.println("ArrR is square = " + IsSquare(arrR));


    }

    public static double Average (int [] array) {
//        calculates average for a one-dimensional array of ints, returns double
//        if null, return -1

        if (array == null) {
            return -1;
        }
        double average;
        int sum = 0;
        for (int array2 : array
             ) {
                sum += array2;
        }
        average = (double) sum / array.length;
        return average;
    }


    public static boolean IsSquare (int [][] array) {

        if (array == null) {
            return false;
        }
        boolean L = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i].length != array.length) {
                return false;
            }
        }
         return L;
    }
}
