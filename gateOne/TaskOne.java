import java.util.Scanner;
	
	public class TaskOne {

		public static void main(String[] arg) {

		int [], collectScores();
			
	}

		public static  int[] collectScores() {
		Scanner console = new Scanner(System.in);

		int[] scores = new int[10];

		System.out.print("Enter score: ");
		int userInput = console.nextInt();
	
	for(int counter = 0; counter <= scores.length; counter++) {
		System.out.print("Enter  your score: ");
		 userInput = console.nextInt();

		 return scores[counter];
		}

	}

}