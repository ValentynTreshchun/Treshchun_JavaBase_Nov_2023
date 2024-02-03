package com.hillel.treshchun.lessons.lesson16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestHW18Arrays {

    @Test
    void TestAverage() {
        int [] arr1 = {1, 2, 3};
        double average = HW18Arrays.Average(arr1);
        Assertions.assertEquals(2, average);
    }

    @Test
    void TestAverageDouble() {
        int [] arr1 = {1, 2, 3, 4};
        double average = HW18Arrays.Average(arr1);
        Assertions.assertEquals(2.5, average);
    }

    @Test
    void TestAverageEmpty() {
        int [] arr1 = null;
        double average = HW18Arrays.Average(arr1);
        Assertions.assertEquals(-1, average);
    }

    @Test
    void TestIsSquare() {
        int [][] arr2_2 = {{1, 2},{3, 4}};
        int [][] arr3_2 = {{1, 2},{3, 4},{5, 6}};
        int [][] arr2_3 = {{1, 2, 3},{4, 5, 6}};
        int [][] arrR = {{1, 2},{3, 4, 7},{5, 6}};
        int [][] arrN = null;

        Assertions.assertTrue(HW18Arrays.IsSquare(arr2_2));
        Assertions.assertFalse(HW18Arrays.IsSquare(arr3_2));
        Assertions.assertFalse(HW18Arrays.IsSquare(arr2_3));
        Assertions.assertFalse(HW18Arrays.IsSquare(arrR));
        Assertions.assertFalse(HW18Arrays.IsSquare(arrN));

    }


}
