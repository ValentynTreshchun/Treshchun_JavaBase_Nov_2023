package com.hillel.treshchun.lessons.lesson14.HW16;

public class Androids implements Smartphones, AndroidOS {

    private final String modelName;

    public Androids(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void call() {
        System.out.println(OSname + " based phone is calling");
    }
    @Override
    public void sms() {
        System.out.println(OSname + " based phone is sending an SMS");

    }
    @Override
    public void internet() {
        System.out.println(OSname + " based phone is accessing internet");

    }

    @Override
    public String getOSName() {
        return OSname;
    }

    public String getModelName() {
        return modelName;
    }
}
