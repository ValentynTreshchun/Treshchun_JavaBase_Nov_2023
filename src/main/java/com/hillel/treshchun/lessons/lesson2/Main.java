package com.hillel.treshchun.lessons.lesson2;

public class Main {
    public static void main(String[] args) {
        byte agePerson;

        byte agePerson2 = 25;

//        System.out.println(agePerson2);

//        short shortVariable = 32555;
//        int intVariable = 2147000000;
//
//        long longVariable = 2147000000000l;
//
//        System.out.println(1);

//        float floatVariable = 11.123456789123456F;
//        double doubleVariable = 11.1234567891123456;
//
//        System.out.println(floatVariable);
//        System.out.println(doubleVariable);
//
//        System.out.println(1.111111111111111111111111111F);

        char charA = 'A';
        char charA2 = 65;
        char charA3 = '\u2145';
        char degreeSymbol = '\u00B0';

//        System.out.println(charA);
//        System.out.println(charA2);
//        System.out.println(charA3);
//        System.out.println("йїїваваыы");
//        System.out.println(degreeSymbol);

//        boolean isOk = true;
//
//        int age = 30;
//        String name = "Text of any length";
//
//        System.out.println(age);
//        System.out.println(name);
//
//        Integer a2 = 25; // this is a reference type for int
//
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Byte.MAX_VALUE);

        Integer a1 = 125;
        Integer a2 = 125;

        Integer b1 = 135;
        Integer b2 = 135;

        System.out.println(a1 == a2);
        System.out.println(b1 == b2);

        // Integer pool takes only values from -128 to +127

        // Automatic casting

        byte byteVariable = 25;

        short shortVar = byteVariable;
        long longVar = byteVariable;

        double doubleVar = byteVariable;

//        System.out.println(byteVariable);
//        System.out.println(shortVar);
//        System.out.println(longVar);

        System.out.println(doubleVar);

        // Manual casting

//        int intVar = 127;
//
//        byte byteVar = intVar;
//        byte byteVar = (byte) intVar;

//        System.out.println(byteVar);

        int intVar2 = -129;
        byte byteVar2 = (byte) intVar2;
        System.out.println(byteVar2);

 //        Data loss takes place here

        int intVar3 = byteVar2;

        System.out.println(intVar3);

//     Char into integer conversion example

        int intVarA = charA;

        System.out.println(intVarA);

        double doubleVar2 = 3.14;
        intVar2 = (int) doubleVar2;

        System.out.println(intVar2);

        System.out.println(1 + 1 + " qwe ");
        System.out.println(" qwe " + 1 + 1);
        System.out.println(" qwe " + doubleVar2);

 //       some symbols require so-called screening (use of an extra \) as they are part of Java synatax
 //       printing these symbols with unicode will also not work with these three symbols. this is because
 //       runtime just adds the extra special symbol, which is not accepted by the program, is considered an error
 //       "empty character literal"

        char ch = '\'';
        char ch2 = '\"';
        char ch3 = '\\';


    }
}
