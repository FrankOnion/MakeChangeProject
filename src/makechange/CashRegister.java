package makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		  # Prompt clerk for total due
		System.out.print("Total amount due: ");
		double price = scanner.nextDouble();

//		  # Prompt clerk for total paid
		System.out.print("Total paid by customer:");
		double tendered = scanner.nextDouble();

//		  # Calculate change change = tendered - price
		double change = tendered - price;

				  
//		  # Check if tendered is greater than price 
		if (change < 0) {
			System.out.println("Insufficient payment. Please ask for $" + (-1 * change) + " more.");
			// need to make this show as double point precision
		}
		else if (change == 0) {
			System.out.println("Exact payment due recieved. No change needed.");
		}
		
			// Initialize counter variables
			int twenties, tens, fives, ones, quarters, dimes, nickels, pennies = 0;
		
				  
		// Helper method to count out currency and update the change
        // Use integer division to determine the number of each denomination
        // Update the change accordingly
        twenties = denominationCounter(change, 20.0);
        change -= twenties * 20.0;

        tens = denominationCounter(change, 10.0);
        change -= tens * 10.0;

        fives = denominationCounter(change, 5.0);
        change -= fives * 5.0;

        ones = denominationCounter(change, 1.0);
        change -= ones * 1.0;

        quarters = denominationCounter(change, 0.25);
        change -= quarters * 0.25;

        dimes = denominationCounter(change, 0.1);
        change -= dimes * 0.1;

        nickels = denominationCounter(change, 0.05);
        change -= nickels * 0.05;

        pennies = denominationCounter(change, 0.01);

        // Display the change breakdown
        System.out.println("Change to be given:");
        if (twenties > 0) {
            System.out.println(twenties + " twenty-dollar bill(s)");
        }
        if (tens > 0) {
            System.out.println(tens + " ten-dollar bill(s)");
        }
        if (fives > 0) {
            System.out.println(fives + " five-dollar bill(s)");
        }
        if (ones > 0) {
            System.out.println(ones + " one-dollar bill(s)");
        }
        if (quarters > 0) {
            System.out.println(quarters + " quarter(s)");
        }
        if (dimes > 0) {
            System.out.println(dimes + " dime(s)");
        }
        if (nickels > 0) {
            System.out.println(nickels + " nickel(s)");
        }
        if (pennies > 0) {
            System.out.println(pennies + " penny(pennies)");
        }
        scanner.close();
        //I'd like to make output changes pluralization rather than using (s)

    }

    // Close the scanner


// Helper method to count out currency and update the change
public static int denominationCounter(double change, double value) {
    int count = (int) (change / value);
    return count;
}

}