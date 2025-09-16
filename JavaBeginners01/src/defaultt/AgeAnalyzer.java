/*Age analyzer*/

package defaultt;

import java.util.Scanner;

public class AgeAnalyzer {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String name;
		System.out.println("Please enter your name");
		name = keyboard.next();
		int yearofbirth;
		System.out.println(name + " Please enter your year of birth");
		yearofbirth = keyboard.nextInt();
		int currentyear;
		System.out.println(name + " Please enter the current year");
		currentyear = keyboard.nextInt();
		int destyear;
		System.out.println("Please enter the age you want to know its year");
		destyear = keyboard.nextInt();
		int age, yearfuture;
		age = currentyear - yearofbirth;
		yearfuture = yearofbirth + destyear;
		System.out.println(name + ", you are currently " + age + "years old and you will be " + destyear + "years old in the year " + yearfuture);

	}

}
