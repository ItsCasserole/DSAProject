import java.io.*;
public class Driver {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		int input = 1, petTables = 0, petGuests = 0, nonGuests = 0;
		MyListReferenceBased tables = new MyListReferenceBased();
		MyListReferenceBased guests = new MyListReferenceBased();
		MyListReferenceBased seated = new MyListReferenceBased();
		
		//variables only used in the initial start of the program
		String name; 
		int seatCount;
		//*********************************************************
		
		try {
			for(int i = 0; i < 2; i++) { //goes through the loop twice; once for pet-friendly, once for non-petfriendly
				if(i == 0) {
					System.out.print(">>How many pet-friendly tables does your restaurant have? ");
					input = petTables = Integer.parseInt(stdin.readLine().trim());
					System.out.println(input);
				}
				else {
					System.out.print(">>How many non-pet-friendly tables does your restaurant have? ");
					input = Integer.parseInt(stdin.readLine().trim());
					System.out.println(input);
				}
				int currSize = tables.size();
				for(int j = currSize; j < input + currSize; j++) {
					addTable(tables, currSize, j);
				}
				
			}
		}
		catch(IOException e) {}
		
		System.out.println("Select from the following menu:" +
		    "\n\t0. Close the restaurant." + 
			"\n\t1. Customer party enters the restaurant." +
			"\n\t2. Customer party is seated and served." +
			"\n\t3. Customer party leaves the restaurant." +
			"\n\t4. Add a table." + 
			"\n\t5. Remove a table." + 
			"\n\t6. Display available tables." + 
			"\n\t7. Display info about waiting customer parties." + 
			"\n\t8. Display info about customer parties being served.");

