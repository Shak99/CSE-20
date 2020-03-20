import java.util.Scanner;

public class EvenNum {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter the max number:");

		int max = input.nextInt();
		int i = 0;
		int even;
		while ( i <= max) {
			even = i % 2;
			if (even == 0){
			System.out.println("Number " + i);
			i++;
		} else {
			System.out.print("");
			i++;
		}
			
	}
}
}
	
