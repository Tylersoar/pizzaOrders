package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        pizzasize();

        toppings();


    }

    private static void toppings() {
        Scanner input = new Scanner();
        System.out.println("how many toppings would you like? ");
        int toppingAmount = input.;
        final double topping = 1.25;
    }

    private static void pizzasize() {
        double price


        Scanner input = new Scanner();


        System.out.println("what size pizza would you like - Small, Medium, Large");
        String order = input.nextLine();
        if (order.equals("small")) {
            price = 7.99;
        }
        else if (order.equals("medium")){
            price = 10.99;
        }
        else if (order.equals("large")){
            price = 13.99;
        }
        else{
            System.out.println("Please enter a valid size, try again.");
        }
        return price;
    }
}
