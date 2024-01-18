package com.hillel.treshchun.lessons.lesson12.HW14_fitnessTracker;

public class User {

    private final String firstName;
    private final int birthYear;
    private final int birthMonth;
    private final int birthDay;
    private final int age;
    private final String email;
    private final String phoneNumber;

    private String lastName;
    private int weight;
    private String bloodPressure;
    private int stepsCount;

    public User(String firstName, String lastName, int birthYear, int birthMonth, int birthDay, String email, String phoneNumber, int weight, String bloodPressure, int stepsCount) {
        this.firstName = (firstName == null || firstName.isBlank() || firstName.isEmpty()) ? "N/A" : firstName;
        this.lastName = (lastName == null || lastName.isBlank() || lastName.isEmpty()) ? "N/A" : lastName;
        this.birthYear = (birthYear > 0 && birthYear < 2025) ? birthYear : 2024;
        this.birthMonth = (birthMonth > 0 && birthMonth < 13) ? birthMonth : 1;
        this.birthDay = (birthDay > 0 && birthDay < 31) ? birthDay : 1;
        age = 2024 - this.birthYear;
        this.email = (email == null || email.isBlank() || email.isEmpty()) ? "N/A" : email;
        this.phoneNumber = (phoneNumber == null || phoneNumber.isBlank() || phoneNumber.isEmpty()) ? "N/A" : phoneNumber;
        this.weight = (weight > 0) ? weight : 0;
        this.bloodPressure = (bloodPressure == null || bloodPressure.isBlank() || bloodPressure.isEmpty()) ? "N/A" : bloodPressure;
        this.stepsCount = (stepsCount > 0) ? stepsCount : 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public int getWeight() {
        return weight;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public int getStepsCount() {
        return stepsCount;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank() || lastName.isEmpty()) {
            System.out.println("Void name entry attempt, value not changed");
        } else {
            this.lastName = lastName;
        }
    }

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
        else {
            System.out.println("Weight cannot be less than 0 Newtons");
        }
    }

    public void setBloodPressure(String bloodPressure) {
        if (bloodPressure == null || bloodPressure.isBlank() || bloodPressure.isEmpty()) {
            System.out.println("Void pressure entry attempt, value not changed");
        } else {
            this.bloodPressure = bloodPressure;
        }
    }

    public void setStepsCount(int stepsCount) {
        if (stepsCount >= 0) {
            this.stepsCount = stepsCount;
        }
        else {
            System.out.println("Steps count cannot be less than 0");
        }
    }

    public void printAccountInfo () {
        System.out.println("Account Name: " +
                firstName + " " + lastName +
                ",  DOB(d.m.y): " + birthDay + "." + birthMonth + "." + birthYear +
                ",  Age: " + age +
                ",  Email: " + email +
                ",  Phone number: " + phoneNumber +
                ",  Weight: " + weight +
                ",  Blood pressure: " + bloodPressure +
                ",  Steps today: " + stepsCount);
    }


}
