import java.util.Scanner;
	public class TaskFive {
		public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);

		int user = 0;
		
	System.out.print("Enter student score: ");
	 int userInput = console.nextInt();

	for(int count = 1; count < 10; count++) {
	System.out.print("Enter student score: ");
	 	userInput = console.nextInt();
		
		if(userInput% 2 == 0){
		 userInput = 0;
		}
	}
	
	for(int counter = 0; counter < userInput; counter++) {
		user = userInput;
	}
	System.out.printf("The total sum is :%d ", user);
}
}