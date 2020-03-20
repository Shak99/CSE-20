import java.util.Scanner;

public class Errors4 {

	public static void main(String[] args) {

		int n1, n2;
		
		Scanner keyboard = new Scanner(System.in);


		System.out.println("Enter two ints and we print out sum as an int.");

		

		System.out.print("Enter the first number: ");
		n1 = keyboard.nextInt();
		System.out.print("Enter the second number: ");
		n2 = keyboard.nextShort();

		System.out.println("The sum of the numbers is " + (float)(n1+n2));
	}

}