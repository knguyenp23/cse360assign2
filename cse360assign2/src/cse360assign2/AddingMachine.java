/*
 * AUTHOR: Kimberly Nguyen-Pham
 * CLASS ID: 1212667948
 * ASSIGNMENT: #2
 * DESCRIPTION: AddingMachine allows the user to add to and subtract from a total.
 * 		The history of operations performed can be printed to the user using the toString() method.
 */

package cse360assign2;

// contains the functions for AddingMachine
public class AddingMachine {
	
	private int total;	// total value
	private String operation;	// the history of operations performed on total
	
	// constructor initializes the total and operation variable
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		operation = "0";	
	}
	
	// returns the total
	public int getTotal () {
		return total;	
	}
	
	// adds the value to the total and logs the operation to history
	public void add (int value) {
		total += value;	
		operation += " + " + value;	
	}
	
	// subtracts the value from the total and logs the operation to history
	public void subtract (int value) {
		total -= value;	
		operation += " - " + value;	
	}
	
	// returns the history of operations performed as a string
	public String toString () {
		return operation;
	}

	// resets the total to 0 and resets the history of operations
	public void clear() {
		total = 0;	
		operation = "0"; 
	}
	
}
