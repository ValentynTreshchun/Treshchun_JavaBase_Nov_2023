package com.hillel.treshchun.lessons.lesson12.HW14_fitnessTracker;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("John", "Doe",1970,1,1,"johndoe@yahoo.com","+178956734",75,"60/120",666);
        user1.printAccountInfo();
        user1.setStepsCount(777);
        user1.printAccountInfo();
        System.out.println("User" + user1.getFirstName() + " " + user1.getLastName() + " is " + user1.getAge() + " years old in 2024");

        User user2 = new User("Jane","Doe",1975,10,25,"jane_doe@bing.com","+7985345673",47,"70/130",543);
        user2.printAccountInfo();

        User user3 = new User("James","Gosling",1955,5,19,"jamesgosling@oracle.com","+1987234765",115,"90/170",67);
        user3.setWeight(-105);

        User user4 = new User("","",2026,13,32,"atleastanemail@mail.com","",-34,"",-453);
        user4.printAccountInfo();

        user4.setStepsCount(10256);
        user4.printAccountInfo();

        user4.setStepsCount(-1);
        user4.printAccountInfo();

    }
}
