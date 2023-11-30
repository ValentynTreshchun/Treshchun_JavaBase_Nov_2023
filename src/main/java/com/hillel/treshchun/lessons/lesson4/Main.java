package com.hillel.treshchun.lessons.lesson4;

public class Main {
    public static void main(String[] args) {
//        System.out.println(10 + 5);
//        System.out.println(10 - 5);
//        System.out.println(10 * 5);
//        System.out.println(10 / 5);
//
//        int a = 10;
//        int b = 3;
//
//        System.out.println(a + b);
//        System.out.println(a - b);
//        System.out.println(a * b);
//        System.out.println(a / b);

//        hardcoded numbers are int by default. in division operation when both are int,
//        the result will always be int

//        System.out.println(10 / 3);
//        System.out.println(10.0 / 3);
//        System.out.println(10 / 3.0);
//        System.out.println(10.0 / 3.0);
//        System.out.println(10D / 3);
//
//        System.out.println((double)10 / 3);
//        System.out.println((double)a / b);

//        Zelyshok vid dilennya
//        used to determine if a number can be divided by another number without any leftover

//        System.out.println(10 % 3); //10 - 3*3
//        System.out.println(10 % 4); //10 - 4*2
//        System.out.println(10 % 2); //10 - 5*2

//        shortened operators, the right hand side of the "=" operation is performed first;

//        a = a + b;
//        System.out.println(a);
//        a += b;                  // a = a + b;
//        System.out.println(a);
//        a += b + 10;
//        System.out.println(a);
//        a -= b;
//        System.out.println(a);
//        a *= b;
//        System.out.println(a);
//        a /= b;
//        System.out.println(a);

//        Increments amd decrements: postfix - use first, increment after

//        int c = 10;

//        c = c + 1;
//        System.out.println(c);
//        c += 1;
//        System.out.println(c);
//        c++;
//        System.out.println(c);
//        c--;
//        System.out.println(c);

//      Increments amd decrements: prefix   - increment first, use after

//        c = 10;
//
//        System.out.println(c++);
//        System.out.println(++c);
//
//        a = 5;
//        b = 2;
//
//
//        int result = a++ + ++a - ++b;
//
//        System.out.println("result = " + result);
//        System.out.println("a = " + a);
//        System.out.println("b = " + b);
//
//        a = 700;
//        b = 2000;
//        c = 3500;
//
//        int monthsPaid = 12 * 10;
//
//        System.out.println("Salary 1 = " + a * monthsPaid);

//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//
//        System.out.println(Math.abs(10));
//        System.out.println(Math.abs(1F));
//        System.out.println(Math.abs(10D));

//        System.out.println(Math.pow(2, 3)); // this is 2 ^ 3
//        System.out.println(Math.pow(2.2, 3.3));
//        System.out.println(Math.sqrt(9));
//        System.out.println(Math.sqrt(19));

        System.out.println((int) 10.59);

//        Rounds according to standard principle of whether it is more or equal or more than 5

        System.out.println(Math.round(10.19));
        System.out.println(Math.round(10.49));
        System.out.println(Math.round(10.5));
        System.out.println(Math.round(10.99));

//        Returns the smaller of the two numbers

        System.out.println(Math.min(1, 2));

//        Returns the larger of the two numbers

        System.out.println(Math.max(1, 2));

        System.out.println(Math.round(Math.random() * 10));

        int min = 15;
        int max = 35;

        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));
        System.out.println((int)(Math.random() * (max - min +1) + min));




    }
}
