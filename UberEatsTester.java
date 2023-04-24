class UberEatsTester{
	public static void main(String uber[]){
		System.out.println("Main method Started");
		
		String itemName="Palav";
		double price=UberEats.searchItems(itemName);
		System.out.println("The Price of "+itemName+" is " +price);
		System.out.println("Main method Ended");
	}

}