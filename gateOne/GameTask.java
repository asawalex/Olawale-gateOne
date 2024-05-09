import java.util.Scanner;

	public class GameTask {

		public static void main(String[] args) {

	Scanner console = new Scanner(System.in);

	System.out.print("Enter the logic sybols between o and x : ");
		String userInput = console.nextLine();
		String[] logic = new String[9];

		for(int row = 0; row < logic.length; row++) {
	System.out.print("Enter the logical sybols between o and x : ");
	       userInput = console.nextLine();

		System.out.print(printTheLogicSybol(charAt(row)));

  }
	public static String printTheLogicSybol(char logicSybol) {
	
		
			switch(logicSybol) {
				case 'o':
				break;
				case 'x':
				break;
				defualt:
				break;
			}
		
	}
	
	public static void printLine() {
	
	for(int counter = 0; counter <= 40; counter++) {

		System.out.println("_");
		System.out.println("");
		System.out.println("\t|");
		System.out.println("");
		System.out.println("|");
		System.out.println("");
		System.out.println("_");

		}
	}
}