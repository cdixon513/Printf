import java.util.Scanner;

public class Printf{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int numOfItems, gasPoints;
		double total, tax, bigTotal;
		System.out.print("Number of items purchased: ");
		numOfItems = scanner.nextInt();
		System.out.print("Total price: ");
		total = scanner.nextDouble();
		System.out.print("Tax: ");
		tax = scanner.nextDouble();
		System.out.println();
		bigTotal = total + tax;
		gasPoints = (int)(total/10);

		System.out.printf("%30s","Number of items purchased: ");
		System.out.printf("%10d\n", numOfItems);
		System.out.printf("%30s","Subtotal: ");
		System.out.printf("%10.2f\n", total);
		System.out.printf("%30s","Tax: ");
		System.out.printf("%10.2f\n", tax);
		System.out.printf("%41s","--------\n");
		System.out.printf("%30s","Total: ");
		System.out.printf("%10.2f\n", bigTotal);
		System.out.printf("%30s","Gas points: ");
		System.out.printf("%10d\n", gasPoints);
	}
}