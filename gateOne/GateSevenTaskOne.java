import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.period;

	public class GateSevenTaskOne {

		public static void main(String[] args) {

	Scanner console = new Scanner(System.in);
		

	System.out.print("Enter your name: ");
	String userInput = console.nextLine();

	stem.out.print("Enter your date of birth: ");
		   String userInput = console.nextLine();

                   int years = printDate(userInput,LocalDate.now());		
		
		System.out.println(years);
		

	}
		public static int printDate(String input,LocalDate todayDate) {
	
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
		LocalDate dateOfBirth = LocalDate.parse(input,date);
                
                int years = period.between(dateOfBirth,todayDate).getYears();           

                return years;

	}
	

}
