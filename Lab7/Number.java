import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number 0-25: ");
		double num = input.nextInt();
		
		
		System.out.println("You have entered " + num);
		
		if (num > -1 && num < 26) {
		System.out.print (num + " character of the alphabet is " + (char)(num + 65));
		}
		else {
			System.out.print("Outside of acceptable range");
		}
	}

}
