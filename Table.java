
public class Table {
	private String name;
	private int seatCount;
	public Table(String name, int seatCount) {
		this.name = name;
		this.seatCount = seatCount;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	public int getSeatCount() {
		return seatCount;
	}
}
