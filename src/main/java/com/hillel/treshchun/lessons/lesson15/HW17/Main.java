package com.hillel.treshchun.lessons.lesson15.HW17;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ok = false;
        String choice = null;
        int billTotal = 0;
        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinks = DrinksMachine.values();

        while (choice == null) {
            System.out.println("Select drink from list: " + Arrays.toString(DrinksMachine.values()) + " or enter 'stop' to exit");
            while (!ok) {
                choice = scanner.nextLine().toUpperCase();
                for (DrinksMachine drink : drinks) {
                    if (drink.toString().equals(choice)) {
                        billTotal += makeDrink(drink);
                        ok = true;
                        break;
                    } else if (choice.equals("STOP")) {
                        ok = true;
                        break;
                    }
                }
                if (!ok) {
                    System.out.println("Option " + choice.toUpperCase() + " is not available, try again");
                }
            }
            ok = false;
            System.out.println("Would you like to order another drink? Y/N: ");
            choice = scanner.nextLine().toUpperCase();
            if (choice.equals("Y") || choice.equals("YES")) {
                choice = null;
            }

        }

        System.out.println(Drinks.counter + " Drinks ordered. Total bill: " + billTotal + " UAH");

    }

    static int makeDrink (DrinksMachine drink) {

        Drinks localDrink = new Drinks(drink);
        System.out.println("Drink " + localDrink.drinkType.getName() + " (" + localDrink.drinkType.getPrice() + " UAH) ordered");
        Drinks.counter++;
        return localDrink.drinkType.getPrice();
//        switch (drink) {
//            case COFFEE: {
//                Drinks.counter++;
//                System.out.println("One " + drink.getName() + " ordered");
//
//                return drink.getPrice();
//            }
//            case TEA: {
//                Drinks.counter++;
//                System.out.println("One tea ordered");
//                return drink.getPrice();
//            }
//            default: {
//                return -1;
//            }
//        }

    }
}

