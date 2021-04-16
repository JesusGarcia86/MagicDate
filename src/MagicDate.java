import java.util.Scanner;
public class MagicDate {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a numeric month: ");
		int month = keyboard.nextInt();
		
		System.out.println("Enter a numeric day: ");
		int day = keyboard.nextInt();
		
		System.out.println("Enter a 2 digit year: ");
		int year = keyboard.nextInt();
		
		if(month * day == year) {
			System.out.print("It's a Magic Year");
		} else {
			System.out.print("It is not a Magic Year");
		}

	}

}
