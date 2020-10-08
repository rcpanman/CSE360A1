package cse360assignment02;


/**
 * 
 * @author panryan
 * AddingMachine class has multiple methods that add, subtract, getters for total value, manipulation of integer values and storage of them.
 *
 */


public class AddingMachine {
	
	/**
	 * Integer to keep count of total
	 */
  private int total;
  /**
   * StringBuffer to store history
   */
  private StringBuffer history; 
  
  /**
   * Constructor; creates a new AddingMachine
   */
  public AddingMachine () {
	  /**
	   * Creates a new StringBuffer - history with 0 as initial string value
	   */
    history = new StringBuffer("0");
  }
  
  /**
   * Getter that returns the current total value
   * @return total
   */
  public int getTotal () {
    return total;
  }
  
  /**
   * Add method that adds parameter to the total variable
   * @param value Given integer value
   */
  public void add (int value) {
	  total = value + total;
	  /**
	   * appends history, inserting '+' and adding the parameter value
	   */
	  history.append(" + "+value);
  }

  /**
   * Subtract method that subtracts parameter from the total variable
   * @param value Given integer value
   */
  public void subtract (int value) {
	  total = total - value;
	  /**
	   * appends history, inserting '-' and adding the parameter value 
	   */
	  history.append(" - "+value);
  }

  /**
   * Method that returns history
   * 
   */
  public String toString () {
    return history.toString(); 
  }
  
/**
 * Method deletes entire history 
 */
  public void clear() {
	  history.delete(0, history.length());
	  
  }
}