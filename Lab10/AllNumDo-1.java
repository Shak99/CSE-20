import java.util.Scanner;

public class AllNumDo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;
		int sum = 0;
		do {
			System.out.println("Number " + i);
			i++;
			sum = sum + i;
			
		}while ( i < max);
			System.out.println( "Number " + max);
			
	
	System.out.print("Sum of all numbers is " + sum);



}
}

