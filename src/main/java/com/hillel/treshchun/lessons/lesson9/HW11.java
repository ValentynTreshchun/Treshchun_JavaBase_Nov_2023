package com.hillel.treshchun.lessons.lesson9;

import java.util.Arrays;
import java.util.Scanner;

public class HW11 {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        int z = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Transponding a 2D and 3D matrix.\nEnter number of planes: ");
        while (!scanner.hasNextInt()){
            System.out.print("Wrong data entered, please enter an integer: ");
            scanner.nextLine();
        }
        x = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter number of rows: ");
        while (!scanner.hasNextInt()){
            System.out.print("Wrong data entered, please enter an integer: ");
        }
        y = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter number of columns: ");
        while (!scanner.hasNextInt()){
            System.out.print("Wrong data entered, please enter an integer: ");
        }
        z = scanner.nextInt();
        scanner.nextLine();

        int [][][] matrix3D = new int [x][y][z];
        System.out.println("Generated matrix:");

//        Generating matrix with consequent numerals
        int f = 1;
        for (int i = 0; i < matrix3D.length; i++) {
            System.out.println("Plane " + (i+1));
            for (int j = 0; j < matrix3D[0].length; j++) {
                for (int k = 0; k < matrix3D[0][0].length; k++) {
//                    matrix3D[i][j][k] = (int)(Math.random() * 10);
                    matrix3D[i][j][k] = f;
                    f++;
                    System.out.print(matrix3D[i][j][k] + "\t");
                }
                System.out.println();
            }
        }
        
        int [][] transp2D = new int [matrix3D[0][0].length][matrix3D[0].length];

//        Transponding a 2d matrix from the first plane of the generated 3D matrix:

        for (int i = 0; i < matrix3D[0].length; i++) {
            for (int j = 0; j < matrix3D[0][0].length; j++) {
                transp2D[j][i] = matrix3D[0][i][j];
            }
        }

//        Printing the transponded 2D matrix:
        System.out.println("\n------------------------\n1) Transponding 2D matrix from Plane 1:");
        for (int i = 0; i < transp2D.length; i++) {
            for (int j = 0; j < transp2D[0].length; j++) {
                System.out.print(transp2D[i][j] + "\t");
            }
            System.out.println();
        }

//        Transponding a 3d matrix [i][j][k] -> [k][i][j]:

        int [][][] transp3D = new int [matrix3D[0][0].length][matrix3D.length][matrix3D[0].length];
        for (int i = 0; i < matrix3D.length; i++) {
            for (int j = 0; j < matrix3D[0].length; j++) {
                for (int k = 0; k < matrix3D[0][0].length; k++) {
                    transp3D[k][i][j] = matrix3D[i][j][k];
                }
            }
        }

//        Printing a transponded 3d matrix:
        System.out.println("\n------------------------\n2) Transponded 3D matrix [" + x + "][" + y + "][" + z + "] -> [" + z + "][" + x + "][" + y +"]:" );
        for (int i = 0; i < transp3D.length; i++) {
            System.out.println("Plane " + (i+1));
            for (int j = 0; j < transp3D[0].length; j++) {
                for (int k = 0; k < transp3D[0][0].length; k++) {
                    System.out.print(transp3D[i][j][k] + "\t");
                }
                System.out.println();
            }
        }

    }
}
