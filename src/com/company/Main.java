package com.company;
import java.util.Scanner;
public class Main {
    private static double price;
    private static String order;
    private static double totalToppings = 0;
    private static String toppings = "";


    public static void main(String[] args) {

        pizzasize();

        toppings();

        pizzaamount();


    }

    private static void toppings() {
        String toppingChoice;
        char userInput;
        double numberOfToppings = 0;
        double price = 1.25;

        Scanner input = new Scanner(System.in);

        System.out.println("how many toppings would you like?");
        System.out.println("(2 toppings are free) additional toppings cost £1.25 each."
                + " Choose from:");
        System.out.println("Cheese, Pepperoni, Mushroom, Pineapple");

        System.out.println("Would you like cheese? (Y/N)");
        toppingChoice = input.nextLine();
        userInput = toppingChoice.charAt(0);
        if (toppingChoice.equalsIgnoreCase("y")) {
            numberOfToppings += 1;
            toppings = toppings + "Cheese";
        }
         else if (toppingChoice.equalsIgnoreCase("n")) {
            numberOfToppings += 0;
        }
         else {
            System.out.println("Please enter only (Y/N)");
            System.out.println("Would you like Cheese? (Y/N)");
            toppingChoice = input.nextLine();
        }




        System.out.println("Would you like Pepperoni? (Y/N)");
        toppingChoice = input.nextLine();
        userInput = toppingChoice.charAt(0);
        if (toppingChoice.equalsIgnoreCase("y")) {
            numberOfToppings += 1;
            toppings = toppings + "Pepperoni, ";
        }
        else if (toppingChoice.equalsIgnoreCase("n")) {
            numberOfToppings += 0;
        }
        else{
            System.out.println("Please enter only (Y/N)");
            System.out.println("Would you like Pepperoni? (Y/N)");
            toppingChoice = input.nextLine();
        }


        System.out.println("Would you like Mushroom? (Y/N)");
        toppingChoice = input.nextLine();
        userInput = toppingChoice.charAt(0);
        if (toppingChoice.equalsIgnoreCase("y")) {
            numberOfToppings += 1;
            toppings = toppings + "Mushroom, ";
        }
         else if (toppingChoice.equalsIgnoreCase("n")) {
            numberOfToppings += 0;
        }
        else{
            System.out.println("Please enter only (Y/N)");
            System.out.println("Would you like Mushroom, ? (Y/N)");
            toppingChoice = input.nextLine();
        }


        System.out.println("Would you like Pineapple? (Y/N)");
        toppingChoice = input.nextLine();
        userInput = toppingChoice.charAt(0);
        if (toppingChoice.equalsIgnoreCase("y")){
            numberOfToppings += 1;
            toppings = toppings + "Pineapple.";
        }
         else if (toppingChoice.equalsIgnoreCase("n")) {
            numberOfToppings += 0;
        }
        else{
            System.out.println("Please enter only (Y/N)");
            System.out.println("Would you like Pineapple? (Y/N)");
            toppingChoice = input.nextLine();
        }


       if (numberOfToppings <= 2) {
           price = 0;
           totalToppings = numberOfToppings * price;

       }
       else{
           totalToppings = numberOfToppings * price;

       }

    }

    private static void pizzasize() {
        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.println("what size pizza would you like - Small, Medium, Large");
            order = input.nextLine();

            if (order.equalsIgnoreCase("small")) {
                price = 7.99;
                break;
            } else if (order.equalsIgnoreCase("medium")) {
                price = 10.99;
                break;
            } else if (order.equalsIgnoreCase("large")) {
                price = 13.99;
                break;
            } else {
                System.out.println("Please enter a valid size, try again.");
            }

        }
    }

    private static void pizzaamount() {
        while (true) {
            Scanner input = new Scanner(System.in);

            System.out.println("How many pizzas would you like?");

            int pizzaTotal = input.nextInt();

            if (pizzaTotal >= 6) {
                System.out.println("That's too many pizzas please enter a smaller amount.");
            } else {
                System.out.println(pizzaTotal + " pizzas added to your total");

                double totalPizza = price * pizzaTotal + totalToppings;

                System.out.println("Your Order currently is: ");
                System.out.println(order + " pizza");
                System.out.println("with: " + toppings);

                System.out.println("your total is: £" + totalPizza);

                break;


            }

        }
    }
}

