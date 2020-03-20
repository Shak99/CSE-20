import java.util.Scanner;

public class Errors3 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner (System.in);
		int numerator;
		int denominator;

		System.out.println("This program divides two numbers.");
		System.out.print("Enter the numerator: ");
		numerator = kbd.nextInt();
		System.out.print("Enter the denominator: ");
		denominator = kbd.nextInt();

		System.out.print(numerator);
		System.out.print("/");
		System.out.print(denominator);
		System.out.print(" = ");
		System.out.println((double) numerator/denominator);
	}
}