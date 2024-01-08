package com.hillel.treshchun.lessons.lesson11;

public class Person {

    public static void main(String[] args) {
        System.out.println(personInfo("Val", "Tre", "Kyiv", "+38-097-456-78-90"));
        System.out.println(personInfo("Jan", "Karvanek", "Praha", "+420-998-734-65"));
        System.out.println(personInfo("John", "Doe", "Corpus Christi", "+1361-985-1181"));
    }

    static String personInfo (String fName, String lName, String city, String phoneNumber) {
        return "Зателефонувати громадянину " + fName + " " + lName + " із міста " + city + " можна за номером " + phoneNumber;
    }
}
