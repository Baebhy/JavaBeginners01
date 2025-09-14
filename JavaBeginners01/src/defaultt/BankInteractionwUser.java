package defaultt;

import java.util.Scanner;

public class BankInteractionwUser {

	public static void main(String[] args) {
		Scanner KeyBoard=new Scanner(System.in);
		String name;
		System.out.println("Please enter your name");
		name=KeyBoard.nextLine();
		System.out.println(name + ", Welcome to Pager Group ATM");
		int Aza;
		System.out.println("Please enter destination 10-digit account number");
		Aza=KeyBoard.nextInt();
		System.out.println(name+", you entered " + Aza);
		
	}

}
