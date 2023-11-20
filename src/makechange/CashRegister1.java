package makechange;

import java.util.Scanner;

public class CashRegister1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the clerk for the total amount due
        System.out.print("Total amount due: ");
        double price = scanner.nextDouble() * 100;

        // Prompt the clerk for the amount paid by the customer
        System.out.print("Total paid by customer: ");
        double tendered = scanner.nextDouble() * 100;

        // Calculate change
        int change = (int) (tendered - price);
        
        if (change == 0) {
            System.out.println("Exact payment due received. No change needed.");
        } else if (change > 0) {
            if (change < 100) {               
            	System.out.printf("Change to be given: %d¢.%n", change);
            } else {
                System.out.printf("Change to be given: $%d.%02d%n", change/100, change%100);
            }

            // Calculate the number of each denomination
            int twenties = change / 2000;
            change %= 2000;

            int tens = change / 1000;
            change %= 1000;

            int fives = change / 500;
            change %= 500;

            int ones = change / 100;
            change %= 100;

            int quarters = change / 25;
            change %= 25;

            int dimes = change / 10;
            change %= 10;

            int nickels = change / 5;
            change %= 5;

            int pennies = change; // Corrected calculation for pennies

            // Display the change breakdown
            displayDenomination("twenty-dollar bill", twenties);
            displayDenomination("ten-dollar bill", tens);
            displayDenomination("five-dollar bill", fives);
            displayDenomination("one-dollar bill", ones);
            displayDenomination("quarter", quarters);
            displayDenomination("dime", dimes);
            displayDenomination("nickel", nickels);
            displayDenomination("penny", pennies);
        } else if (change < 0) {
        	change = -change;
        	if (change < 100) {               
            	System.out.printf("Insufficient payment. Please ask for %d¢ more.", change);
            } else {
                System.out.printf("Insufficient payment. Please ask for $%d.%02d more.", change/100, change%100);
            }
        }

        // Close the scanner
        scanner.close();
    }

    // Helper method to display denomination properly
    public static void displayDenomination(String denomination, int count) {
        if (count > 0) {
            System.out.print(count + " " + denomination);
            if (count > 1) {
                System.out.println("s");
            } else {
                System.out.println();
            }
        }
    }
}
