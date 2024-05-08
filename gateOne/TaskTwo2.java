import java.util.Arrays;
import java.util.Scanner;

		public class TaskTwo2 {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);

		int[] scores = new int[10];

			int counter = 0;

		System.out.print("Enter your score: ");
		  scores[counter] = console.nextInt();

		     for(; counter < scores.length; counter++) {
			System.out.print("Enter your score: ");
		 	 scores[counter] = console.nextInt();	
			}
		
		for(int count = 0; count < counter; count++) {
			
			System.out.print(scores[count] + " ");
		 	}
		}	
		
}
