class CreditCard{
	static  String cardNames[]={"Axis Bank Ace Creedit Card","SBI Card Elite","Cashback SBI Credit Card","Flipkart Axis Bank Credit Card","Amazon Pay ICICI Credit Card","InterMiles HDFC Signature Credit Card","Standard Chartered EaseMyTrip Credit Card","Axix Bank Signature Credit Card","BPCL Card Octane Credit card","HDFC Card prime"};
	public static void main(String creditcard[])
	{
		System.out.println("Start of main method");
		System.out.println("Calling of getCardNames methods");
		getCardNames();
		System.out.println("End of main method");
	}
	public static void getCardNames(){
		System.out.println("Start of getCardNames method");
		System.out.println("Credit Cards available in India:");
		for(int i=0;i<cardNames.length;i++){
			System.out.println(cardNames[i]);
		}
		System.out.println("End of getCardNames method");
	
	}
}
