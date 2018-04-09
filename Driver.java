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
					break;
				case 2: //customer seated
					break;
				case 3: //customer leaves
					break;
				case 4: //add a table
					break;
				case 5: //remove a table
					break;
				case 6: //display tables
					break;
				case 7: //display waiting parties info
					break;
				case 8: //display served parties info
					break;
				default:
					System.out.println("Invalid input.");
						
				}
			}
			catch(IOException e) {}
		}while(input != 0);
	}
}
