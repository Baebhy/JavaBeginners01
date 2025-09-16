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
		int agein2025, year100;
		agein2025 = 2025 - yearofbirth;
		year100 = yearofbirth + 100;
		System.out.println(name + ", you are currently " + agein2025 + "years old and you will be 100years old in the year " + year100);

	}

}
