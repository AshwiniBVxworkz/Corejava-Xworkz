class ZomatoTest{
	//java method
	public static void main(String zomato[]){
		System.out.println("Main method Started");
		//invoking method,static methods are always invoked by class name.methodname
		String itemName="Pizza";
		double priceForSingle=Zomato3.searchItem(itemName);
		System.out.println("The Price of single "+itemName+" is Rs "+priceForSingle);
		double priceWithQuantity=Zomato3.searchItem(itemName , 12);
		System.out.println("The Price of single "+itemName+" is Rs "+priceForSingle);
		System.out.println("The total  Price of "+itemName+" is Rs "+priceWithQuantity);
		System.out.println("Main method Ended");
	}

}	