import java.util.Date;
import java.util.ArrayList;
import java.util.Scanner;

public class SemicolonStore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double subTotal = 0;

        ArrayList<String> items = new ArrayList<>();
        ArrayList<Integer> howManys = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();

        System.out.print("What is the customer's Name: ");
        String userInput = input.next();
        Date myDate = new Date();

        String response;
        do {
            System.out.print("What did the user buy: ");
            String item = input.next();

            System.out.print("How many pieces: ");
            int howMany = input.nextInt();

            System.out.print("How much per unit: ");
            double price = input.nextDouble();

            double total = howMany * price;
            subTotal += total;

            items.add(item);
            howManys.add(howMany);
            prices.add(price);

            System.out.println("Add more items?");
            response = input.next();

        } while (!response.equalsIgnoreCase("no"));

        System.out.println("What is your name? (cashier's Name:)");
        String cashierInput = input.next();

        System.out.println("How much discount will he get:");
        double discountPercent = input.nextDouble();
        double discount = subTotal * discountPercent / 100;

        double vat = subTotal * 17.5 / 100;

        System.out.println("ASADE SHOE PRODUCTION");
        System.out.println("MAIN BRANCH LOCATION 100, SURULERE STADIUM ROAD,LAGOS.");
        System.out.printf("TEL: 08183872454%n");
        System.out.println("Date and Time: " + myDate);
        System.out.println("Cashier: " + cashierInput);
        System.out.println("Customer Name: " + userInput);
        System.out.println("=================================================");
        System.out.printf("%8s %8s %8s %s%n", "ITEM", "QTY", "PRICE", "TOTAL(NGN)");
        System.out.println("-------------------------------------------------");

        for (int counter = 0; counter < prices.size(); counter++) {
            System.out.printf("%8s %8d  %8.2f  %8.2f%n", items.get(counter), howManys.get(counter), prices.get(counter), prices.get(counter) * howManys.get(counter));
        }

        System.out.println("-------------------------------------------------");
        System.out.printf("\t%s:  \t%.2f%n", "Sub Total", subTotal);
	System.out.print("\n");
        System.out.printf("\t%s:  \t%.2f%n", "Discount", discount);
	System.out.print("\n");
        System.out.printf("\t%s: \t %.2f%n", "VAT @ 17.50%", vat);
	System.out.print("\n");
	System.out.println("===================================================");
        System.out.printf("\t%s: \t %.2f%n", "Total", subTotal - discount + vat);
	System.out.println("===================================================");
	System.out.println("THIS IS NOT AN RECEITPT KINDLY PAY" +" "+subTotal);
	System.out.println("=================================================");

    }
}
