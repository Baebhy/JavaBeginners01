package defaultt;

import java.util.Scanner;

public class CurrencyConverterwUserInput {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		float dollaramount;
		System.out.println("Please enter amount in dollars");
		dollaramount = KeyBoard.nextFloat();
		float dollarrate = 1500.56f; 
		float naira = dollarrate * dollaramount;
		System.out.println(dollaramount + "USD is " + naira + " in naira" );
		

	}

}
