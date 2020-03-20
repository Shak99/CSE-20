import java.util.Scanner;

public class AllSum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;
		int sum = 0;
		while ( i <= max) {
			System.out.println("Number " + i);
			sum = sum + i;
			i++;

}
		System.out.print("The sum of all numbers is " + sum);
}
}