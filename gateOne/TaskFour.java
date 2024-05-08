import java.util.Scanner;
	public class TaskFour {
		public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);

		int count = 1;
		int sum = 0;
		
	System.out.print("Enter student score: ");
	 int userInput = console.nextInt();

	while(count <= 10){
	System.out.print("Enter student score: ");
	 	userInput = console.nextInt();
		
		if(userInput% 2 == 0){
		sum += userInput;
		count++;

		}
	}
	System.out.printf("The total sum is :%d ", sum);
}
}
