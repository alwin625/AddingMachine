package cse360assign2;

public class AddingMachine {

	private int total;
	private String calculation; // Store calculations
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		calculation = "0 "; // starts calculation at 0
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		calculation += " + " + value; // update calculations
		total += value;
	}
	
	public void subtract (int value) {
		calculation += " - " + value; // update calculations
		total -= value;
	}
		
	public String toString () {
		return calculation;
	}

	public void clear() {
		total = 0; 
		calculation = "0 ";
	}
}
