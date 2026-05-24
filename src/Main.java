import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Shopping Cart Program
        Scanner scanner = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = 0;
        double total;

        System.out.print("What item would you like to buy? ");
        item = scanner.nextLine();
        System.out.println("What is the price of the item?");
        price = scanner.nextDouble();
        System.out.println("How many would you like? ");
        quantity = scanner.nextInt();

        total = price * quantity;
        System.out.println("\n You have bought " + quantity + " " + item + " /s" );
        System.out.println("Your total is " + currency + total);

        //Mad Libs Game
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb2 = "elegant";
        String adjective3;

        System.out.println("Enter an adjective(description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun(animal or person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective(description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter an adjective(description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\n Today I went to a " + adjective1 + " zoo");
        System.out.println("In an exhibit I saw a " + noun1 + ".");
        System.out.println("The " + noun1 + " was " + adjective2 + " and " + verb2 + "!");
        System.out.println("I was " + adjective3 + "!");


        scanner.close();

    }
}