
import java.util.Scanner;
public class Manipulate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2;
		
		float n3, n4;
		
		short n5, n6;
		
		double n7, n8;
		
		Scanner number = new Scanner(System.in);
		
		System.out.print("The Integers are : ");
		n1 = number.nextInt();
		n2 = number.nextInt();
		int add;
		add = n1+ n2;
		System.out.println("Addition is: " + add);
		int sub;
		sub = n1 - n2;
		System.out.println("Subtraction is: " + sub);
		int mult;
		mult = n1 * n2;
		System.out.println("Multiplication is: " + mult);
		int div;
		div = n1 / n2;
		System.out.println("Division is: " + div);
		int mod;
		mod = n1 % n2;
		System.out.println ("Module is: " + mod);
		//___________________________________________________________________
		
		System.out.print("The Floats are: ");
		n3 = number.nextFloat();
		n4 = number.nextFloat();
		float ad;
		ad = n3 + n4;
		System.out.println("Addition is: " + ad);
		float sb;
		sb = n3 - n4;
		System.out.println("Subtraction is: " + sb);
		float mul;
		mul = n3 * n4;
		System.out.println("Multiplication is: " + mul);
		float dv;
		dv = n3 / n4;
		System.out.println("Division is: " + dv);
		float md;
		md = n3 % n4;
		System.out.println ("Module is: " + md);
		//____________________________________________________________________
		
		System.out.print("The Shorts are: ");
		n5 = number.nextShort();
		n6 = number.nextShort();
		short addd;
		addd = (short) (n5 + n6);
		System.out.println("Addition is: " + addd);
		short suub;
		suub = (short) (n5 - n6);
		System.out.println("Subtraction is: " + suub);
		short multt;
		multt = (short) (n5 * n6);
		System.out.println("Multiplication is: " + multt);
		short diiv;
		diiv = (short) (n5 / n6);
		System.out.println("Division is: " + diiv);
		short mood;
		mood = (short) (n5 % n6);
		System.out.println ("Module is: " + mood);
		//______________________________________________________________________
		
		System.out.print("The Doubles are: ");
		n7 = number.nextDouble();
		n8 = number.nextDouble();
		double add_d;
		add_d = (n7 + n8);
		System.out.println("Addition is: " + add_d);
		double su_ub;
		su_ub = (n7 - n8);
		System.out.println("Subtraction is: " + su_ub);
		double mul_tt;
		mul_tt = (n7 * n8);
		System.out.println("Multiplication is: " + mul_tt);
		double di_iv;
		di_iv = (n7 / n8);
		System.out.println("Division is: " + di_iv);
		double mo_od;
		mo_od = (n7 % n8);
		System.out.println ("Module is: " + mo_od);

	}

}
