package com.hillel.treshchun.lessons.lesson11;

public class Burger {
    boolean buns;
    int meat;
    boolean cheese;
    boolean salad;
    boolean mayonnaise;

    public Burger() {
        this(true, 1, true, true, true);
    }

    public Burger(boolean buns, int meat, boolean cheese, boolean salad, boolean mayonnaise) {
        this.buns = buns;
        if (meat > 0) this.meat = meat; else {
            this.meat = 0;
        }
        this.cheese = cheese;
        this.salad = salad;
        this.mayonnaise = mayonnaise;
        System.out.println(toString(true));
    }

    public Burger(String defaultType) {
        if (defaultType == null) {
            System.out.println("Empty string passed. A standard burger will be created.");
            buns = true;
            meat = 1;
            cheese = true;
            salad = true;
            mayonnaise = true;
            System.out.println(toString(true));
        } else if (defaultType.equalsIgnoreCase("double")) {
            buns = true;
            meat = 2;
            cheese = true;
            salad = true;
            mayonnaise = true;
            System.out.println(toString(true));
        }
        else if (defaultType.equalsIgnoreCase("diet")) {
            buns = true;
            meat = 1;
            cheese = true;
            salad = true;
            mayonnaise = false;
            System.out.println(toString(true));
        }
        else {
            System.out.println("Unsupported default burger type entered. A standard burger will be created.");
            buns = true;
            meat = 1;
            cheese = true;
            salad = true;
            mayonnaise = true;
            System.out.println(toString(true));
        }
    }

    @Override
    public String toString() {
        return "Burger{" +
                "buns: " + buns +
                ", meat: " + meat +
                "pc, cheese:" + cheese +
                ", salad:" + salad +
                ", mayonnaise:" + mayonnaise +
                '}';
    }

    public String toString(boolean compact) {
        String contents ="";
        if (!compact) return toString();
        else {
            if (buns) contents += "buns;";
            if (meat > 0) contents += (" meat " + meat + "pc;");
            if (cheese) contents += " cheese;";
            if (salad) contents += " salad;";
            if (mayonnaise) contents += " mayonnaise;";
            if (contents.isEmpty()) return "Burger is void;";
            else {
                return "Burger: " + contents;
            }
        }
    }
}
