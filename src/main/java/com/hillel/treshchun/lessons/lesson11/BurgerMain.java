package com.hillel.treshchun.lessons.lesson11;

public class BurgerMain {
    public static void main(String[] args) {

        Burger burger1 = new Burger();
        Burger burger2 = new Burger("diet");
        Burger burger3 = new Burger("double");
        Burger burger4 = new Burger("triple");


        Burger burger5 = new Burger(true, 2, true, true, true);

        Burger burger6 = new Burger (false, -56, true, false, true);
        Burger burger7 = new Burger (true, 4, true, true, true);


    }
}
