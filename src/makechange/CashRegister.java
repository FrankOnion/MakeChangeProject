
package makechange;

import java.util.Scanner;

/*	Future improvements:
 * Reject invalid user input such as strings
 * 
 *  loop prog for multiple transactions
 *  
 *  	Output w/ dynamic pluralization rather than using (s)
 *  
 *  allow updates for the amount owed in the event that a customer adds an item after the transaction has begun
*  allow update to the total paid if the customer adds money after finding they are short on payment
 * 
 * 
 */
public class CashRegister {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		  # Prompt clerk for total due
		System.out.print("Total amount due: ");
		double price = scanner.nextDouble();

//		  # Prompt clerk for total paid
		System.out.print("Total paid by customer: ");
		double tendered = scanner.nextDouble();

//		  # Calculate change change = tendered - price
		double change = tendered - price;
		int cents = (int) (change * 100);

//		  # Check if tendered is greater than price 
		if (change < 0) {
			change = -change;
			cents = -cents;
			if (cents < 100) {
				System.out.printf("Insufficient payment. Please ask for %d¢ more.", cents);
			} else {
				System.out.printf("Insufficient payment. Please ask for $%.2f more.", change);
			}
		} else if (change == 0) {
			System.out.println("Exact payment due recieved. No change needed.");
		} else if (cents < 100) {
			System.out.printf("Change to be given: %d¢.", cents);
		} else {
			System.out.printf("Change to be given: $%.2f%n", change);
			// Initialize counter variables and start looking at change in terms of cents to
			// make calculations easy and exact

			int twenties, tens, fives, ones, quarters, dimes, nickels, pennies = 0;

			// Use denominationCounter() method to count out currency
			twenties = denominationCounter(cents, 2000);
			cents -= twenties * 2000;

			tens = denominationCounter(cents, 1000);
			cents -= tens * 1000;

			fives = denominationCounter(cents, 500);
			cents -= fives * 500;

			ones = denominationCounter(cents, 100);
			cents -= ones * 100;

			quarters = denominationCounter(cents, 25);
			cents -= quarters * 25;

			dimes = denominationCounter(cents, 10);
			cents -= dimes * 10;

			nickels = denominationCounter(cents, 5);
			cents -= nickels * 5;

			pennies = denominationCounter(cents, 1);

			// Display the change breakdown

			if (twenties > 0) {
				System.out.print(twenties + " twenty-dollar bill");
			}
			if (twenties > 1) {
				System.out.println("s");
			} else {
				System.out.print("\n");
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
		}

		// Close the scanner
		scanner.close();

	}

	// Helper method to count out currency and update the cents owed
	public static int denominationCounter(int cents, int value) {
		int count = (cents / value);

		return count;
	}

}