package machine;
import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);

    static int water;
    static int milk;
    static int beans;
    static int cash;
    static int cups;

    public static void main(String[] args) {
        water = 400;
        milk = 540;
        beans = 120;
        cash = 550;
        cups = 9;
        boolean operatng = true;
        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String action = scanner.next();

            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    printStatus();
                    break;
                case "exit":
                    operatng = false;
                    break;
                default:
                    System.out.println("Error! There's no such action: ");
                    break;
            }
        } while (operatng);
    }

    public static boolean checkResources(int waterOne, int milkOne, int beansOne) {
        if (
                water - waterOne > 0 &&
                milk - milkOne > 0 &&
                beans - beansOne > 0
        ) {
            System.out.println("I have enough resources, making you a coffee!");
            return true;
        } else if (water - waterOne < 0) {
            System.out.println("Sorry, not enough water!");
            return false;
        } else if (milk - milkOne < 0) {
            System.out.println("Sorry, not enough milk!");
            return false;
        } else {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
    }

    public static void printStatus() {
        System.out.println("The coffee machine has:");
        System.out.printf("%d of water%n", water);
        System.out.printf("%d of milk%n", milk);
        System.out.printf("%d of coffee beans%n", beans);
        System.out.printf("%d of disposable cups%n", cups);
        System.out.printf("$%d of money%n", cash);
    }

    public static void makeCoffee(int typeOfCoffee) {
        if (typeOfCoffee == 1 && checkResources(250, 0, 16)) {
            water-= 250;
            beans-= 16;
            cash+= 4;
            cups-=1;
        } else if (typeOfCoffee == 2 && checkResources(350, 75, 20)) {
            water-= 350;
            milk-= 75;
            beans-= 20;
            cash+= 7;
            cups-=1;
        } else if (checkResources(200, 100, 12)) {
            water-= 200;
            milk-= 100;
            beans-= 12;
            cash+= 6;
            cups-=1;
        }
    }

    public static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                makeCoffee(1);
                break;
            case "2":
                makeCoffee(2);
                break;
            case "3":
                makeCoffee(3);
                break;
            case "back":
                break;
            default:
                System.out.println("Error! Wrong type of coffee");
                break;
        }
    }
    public static void fill(){
        //printStatus();
        System.out.println("Write how many ml of water do you want to add:");
        water+= scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk+= scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        beans+=scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        cups+=scanner.nextInt();
    }

    public static void take(){
        System.out.printf("I gave you $%d%n", cash);
        cash-=cash;
    }
}
