import java.util.Scanner;
public class AnyAverageArr {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program will find the average of any numbers. Please choose amount of numbers to average :");
		
		int max = input.nextInt();
		int[] arr = new int[max + 1];
		int avgNums = 0;
		int avg = 0;
		
		for(int i = 0; i < max; i++){
			System.out.println("Please enter " + i + " number: ");
			arr[i] = input.nextInt();
			avgNums = avgNums + arr[i];
		}
		
		System.out.println("The numbers being averaged: ");
		
		int i = 0;
		while (i < max){
			
			System.out.print(arr[i++] + " ");
			
		if (i%5 == 0){
			System.out.println();
		}
			avg = avgNums/max;
		}
		System.out.print("\nThe average is " + avg);
		

		}
	}


