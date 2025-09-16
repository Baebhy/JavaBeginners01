/*BMI calculator with User interacion*/

package defaultt;

import java.util.Scanner;

public class BMICalculator {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String name;
		System.out.println("Please enter your name");
		name = keyboard.next();
		int age;
		System.out.println("Please enter your age");
		age = keyboard.nextInt();
		float weight, height;
		System.out.println("Please enter your Weight (in kg)");
		weight = keyboard.nextFloat();
		System.out.println("Please enter your height (in metres)");
		height = keyboard.nextFloat();
		float BMI;
	    BMI = weight / (height * height);
	    System.out.println(name + " your BMI is " + BMI );
	    
	    if (BMI < 30) {
	    	System.out.println("Underweight");
	    }
	    
	    else if (BMI >= 30 && BMI < 50) {
	    	System.out.println("Normal");
	    }
	    
	    else if (BMI >= 50 && BMI <= 80) {
	    	System.out.println("Overweight");
	    }
	    
	    else {
	    	System.out.println("Obese");
	    }
	    
	    
	   
	    
		
		
		

	}

}
