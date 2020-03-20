import java.util.Scanner;

public class DataAnalyze {

	public static void main(String[] args) {
			Scanner input = new Scanner(System.in);


			System.out.println("Please enter the sample size: ");
			int size = input.nextInt();
			
			int[] trial1 = new int[size];
			int[] trial2 = new int[size];
			int[] trial3 = new int[size];
			int[] trial4 = new int[size];
			
			int avg = 0;
			int avg1 = 0;
			int avg2 = 0;
			int avg3 = 0;
			
			int[] sample = new int[4];

			int k = 0;
			int i = 0;
			
				System.out.println("Enter numbers for Trial " + 0);
				while (k < size){
				System.out.print("Enter sample #" + k +":");
				trial1[i]= input.nextInt();
				avg = avg + trial1[i];
				k++;
				i++;
				}
				System.out.println();
//_________________________________________________________________________________			
			
				int k1 = 0;
				int i1 = 0;
				
					System.out.println("Enter numbers for Trial " + 1);
					while (k1 < size){
					System.out.print("Enter sample #" + k1 +":");
					trial2[i1]= input.nextInt();
					avg1 = avg1 + trial2[i1];
					k1++;
					i1++;
					}
					System.out.println();
//_________________________________________________________________________________
					
					int k2 = 0;
					int i2 = 0;
					
						System.out.println("Enter numbers for Trial " + 2);
						while (k2 < size){
						System.out.print("Enter sample #" + k2 +":");
						trial3[i2]= input.nextInt();
						avg2 = avg2 + trial3[i2];
						k2++;
						i2++;
						}
						System.out.println();
//_________________________________________________________________________________	
					
						int k3 = 0;
						int i3 = 0;
						
							System.out.println("Enter numbers for Trial " + 3);
							while (k3 < size){
							System.out.print("Enter sample #" + k3 +":");
							trial4[i3]= input.nextInt();
							avg3 = avg3 + trial4[i3];
							k3++;
							i3++;
							}
							System.out.println();
//_________________________________________________________________________________

			System.out.println("\tSample # \tTrial 1 \tTrial 2 \tTrial 3 \tTrial 4");

			int zero = 0;
			i = 0;
			i1 = 0;
			i2 = 0;
			i3 = 0;
			
			avg = avg/size;
			avg1 = avg1/size;
			avg2 = avg2/size;
			avg3 = avg3/size;
			
			while ( i < size && i1 < size && i2 < size && i3 < size){
			System.out.print("\t" + zero + "\t");	
			System.out.println("\t" + trial1[i] + "\t\t" + trial2[i1] + "\t\t" + trial3[i2] + "\t\t" + trial4[i3]);
			zero++;
			i++;
			i1++;
			i2++;
			i3++;
			}
			System.out.println("\t_______________________________________________________________________");
			System.out.println("Average:\t\t" + avg + "\t\t" + avg1 + "\t\t" + avg2 + "\t\t" + avg3 + "\n");
//_________________________________________________________________________________		
			
			int min = 0;
			int max = 0;
			
			if (avg == avg1 && avg1 == avg2 && avg2 == avg3 && avg3 == avg){
				max = avg;
				min = avg;
			}
			//______________________________________________________________
			if (avg > avg1 && avg > avg2 && avg > avg3)
				max = avg;
			if (avg1 > avg && avg1 > avg2 && avg1 > avg3)
				max = avg1;
			if (avg2 > avg && avg2 > avg1 && avg2 > avg3)
				max = avg2;
			if (avg3 > avg && avg3 > avg1 && avg3 > avg2)
				max = avg3;
			//______________________________________________________________
			if (avg < avg1 && avg < avg2 && avg < avg3)
				min = avg;
			if (avg1 < avg && avg1 < avg2 && avg1 < avg3)
				min = avg1;
			if (avg2 < avg && avg2 < avg1 && avg2 < avg3)
				min = avg2;
			if (avg3 < avg && avg3 < avg1 && avg3 < avg2)
				min = avg3;
			//______________________________________________________________
			System.out.println("Min Average: " + min);
			System.out.println("Max Average: " + max + "\n");
			
			
			if (min == max){
				System.out.print("The trials match EXACTLY!");
			}
			else if (max < (2 * min)){
				System.out.print("The trials concur with each other!");
			}
			else {
				System.out.print("The trials do NOT concur!");
			}
			
			
			
			
			}

		}