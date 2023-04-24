class Zomato{

	public static double searchItem(String itemName){
		System.out.println("searchItem method Started");
		double price =0.00;
		if("Veg Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			return 120.450;
		}
		if("Masala Dose"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			return 60.230;
		}
		if("Gobi"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			return 80.00;
		}
		if("French Fries"==itemName){
			System.out.println("Thanks for slecting " +itemName);
			return 85.00;
		}
		if("Dragon Chicken"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			return 170.00;
		}
		if("Chicken Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			return 165.00;
		}
		if("Chicken Shorma"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			return 40.00;
		}
		if("Roti Sabzi"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			return 45.45;
		}
		if("Pizza"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			return 105.00;
		}
		if("Mutton Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			return 165.70;
		}
		System.out.println("searchItem method ended");
		return price;
	}

}