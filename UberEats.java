class UberEats{

	public static double searchItems(String itemName){
		System.out.println("searchItem method Started");
		double price =0.00;
		if("Idli & Vada"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price=65.500;
		}
		if("Plain dose"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 60.230;
		}
		if("Set Dose"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 40.00;
		}
		if("Chowchow Bath"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 50.00;
		}
		if("Bisi BeleBath"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 60.340;
		}
		if("Palav"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price=65.345;
		}
		if("Curd Rice"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 40.00;
		}
		if("Coffe"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 15.45;
		}
		if("Tea"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 15.00;
		}
		if("Shavige Uppit"==itemName){
			System.out.println("Thanks for slecting"+itemName);
			price= 55.70;
		}
		System.out.println("searchItem method ended");
		return price;
	}

}