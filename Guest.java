
public class Guest {
	private String name;
	private boolean petFriendly;
	private int seatCount;
	
	public Guest(String name, int seatCount, boolean petFriendly) {
		this.name = name;
		this.petFriendly = petFriendly;
		this.seatCount = seatCount;
	}
	
	protected void setName(String name) {
		this.name = name;
	}
	
	protected String getName() {
		return name;
	}
	
	protected boolean isPetFriendly() {
		return petFriendly;
	} 
	
	protected void setSeatCount(int seatCount) {
		this.seatCount = seatCount;
	}
	
	protected int getSeatCount() {
		return seatCount;
	}	
}
