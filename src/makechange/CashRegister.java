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
		else {
			// Initialize counter variables
			int twenties, tens, fives, ones, quarters, dimes, nickels, pennies = 0;
		}
				  
//		  # create method to count out currency and monitor change still due
		int denominationCounter(change, double value) {
			int count = (int)(change/value);
			return count;
		}
//		  	method denominationCounter (denomination, change, value)
//		  		denomination = INT(change / value)
//		  		change = change - (denomination * value)
//		  		
//		  
//		  # Calculate and display the change breakdown 
//		  	OUTPUT "Change to be given:"
//		  
//		  		method denominationCounter (twenties, change, 20)
//		  		IF twenties > 0
//		  			OUTPUT twenties, " twenty-dollar bill(s)"
//		  
//		  		method denominationCounter (tens, change, 10)
//		  		IF tens > 0 
//		  			OUTPUT tens, " ten-dollar bill(s)"
//		  
//		  		method denominationCounter (fives, change, 5)
//		  		IF fives > 0 
//		  			OUTPUT fives, " five-dollar bill(s)"
//		 		
//		 		...

		scanner.close();

	}
}
