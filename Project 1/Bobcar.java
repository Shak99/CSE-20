import java.util.Scanner;

public class Bobcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		int economy = 35;
		int compact = 45;
		int standard = 95;
		int discount = 0;
		double Package = 0;
		double total;
		int price = 0;
		int platinum=0;

		System.out.println("Available Cars: 1 for Economy, 2 for Compact, 3 for Standard");

		System.out.println("Please choose the rental car: ");
		int car = input.nextInt();

		System.out.println("Please  enter the number of rental days: ");
		int days = input.nextInt();
		//How can I print out blanks?????

		System.out.println("Club Member?: 1 for yes, 0 for no: ");
		int member = input.nextInt();

		if (member == 1){
			System.out.println("Platinum Executive Package?: 1 for yes, 0 for no: ");
			platinum = input.nextInt();
		}

		//Choosing car and price per number of days

		if (car == 1){
			price = economy * days;
			System.out.println("Base: 3 days for a Economy @ $35 per day: " + "+  $" + price);
		}
		else if (car == 2){
			price = compact * days;
			System.out.println("Base: 3 days for a Compact @ $45 per day: " + "+  $" + price);
		} 
		else if (car == 3){
			price = standard * days;
			System.out.println("Base: 3 days for a Standard @ $95 per day: " + "+  $" + price);
		}


		//Member discount with specific car

		if (member == 1 && car == 1){
			discount = (int) (days / 7) * economy;
			System.out.println("Club Member Discount: " + "-  $" + discount);
		} else if (member == 1 && car ==2){
			discount = (int )(days / 7) * compact;
			System.out.println("Club Member Discount: " + "-  $" + discount);
		} else if (member == 1 && car == 3){
			discount = (int) (days / 7) * standard;
			System.out.println("Club Member Discount: " + "-  $" + discount);
		}


		//Price times %15
		if (platinum == 1){
			Package = (double) price * 0.15;
			System.out.println("Platinum Executive Package: " + "+  $" + Package);
		}
		

		total = price - discount + Package;
		System.out.print("\nTotal Estimate for Rental: " + "   $" + total);
		//Total should not come out with a decimal point

		//Total an Platinum Executive(when it isn't a decimal #) should not come out with a decimal point
		//Where's the decimal when I need it?




		//Doctor Java
	}
}
