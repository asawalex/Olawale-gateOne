import java.util.Scanner;

	public class PhoneBook{

		public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

	System.out.print("Enter your name: ");
	String userInput = console.nextLine();
	
	System.out.print("Enter your address: ");
	String userAddres = console.nextLine();

	System.out.print("Enter your telephone: ");
	String usercontact = console.nextLine();

	System.out.print("Enter your email: ");
	String userEmail = console.nextLine();

	
	 //for(int count = 0; count <= 3; count++) {
	// System.out.print("Enter your name: ");
	//  userInput = console.nextLine();
	
	// System.out.print("Enter your address: ");
	// userAddres = console.nextLine();

	// System.out.print("Enter your telephone: ");
	// usercontact = console.nextLine();

	// System.out.print("Enter your email: ");
	// userEmail = console.nextLine();

	//}
	System.out.println("Name: " + userInput);
	System.out.println("Address: " + userAddres);
	System.out.println("Telephone: " + usercontact);
	System.out.println("Email: " + userEmail);
}
}