		do {
			try {
				System.out.print("Make your selection now: ");
				input = Integer.parseInt(stdin.readLine().trim());
				System.out.println(input);
				switch(input) {
				case 0: //customer exits
					//Can we close the restaurant if there are still customers seated? Probably, right?
					break;

				case 1: //customer enters
					enterCustomer(guests, seated);
					break;

				case 2: //customer seated
					
					break;

				case 3: //customer leaves
					exitCustomer(guests, seated, tables, petTables);
					break;

				case 4: //add a table
					
					break;

				case 5: //remove a table
					removeTable(tables, seated, petTables);
					break;

				case 6: //display tables
					displayTables();
					break;

				case 7: //display waiting parties info\
					System.out.println("The following guests are waiting for tables: ");
					System.out.println(guests.toString());
					break;

				case 8: //display served parties info
					displaySeatedCustomers();
					break;

				default:
					System.out.println("Invalid input.");
						
				}
			}
			catch(IOException e) {}
		}while(input != 0);
	}


	public static void enterCustomer()
	{	
		//implemented in main
	}


	public static void seatCustomer()
	{
		System.out.println("Not yet implemented!");
	}

	public static void exitCustomer()
	{
		System.out.println("Not yet implemented!");
	
	}
	
	public static void removeTable(MyListReferenceBased tables, MyListReferenceBased seated, int petTables)
	{
		try {
			System.out.print(">>You are now removing a table.\nFrom which section would you like to remove this table (P/N)?");
			char c = stdin.readLine().toUpperCase().charAt(0);
			System.out.println(c);
			System.out.print(">>Enter table name: ");
			String name = stdin.readLine();
			System.out.println(name);
			
			if(searchSeatedTables(seated, name)) {
				System.out.println("Can't remove a table that is currently in use!");
			}
			else {
				String st;
				int index;
				if(c == 'P') {
					index = searchTableNames(tables, name, 0, petTables);
					st = "pet-friendly";
				}
				else {
					index = searchTableNames(tables, name, petTables, tables.size());
					st = "non-pet-friendly";
				}
				if(index < 0) {
					System.out.println("This table doesn't exist in the " + st + " section.");
				}
				else {
					
					tables.remove(index);
					System.out.println("Table " + name + " has been removed.");
					petTables--;
				}
			}
		}
		catch(IOException e) {}
	}

	public static void displayTables()
	{
		System.out.println("Not yet implemented!");
	
	}

	public static void displayWaitingCustomers()
	{
		System.out.println("Not yet implemented!");
	
	}

	public static void displaySeatedCustomers()
	{
		System.out.println("Not yet implemented!");
	
	}
	
	public static void sort(MyListReferenceBased items) {
		
	}
	
	//ADD A TABLE TO THE LIST OF TABLES
	public static void addTable(MyListReferenceBased tables, int start, int end) {
		try {
			System.out.print(">>Enter table name: ");
			String name = stdin.readLine();
			System.out.println(name);
			
			while(searchTableNames(tables, name, 0, end) >= 0) {
				System.out.println("Table name already exists! Please try again.");
				System.out.print(">>Enter table name: ");
				name = stdin.readLine();
				System.out.println(name);
			}
			
			System.out.print("Enter seat count: ");
			int seatCount = Integer.parseInt(stdin.readLine().trim());
			System.out.println(seatCount);
			
			int index = sortTablesBySeatCount(tables, seatCount, start, end);
			tables.add(index, new Table(name, seatCount));
		}
		catch(IOException e) {}
	}
	
	//METHOD TO SORT TABLES BY SEATCOUNT
	public static int sortTablesBySeatCount(MyListReferenceBased tables, int seatCount, int start, int end) {
		for(int i = start; i < end; i++) {
			int curr = ((Table) tables.get(i)).getSeatCount();
			if(seatCount > curr) {}
			else {
				return i;
			}
		}
		return end;
	}
	
	//SEARCHES THROUGH THE TABLES NAMES IN THE TABLE LIST TO CHECK FOR DUPLICATE NAMES
	public static int searchTableNames(MyListReferenceBased tables, String name, int start, int end) {
		int size = tables.size();
		for(int i = start; i < end; i++) {
			String curr = ((Table) tables.get(i)).getName();
			if(curr.equals(name)) {
				return i; //if found, returns the index it was found at
			}
		}
		return -1; //if not, returns -1
	}
	
	//SEARCHES THE NAMES OF WAITING GUESTS
	public static boolean searchWaitingGuestNames(MyListReferenceBased guests, String name) {
		int size = guests.size();
		for(int i = 0; i < size; i++) {
			String curr = ((Guest) guests.get(i)).getName();
			if(curr.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	//SEARCHES THE NAMES OF SEATED GUESTS
	//BINARY BECAUSE SEATED GUESTS ARE STORED IN LEXICOGRAPHICAL ORDER
	public static int searchSeatedGuestNames(MyListReferenceBased guests, String name) {
		if(guests.isEmpty()) {
			return 0;
		}
		else {
			int high = guests.size();
			int low = 0; 
			int mid;
			int numItems = high;
			while(low < high) {
				mid = (high + low)/2;
				if(name.compareTo(((SeatedGuest) guests.get(mid)).getName()) <= 0) {
					high = mid;
				}
				else {
					low = mid+1;
				} 
			}
			if(name.equals(((SeatedGuest) guests.get(low)).getName())) {
				if(low == 0) {
					return -1 * numItems; //if found at index 0, return -1 * numItems
				}
				return -1 * low; //if found anywhere else, return the negative of the index it was found at
			}
			else {
				return low; //if not found, return the index it should be placed into
			}
		}
	}
	
	public static boolean searchSeatedTables(MyListReferenceBased seatedGuests, String name) {
		int size = seatedGuests.size();
		for(int i = 0; i < size; i++) {
			String curr = (((SeatedGuest) seatedGuests.get(i)).getTable()).getName();
			if(curr.equals(name)) {
				return true;
			}
		}
		return false;
	}
	
	//METHOD TO ADD CUSTOMERS TO THE WAITING LIST
	public static void enterCustomer(MyListReferenceBased guests, MyListReferenceBased seated) {
		try {
			System.out.print(">>Enter customer name: ");
			String name = stdin.readLine();
			System.out.println(name);
			while(searchWaitingGuestNames(guests, name) || searchSeatedGuestNames(seated, name) < 0) {
				System.out.print("Name already registered. Please try again.\n>>Enter customer name: ");
				name = stdin.readLine();
				System.out.println(name);
			}
			System.out.print("Enter number of seats: ");
			int seatCount = Integer.parseInt(stdin.readLine().trim());
			System.out.println(seatCount);
			System.out.print("Does your party have pets (Y/N)? ");
			char c = stdin.readLine().toUpperCase().charAt(0);
			System.out.println(c);
			boolean pf;
			if(c == 'Y') {
				pf = true;
			}
			else {
				pf = false;
			}
			int size = guests.size();
			guests.add(size, new Guest(name, seatCount, pf));
		}
		catch(IOException e) {}
	}
	
	public static void exitCustomer(MyListReferenceBased guests, MyListReferenceBased seated, MyListReferenceBased tables, int petTables) {
		try {
			if(seated.isEmpty()) {
				System.out.println("No customer is being served!");
			}
			else {
				System.out.print(">>Enter the name of the customer that wants to leave: ");
				String name = stdin.readLine();
				System.out.println(name);
				int index = searchSeatedGuestNames(seated, name);
				if(index >= 0) {
					if(searchWaitingGuestNames(guests, name)) {
						System.out.println("Customer " + name + " is not being served, but waiting to be seated.");
					}
					else {
						System.out.println("Customer " + name + " does not exist in the restaurant.");
					}
				}
				else {
					if(index == -1*seated.size()) {
						index = 0;
					}
					else {
						index = -1 * index;
					}
					SeatedGuest g = (SeatedGuest) seated.get(index);
					Table t = g.getTable();
					int tableIndex;
					if(g.isPetFriendly()) {
						tableIndex = sortTablesBySeatCount(tables, t.getSeatCount(), 0, petTables);
						
					}
					else {
						tableIndex = sortTablesBySeatCount(tables, t.getSeatCount(), petTables, tables.size());
					}
					tables.add(tableIndex, t);
					System.out.println("Table " + t.getName() + " with " + t.getSeatCount() + " has been freed.");
					seated.remove(index);
					System.out.println("Customer " + g.toString() + " is leaving the restaurant.");
				}
			}
		}
		catch(IOException e) {}
	}
}

