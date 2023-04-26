class FlipKartTester{
	public static void main(String uber[]){
		System.out.println("Main method Started");
		String itemName="asia";
		double price=FlipKart.searchItems(itemName);
		System.out.println("The Price of single "+itemName+" is " +price);
		double priceWithQuantity=FlipKart.searchItems(itemName,2);
		System.out.println("The  Total Price of "+itemName+" is " +priceWithQuantity);
		System.out.println("Main method Ended");
	}

}