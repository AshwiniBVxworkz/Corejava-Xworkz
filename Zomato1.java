class Zomato1{

	public static double searchItems(String itemName){
		System.out.println("searchItems method Started");
		double price1 =0.00;
		if("Veg Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1=120.450;
		}
		if("Masala Dose"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1= 60.230;
		}
		if("Gobi"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1= 80.00;
		}
		if("French Fries"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1= 85.00;
		}
		if("Dragon Chicken"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1= 170.00;
		}
		if("Chicken Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1=165.00;
		}
		if("Chicken Shorma"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1= 40.00;
		}
		if("Roti Sabzi"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1= 45.45;
		}
		if("Pizza"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1= 105.00;
		}
		if("Mutton Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price1= 165.70;
		}
		System.out.println("searchItems method ended");
		return price1;
	}

}