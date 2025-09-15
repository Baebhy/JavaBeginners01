/*Currency Converter with user input of amount to be converted with automatic rate application, and with user input on rate*/
package defaultt;

import java.util.Scanner;

public class CurrencyConverterwUserInput {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		float dollaramount;
		System.out.println("Please enter amount in Dollars");
		dollaramount = KeyBoard.nextFloat();
		float dollarrate = 1500.56f; 
		float naira = dollarrate * dollaramount;
		System.out.println(dollaramount + " USD is " + naira + " in Naira" );
		
		float da;
		System.out.println("Please enter amount in Pounds");
		da = KeyBoard.nextFloat();
		float dr;
		System.out.println("Please enter preferred Pounds rate");
		dr = KeyBoard.nextFloat();
		float na = da * dr;
		System.out.println(da + " Pounds is " + na + " in Naira" );
		

	}

}
