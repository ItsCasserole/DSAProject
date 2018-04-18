
public class Table {
	private String name;
	private int seatCount;
	public Table(String name, int seatCount) {
		this.name = name;
		this.seatCount = seatCount;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected String getName() {
		return name;
	}
	
	protected void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	protected int getSeatCount() {
		return seatCount;
	}
	
	public String toString() {
		return "table " + name + " with " + seatCount + " seats";
	}
}
