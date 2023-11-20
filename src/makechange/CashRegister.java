package makechange;

import java.util.Scanner;

public class CashRegister {

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
                System.out.printf("Change to be given: $%d.%02d%n", change / 100, change % 100);
            }

            // Calculate and display the change breakdown
            displayChangeBreakdown(change);
        } else if (change < 0) {
            change = -change;
            if (change < 100) {
                System.out.printf("Insufficient payment. Please ask for %d¢ more.", change);
            } else {
                System.out.printf("Insufficient payment. Please ask for $%d.%02d more.", change / 100, change % 100);
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

    // Helper method to calculate and display the change breakdown
    public static void displayChangeBreakdown(int change) {
        int[] denominations = { 2000, 1000, 500, 100, 25, 10, 5, 1 };
        String[] names = { "twenty-dollar bill", "ten-dollar bill", "five-dollar bill", "one-dollar bill", "quarter",
                "dime", "nickel", "penny" };

        for (int i = 0; i < denominations.length; i++) {
            int count = change / denominations[i];
            change %= denominations[i];
            displayDenomination(names[i], count);
        }
    }
}
