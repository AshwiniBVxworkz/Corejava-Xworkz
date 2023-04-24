class Swiggy{

	public static double searchItems(String itemName){
		System.out.println("searchItem method Started");
		double price =0.00;
		if("Goli bajji"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price=30.450;
		}
		if("Neer Dose"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 60.230;
		}
		if("Buns"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 40.00;
		}
		if("Akki Roti & Chatni"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 85.00;
		}
		if("Fish fry"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 170.00;
		}
		if("Chicken Biryani"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price=165.00;
		}
		if("Meen Uta"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 80.00;
		}
		if("Kotte Kadbu"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 45.45;
		}
		if("Kadbu"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 105.00;
		}
		if("Mudde & chicken Sambar"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 165.70;
		}
		System.out.println("searchItem method ended");
		return price;
	}

}