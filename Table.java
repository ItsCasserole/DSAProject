public class Table {

	private String name;
	private int seatCount;


	/**
	 * Constructor for a table object
	 *
	 * @param name The name of the table
	 * @param seatCount The number of seats at the table
	 */
	public Table(String name, int seatCount) {
		this.name = name;
		this.seatCount = seatCount;
	}
	
	/**
	 * Sets the name of the table
	 *
	 * @param name The name to set the table to
	 */
	protected void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the name of the table
	 */
	protected String getName() {
		return name;
	}
	
	/**
	 * Sets the numbers of seats at the table
	 *
	 * @param seatCount The number of seats to set the table to
	 */
	protected void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	/**
	 * Returns the number of seats at the table
	 */
	protected int getSeatCount() {
		return seatCount;
	}
	
	/**
	 * Returns a string representation of the table
	 */
	public String toString() {
		return "table " + name + " with " + seatCount + " seats";
	}
}
