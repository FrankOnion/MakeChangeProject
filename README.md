# MakeChangeProject

## Project Description

In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. We will also notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change should be provided using the largest bill and coin denominations as possible. Denominations that are not used should not be displayed.

##Verbal instructions given
* leave zero dollars off of the change 0.25 is bad .25 is good
* avoid using loops because we are going to improve it later

## How To Run
1. Enter the amount the customer owes.
2. Enter the amount the customer paid.
3. Follow the prompts
	* If the amount paid is less than what was owed the amount still owed will be displayed
	* If the amount paid is exactly the amount owed user is informed and no further action is needed
	* If the amount paid is more than the amount owed the user will be informed of the change to be given to the customer and the best method by which to provide the change to be given

## Technologies Used
	* Scanner for user input
	* printf() to handle displaying money correctly. (Different methods of handling it may be as good or better.)
	* series of if statements rather than loops (see verbal instructions)
	* custom method to handle the counting out of bills (made for better readability and compensated some for the lack of loops)

## Lessons Learned
	* I need to look deeper into how numbers can handled. conversion to cents was a simple solution for this case but may not be as useful in others. For example multiple purchases of gasoline where a tenth of a cent is tracked.
	* Documentation is a friend to all.
	
###Future improvements:
	* Reject invalid user input such as strings
	* loop prog for multiple transactions
	* allow updates for the amount owed in the event that a customer adds an item after the transaction has begun
	* allow update to the total paid if the customer adds money after finding they are short on payment
	Done
	* possibly use an array for the currency allowing for simpler more readable code
	* use a method for currency dole out




