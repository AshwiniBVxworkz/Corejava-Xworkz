class ZomatoTester{
	//java method
	public static void main(String zomato[]){
		System.out.println("Main method Started");
		//invoking method,static methods are always invoked by class name.methodname
		String itemName="Pizza";
		double price=Zomato.searchItem(itemName);
		System.out.println("The Price of "+itemName+" is Rs "+price);
		double price1=Zomato1.searchItems(itemName);
		System.out.println("The Price of "+itemName+" is Rs "+price1);
		System.out.println("Main method Ended");
	}

}	