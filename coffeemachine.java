import java.util.Scanner;
public class coffeemachine {
    public static int water = 400, milk = 540, coffeeBeans = 120, disposableCups = 9, money = 550;
    public static Scanner input = new Scanner(System.in);

    public static void remaining() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water" );
        System.out.println(milk + " of milk");
        System.out.println(coffeeBeans + " of coffee beans");
        System.out.println(disposableCups + " of disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        water += input.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += input.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffeeBeans += input.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        disposableCups += input.nextInt();
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String in1 = input.next();
        switch (in1) {
            case "1":
                if (water >= 250 && coffeeBeans >= 16 && disposableCups >= 1) {
                System.out.println("I have enough resources, making you a coffee!");
                money += 4;
                disposableCups -= 1;
                water -= 250;
                coffeeBeans -= 16;
                }
                else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "2":
                if (water >=350 && coffeeBeans >= 20 && milk >= 75 && disposableCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    money += 7;
                    water -= 350;
                    coffeeBeans -= 20;
                    milk -= 75;
                    disposableCups -= 1;
                }
                else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "3":
                if (water >=200 && coffeeBeans >= 12 && milk >= 100 && disposableCups >= 1) {
                    System.out.println("I have enough resources, making you a coffee!");
                    money += 6;
                    water -= 200;
                    coffeeBeans -= 12;
                    milk -= 100;
                    disposableCups -= 1;
                }
                else {
                    System.out.println("Sorry, not enough water!");
                }
                break;
            case "back":
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println("Write action (buy, fill, take, remaining, exit) :");
        String in1 = input.next().toLowerCase();
        while (!in1.equals("exit")) {
            if (in1.equals("buy")) {
                buy();
            }
            if (in1.equals("fill")) {
                fill();
            }
            if (in1.equals("take")) {
                take();
            }
            if (in1.equals("remaining")) {
                remaining();
            }
            System.out.println("Write action (buy, fill, take, remaining, exit) :");
            in1 = input.next().toLowerCase();
        }
    }
}