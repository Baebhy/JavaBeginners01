package defaultt;

public class CurrencyConverter {

	public static void main(String[] args) {
		double dollarrate = 1500.56;
		double poundrate = 1729.44;
		double eurorate = 2188.84;
		double dollaramount = 457.62;
		double poundamount = 683.28;
		double euroamount = 888.33;
		double nairaamount = 3860547.9876;
		double dollartonaira = dollaramount * dollarrate;
		System.out.println(dollaramount +" dollars to naira is " + dollartonaira);
		double poundtonaira = poundamount * poundrate;
		System.out.println(poundamount + " pounds to naira is " + poundtonaira);
		double eurotonaira = euroamount * eurorate;
		System.out.println(euroamount + " euros to naira is " + eurotonaira);
		double nairatodollars = nairaamount/dollarrate;
		System.out.println(nairaamount + " naira to dollars is " + nairatodollars);
		double nairatopounds = nairaamount/poundrate;
		System.out.println(nairaamount + " naira to pounds is " + nairatopounds);
		double nairatoeuros = nairaamount/eurorate;
		System.out.println(nairaamount + " naira to euros is " + nairatoeuros);
		
		
		

	}

}
