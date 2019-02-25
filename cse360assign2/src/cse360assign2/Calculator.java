
package cse360assign2;
/**
* <h1>Calculator</h1>
* This class will be a simple calculator with the variable total and functions 
* getTotal, add, subtract, multiply, divide, and getHistory. getTotal() returns 
* the current value of total, add() adds the passed value to the total and 
* replaces total with the sum. subtract() takes the difference of total and 
* the passed value and replaces total with the difference. multiply() multiplies 
* total by the passed value and replaces total with the product. divide() 
* divides the total by the passed value and replaces total with thte value of 
* the division. getHistory() does nothing.
* 
* @author  Tyler Aanenson
* @version 2.0
* @since   2019-02-24
*/
public class Calculator {

	private int total;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	   * This method will be used to return the current value of total, 
	   * it currently does nothing.
	   * @param Unused
	   * @return 0 (this will later be changed to total)
	   */
	public int getTotal () {
		return total;
	}
	
	/**
	   * This method adds a number to the current total.
	   * @param value This is the integer to be added to total
	   * @return Nothing
	   */
	public void add (int value) {
		total += value;
	}
	
	/**
	   * This method subtracts a number from the current total.
	   * @param value This is the number to be subtracted from the total.
	   * @return Nothing
	   */
	public void subtract (int value) {
		total -= value;
	}
	
	/**
	   * This method multiplies the current total by a number.
	   * @param value This is the number to be multiplied with the total.
	   * @return Nothing
	   */
	public void multiply (int value) {
		total *= value;
	}
	
	/**
	   * This method divides the current total by a number.
	   * @param value This is the number the total will be divided by
	   * @return Nothing
	   */
	public void divide (int value) {
		total /= value;
	}
	
	/**
	   * This method will print the history of commands entered, 
	   * it currently does nothing.
	   * @param Unused
	   * @return Nothing (an empty string)
	   */
	public String getHistory () {
		return "";
	}
}