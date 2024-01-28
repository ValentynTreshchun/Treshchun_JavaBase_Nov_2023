package com.hillel.treshchun.lessons.lesson14.HW16;

public class iPhones implements Smartphones, IOS {

    private final String modelName;

    public iPhones(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void call() {
        System.out.println(OSname + " based phone is dialling a phone number");
    }

    @Override
    public void sms() {
        System.out.println(OSname + " based phone is sending a text message");
    }

    @Override
    public void internet() {
        System.out.println(OSname + " based phone is now in a hotspot state");
    }

    @Override
    public String getOSName() {
        return OSname;
    }

    public String getModelName() {
        return modelName;
    }
}
