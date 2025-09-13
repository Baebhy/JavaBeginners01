package defaultt;

public class CurrencyConverter {

	public static void main(String[] args) {
		float dollarrate = 1500.56f;
		float poundrate = 1729.44f;
		float eurorate = 2188.84f;
		float dollaramount = 457.62f;
		float poundamount = 683.28f;
		float euroamount = 888.33f;
		float nairaamount = 3860547.9876f;
		float dollartonaira = dollaramount * dollarrate;
		System.out.println(dollaramount +" dollars to naira is " + dollartonaira);
		float poundtonaira = poundamount * poundrate;
		System.out.println(poundamount + " pounds to naira is " + poundtonaira);
		float eurotonaira = euroamount * eurorate;
		System.out.println(euroamount + " euros to naira is " + eurotonaira);
		float nairatodollars = nairaamount/dollarrate;
		System.out.println(nairaamount + " naira to dollars is " + nairatodollars);
		float nairatopounds = nairaamount/poundrate;
		System.out.println(nairaamount + " naira to pounds is " + nairatopounds);
		float nairatoeuros = nairaamount/eurorate;
		System.out.println(nairaamount + " naira to euros is " + nairatoeuros);
		
		
		

	}

}
