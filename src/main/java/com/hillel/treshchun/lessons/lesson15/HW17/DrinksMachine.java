package com.hillel.treshchun.lessons.lesson15.HW17;

public enum DrinksMachine {

    COFFEE("COFFEE", 50),
    TEA("TEA", 45),
    LEMONADE("LEMONADE",60),
    MOHITO("MOHITO",60),
    SODA("SODA POP", 35),
    COCA_COLA("COCA-COLA", 40);

    private final String name;
    private final int price;

    DrinksMachine(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
