import java.util.Scanner;

public class Interview {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String name;
		
		
		System.out.print( "What is your name?");
		name = input.next();
		System.out.print("Their name is ");
		System.out.println(name);
		
		int age;
		System.out.print("How old are you?");
		age = input.nextInt();
		System.out.println("They are " + age + " years old.");
		
		String City;
		System.out.print("Where are you from?");
		City = input.nextLine();
		System.out.println("They live in " + City);
		
		String Major;
		System.out.print("What's your major?");
		Major = input.nextLine();
		System.out.println("Their major is " + Major);
		
		String TvShow;
		System.out.print("What's your favorite TV show?");
		TvShow = input.nextLine();
		System.out.print("Their favorite show is " + TvShow);
	 

	}

}
