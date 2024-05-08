import java.util.Scanner;
	public class TaskThree {
		public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);

		int average = 0;
		int sum = 0;
		

	System.out.print("Enter student score: ");
	 int userInput = console.nextInt();

	for(int count = 0; count < 10; count++) {
	System.out.print("Enter student score: ");
	 	userInput = console.nextInt();
		
		sum += userInput;
		
		average = sum / 10;
	}
	System.out.printf("The total sum is :%d %n", sum);
	System.out.printf("The total avarage scole is:%d ",average);
}
}
