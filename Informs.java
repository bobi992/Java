
public class helloworld {

	public static void main(String[] args) {
		System.out.println("Please enter your First Name, Last Name, Age, City and Country\n");

		String fname = " ";
		if (args.length > 0) {
			fname = args[0];

		}
		System.out.println("Name: " + fname);

		String lname = " ";
		if (args.length > 1) {
			lname = args[1];

		}
		System.out.println("Surname: " + lname);

		String age = " ";
		if (args.length > 2) {
			try {
				
				int i = Integer.parseInt(args[2]);
				if (i == 0) {
					System.out.println("You can't enter 0 as Age!");
				}
				else {
				age = args[2];
				}
			} catch (NumberFormatException e) {
				System.out.println("Please enter valid number!");
			}
			
		}
		System.out.println("Age: " + age);
		
		String city = " ";
		if (args.length > 3) {
			city = args[3];
		}
		System.out.println("City: "+ city);
		
		String country = " ";
		if (args.length > 4) {
			country = args[4];
		}
		System.out.println("Country: "+country+"\n");
		
		if (args.length > 5) {
			System.out.println("You can't enter more informations!\nEND PROGRAM");
		}
	}
}
