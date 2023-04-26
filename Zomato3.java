class Zomato3{

	public static double searchItem(String itemName){
		System.out.println("searchItems method Started");
		double price =0.00;
		if("Veg Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price=120.450;
		}
		if("Masala Dose"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 60.230;
		}
		if("Gobi"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 80.00;
		}
		if("French Fries"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 85.00;
		}
		if("Dragon Chicken"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 170.00;
		}
		if("Chicken Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price=165.00;
		}
		if("Chicken Shorma"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 40.00;
		}
		if("Roti Sabzi"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 45.45;
		}
		if("Pizza"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 105.00;
		}
		if("Mutton Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 165.70;
		}
		System.out.println("searchItems method ended");
		return price;
	}
	public static double searchItem(String itemName , int quantity ){
		System.out.println("searchItems method Started");
		double price =0.00;
		if("Veg Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price=120.450*quantity;
		}
		if("Masala Dose"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 60.230*quantity;
		}
		if("Gobi"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 80.00*quantity;
		}
		if("French Fries"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 85.00*quantity;
		}
		if("Dragon Chicken"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 170.00*quantity;
		}
		if("Chicken Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price=165.00*quantity;
		}
		if("Chicken Shorma"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 40.00*quantity;
		}
		if("Roti Sabzi"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 45.45*quantity;
		}
		if("Pizza"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 105.00*quantity;
		}
		if("Mutton Biryani"==itemName){
			System.out.println("Thanks for slecting "+itemName);
			price= 165.70*quantity;
		}
		System.out.println("searchItems method ended");
		return price;
	}
}