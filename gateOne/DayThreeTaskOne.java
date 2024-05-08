import java.util.Scanner;

	public class DayThreeTaskOne {
		
		public static void main(String[] args) {

		Scanner console = new Scanner(System.in);
		
		 	//int luckyNumber = 27;
	

		System.out.print("Enter the collect answer");
			int userInput = console.nextInt();

		for(int luckyNumber = 27; luckyNumber != userInput; luckyNumber++) {
		System.out.print("Enter the collect answer");
			userInput = console.nextInt();
				}
			if(userInput == 27) {
				System.out.println("correct");
				}
			else if(userInput > 27) {
				System.out.println("incorrect");
				}
				else
				{
				System.out.print("try again");				
			}

		}

	}