import java.util.Scanner;


public class PosAverage {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float avg = 0;
		int i = 0;
		int num;
		int average = 0;
		
		do {
			System.out.println("Enter " + i + " number:");
			num = input.nextInt();
		
			if(num>0)
			{
				i++;
				average = average + num;
			}

		
		}while (num > 0);
		
		average = (average/i);		
		System.out.println("Average is " + average);

	}

}
