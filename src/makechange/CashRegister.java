package makechange;

public class CashRegister {

	public static void main(String[] args) {
		
		/*
		 * # Prompt clerk for total due
		 * "Total amount due: ", price
		 * 
		 * # Prompt clerk for total paid
		 * "Amount paid by customer: ", tendered
		 * 
		 * # Calculate change change = tendered - price
		 * 
		 * # Check if tendered is greater than price
		 *  IF change < 0 
		 *  		OUTPUT "Error: Insufficient payment."
		 *  	ELSE IF change == 0
		 *  		OUTPUT "Exact payment received. No change needed."
		 *  ELSE ...
		 * # Initialize counter variables for each denomination
		 * 		twenties = 0
		 * 		tens = 0
		 * 		fives = 0
		 * 		ones = 0
		 * 		quarters = 0
		 *		dimes = 0
		 *		nickels = 0
		 *		pennies = 0
		 * 
		 * # create method to count out currency and monitor change still due
		 * 	method denominationCounter (denomination, change, value)
		 * 		denomination = INT(change / value)
		 * 		change = change - (denomination * value)
		 * 		
		 * 
		 * # Calculate and display the change breakdown 
		 * 	OUTPUT "Change to be given:"
		 * 
		 * 		method denominationCounter (twenties, change, 20)
		 * 		IF twenties > 0
		 * 			OUTPUT twenties, " twenty-dollar bill(s)"
		 * 
		 * 		method denominationCounter (tens, change, 10)
		 * 		IF tens > 0 
		 * 			OUTPUT tens, " ten-dollar bill(s)"
		 * 
		 * 		method denominationCounter (fives, change, 5)
		 * 		IF fives > 0 
		 * 			OUTPUT fives, " five-dollar bill(s)"
		 *		
		 *		...
		 */
	}
}
