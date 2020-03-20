import java.util.Scanner;

public class Errors1 {

	public static void main(String[] args) {
		System.out.println("Can you spot and fix the errors?");

		System.out.println("Enter two numbers and I ");
		System.out.println("add them for you");

		int n1, n2;

		Scanner keyboard = new Scanner(System.in);
		n1 = keyboard.nextInt();
		n2 = keyboard.nextInt();

		System.out.println("The sum of the numbers is");
		System.out.println(n1 - n2);

	}
}