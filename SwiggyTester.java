class SwiggyTester{
	public static void main(String swiggy[]){
		System.out.println("Main method Started");
		
		String itemName="Goli bajji";
		double price=Swiggy.searchItems(itemName);
		System.out.println("The Price of "+itemName+" is " +price);
		System.out.println("Main method Ended");
	}

}