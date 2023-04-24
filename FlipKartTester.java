class FlipKartTester{
	public static void main(String uber[]){
		System.out.println("Main method Started");
		
		String itemName="asia";
		double price=FlipKart.searchItems(itemName);
		System.out.println("The Price of "+itemName+" is " +price);
		System.out.println("Main method Ended");
	}

}