import java.util.Scanner;

public class Errors2 {

	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		int number = 0;
		int theSquare = 0;

		System.out.print("Enter a number and I will ");
		System.out.print("square it for you:  ");
		number =  kbd.nextInt();

		// theSquare = number * number;

		System.out.print(number + " squared = ");
		System.out.println("theSquare");
	}
}