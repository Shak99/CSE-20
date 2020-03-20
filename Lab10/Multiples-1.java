import java.util.Scanner;
public class Multiples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("Please enter the max number: ");
		int max = input.nextInt();
		
		System.out.println("Enter the base: ");
		int base= input.nextInt();
		
		for (int i = base; i <= max; i = i + base){
			num = i;
			System.out.println("Number is " + num);
	}
	}

}
