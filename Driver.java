import java.io.*;
public class Driver {
	static BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		int input = 1, tables;
		String name;
		
		for(int i = 0; i < 2; i++) {
			if(i == 0) {
				System.out.print("<<How many tables does your pet-friendly section have? ");
			}
			else {
				System.out.print("<<How many tables does your non-pet-friendly section have? ");
			}
			try {
				input = Integer.parseInt(stdin.readLine());
				System.out.println(input);
				for(int j = 1; j <= input; j++) {
					System.out.print("<<Enter table name: ");
					name = stdin.readLine();                                             //GET NAME
					System.out.print(name + "\n<<Enter number of seats: ");
					input = Integer.parseInt(stdin.readLine());
					System.out.println(input);                                           //GET SEAT NUMBERS
					
					//ADD TO COLLECTION OF TABLES
				}
			}
			catch(IOException e) {
			}
		}
		
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
				input = Integer.parseInt(stdin.readLine());
				System.out.println(input);
				switch(input) {
				case 0: //customer exits
					//Can we close the restuarant if there are still customers seated? Probably, right?
					break;

				case 1: //customer enters
					enterCustomer();
					break;

				case 2: //customer seated
					seatCustomer();
					break;

				case 3: //customer leaves
					exitCustomer();
					break;

				case 4: //add a table
					addTable();
					break;

				case 5: //remove a table
					removeTable();
					break;

				case 6: //display tables
					displayTables();
					break;

				case 7: //display waiting parties info
					displayWaitingCustomers();
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
		System.out.println("Not yet implemented!");
	}


	public static void seatCustomer()
	{
		System.out.println("Not yet implemented!");
	}

	public static void exitCustomer()
	{
		System.out.println("Not yet implemented!");
	
	}

	public static void addTable()
	{
		System.out.println("Not yet implemented!");
	
	}

	public static void removeTable()
	{
		System.out.println("Not yet implemented!");
	
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


}
