import java.util.Arrays;
import java.util.Scanner;

		public class TaskOne1 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		int[] scores = new int[10];

			int counter = 0;

		
	for(; counter < scores.length; counter++) {
		System.out.print("Enter your score: ");
		  scores[counter] = console.nextInt();	
		}
		
		System.out.printf(Arrays.toString(scores));
		}	
		
}
