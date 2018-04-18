
public class SeatedGuest extends Guest{
	private Table table;
	public SeatedGuest(String name, int seatCount, boolean petFriendly, Table table) {
		super(name, seatCount, petFriendly);
		this.table = table;
	}
	
	protected void setTable(Table table) {
		this.table = table;
	}
	
	protected Table getTable() {
		return table;
	}
	
	public String toString() {
		return "Serving " + super.toString() + " at table " + table.getName() + " with " + table.getSeatCount() + " seats";
	}
}
