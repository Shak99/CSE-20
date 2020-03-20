import java.util.Scanner;


public class SumSquare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int square = 0;
		int sum = 0;
		
		System.out.println("Please enter the max number: ");
		int max = input.nextInt();
		
		for (int i = 0; i <= max; i++){
			square = (i*i);
			System.out.println("Number " + i + " squared is " + square);
			sum = sum + square;
		}
			System.out.print("Sum of squares is " + sum);
	}

}
