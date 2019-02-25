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
* started and the resulting equation.
* 
* @author  Tyler Aanenson
* @version 4.0
* @since   2019-02-24
*/
public class Calculator {

	private int total;
	private String history;
	private String equation;
	
	public Calculator () {
		total = 0;  	// not needed - included for clarity
		history = "";	// not needed - included for clarity
		equation = "";
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
	   * This method adds a number to the current total, updates 
	   * history to include the command, and updates equation to 
	   * include the new entry.
	   * @param value This is the integer to be added to total
	   * @return Nothing
	   */
	public void add (int value) {
		total += value;
		history += ("myCalculator.add (" + value + ");\n");
		if (equation.isEmpty()) {
			equation += ("0 + " + value);
		}
		else {
			equation += (" + " + value);
		}
	}
	
	/**
	   * This method subtracts a number from the current total, updates 
	   * history to include the command, and updates equation to 
	   * include the new entry.
	   * @param value This is the number to be subtracted from the total.
	   * @return Nothing
	   */
	public void subtract (int value) {
		total -= value;
		history += ("myCalculator.subtract (" + value + ");\n");
		if (equation.isEmpty()) {
			equation += ("0 - " + value);
		}
		else {
			equation += (" - " + value);
		}
	}
	
	/**
	   * This method multiplies the current total by a number, updates 
	   * history to include the command, and updates equation to 
	   * include the new entry.
	   * @param value This is the number to be multiplied with the total.
	   * @return Nothing
	   */
	public void multiply (int value) {
		total *= value;
		history += ("myCalculator.multiply (" + value + ");\n");
		if (equation.isEmpty()) {
			equation += ("0 * " + value);
		}
		else {
			equation += (" * " + value);
		}
	}
	
	/**
	   * This method divides the current total by a number, updates 
	   * history to include the command, and updates equation to 
	   * include the new entry.
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
		history += ("myCalculator.divide (" + value + ");\n");
		if (equation.isEmpty()) {
			equation += ("0 / " + value);
		}
		else {
			equation += (" / " + value);
		}
	}
	
	/**
	   * This method prints the history of commands entered and the 
	   * resulting equation.
	   * @param Unused
	   * @return history The string of all previous commands entered.
	   */
	public String getHistory () {
		return "History: \n" + history + equation;
		
	}
}