package com.hillel.treshchun.lessons.lesson14.HW16;

public class Main {

    public static void main(String[] args) {

        Androids samsung = new Androids("Galaxy s5");
        iPhones iPhone = new iPhones("SE 8");

        samsung.call();
        samsung.sms();
        samsung.internet();

        iPhone.call();
        iPhone.sms();
        iPhone.internet();

        System.out.println("Phone " + samsung.getModelName() + " is based on " + samsung.getOSName());
        System.out.println("Phone " + iPhone.getModelName() + " is based on " + iPhone.getOSName());

    }
}
