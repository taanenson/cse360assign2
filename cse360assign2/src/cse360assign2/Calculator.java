package cse360assign2;
/**
* <h1>Calculator</h1>
* This class will be a simple calculator with the variable total and functions 
* getTotal, add, subtract, multiply, divide, and getHistory. getTotal() returns 
* the current value of total, add() adds the passed value to the total and 
* replaces total with the sum. subtract() takes the difference of total and 
* the passed value and replaces total with the difference. multiply() multiplies
* total by the passed value and replaces total with the product. divide() 
* divides the total by the passed value and replaces total with the value of 
* the division. getHistory() returns all commands made since the program 
* started.
* 
* @author  Tyler Aanenson
* @version 3.0
* @since   2019-02-24
*/
public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  	// not needed - included for clarity
		history = "";	// not needed - included for clarity
	}
	
	/**
	   * This method returns the current value of total.
	   * @param Unused
	   * @return total The current value of the integer total
	   */
	public int getTotal () {
		return total;
	}
	
	/**
	   * This method adds a number to the current total and updates 
	   * history to include the command.
	   * @param value This is the integer to be added to total
	   * @return Nothing
	   */
	public void add (int value) {
		total += value;
		history += (value + " added to total \n");
	}
	
	/**
	   * This method subtracts a number from the current total and updates 
	   * history to incluse the command.
	   * @param value This is the number to be subtracted from the total.
	   * @return Nothing
	   */
	public void subtract (int value) {
		total -= value;
		history += (value + " subtracted from total \n");
	}
	
	/**
	   * This method multiplies the current total by a number and updates 
	   * total to include the command.
	   * @param value This is the number to be multiplied with the total.
	   * @return Nothing
	   */
	public void multiply (int value) {
		total *= value;
		history += (value + " multiplied with total \n");
	}
	
	/**
	   * This method divides the current total by a number and updates 
	   * history to include the command.
	   * @param value This is the number the total will be divided by
	   * @return Nothing
	   */
	public void divide (int value) {
		if(value == 0) {
			total = 0;
		}
		else {
			total /= value;
		}
		history += ("Total divided by " + value + "\n");
	}
	
	/**
	   * This method prints the history of commands entered.
	   * @param Unused
	   * @return history The string of all previous commands entered.
	   */
	public String getHistory () {
		return "History: \n" + history;
	}
}