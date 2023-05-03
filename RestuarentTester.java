class RestuarentTester{
	public static void main(String food[]){
		System.out.println("Main method started");
		//invoking method to read Food Item 
		Restuarent.fetchFoodItems();
		System.out.println("South Indain Dishes : ");
		//invoking method to add Food Item
		Restuarent.addFoodItem("Idli");
		Restuarent.addFoodItem("Vada");
		Restuarent.addFoodItem("Masal Dosa");
		Restuarent.addFoodItem("Neer Dosa ");
		Restuarent.addFoodItem("Shavge Bath");
		Restuarent.addFoodItem("Bans");
		Restuarent.addFoodItem("Roti");
		Restuarent.addFoodItem("Pongal");
		Restuarent.addFoodItem("Bisibele Bath");
		Restuarent.addFoodItem("Ghee rice");
		Restuarent.addFoodItem("Plain Dosa");
		Restuarent.addFoodItem("Set Dosa");
		Restuarent.addFoodItem("Palav");
		Restuarent.addFoodItem("Curd Rice ");
		Restuarent.addFoodItem("Puliyogare");
		Restuarent.addFoodItem("Full Meals");
		//invoking method to read Food Items 
		Restuarent.fetchFoodItems();
		//invoking method to update the Food Item
		Restuarent.updateFoodItem("Palav","Veg Biryani");
		//invoking method to read Food Items 
		Restuarent.fetchFoodItems();
		//invoking method to search Food Item 
		String available=Restuarent.getFoodItem("Roti");
		System.out.println("Food available in menu : "+available);
		//invoking method to search Food Item 
		String available1=Restuarent.getFoodItem("Pizza");
		System.out.println("Food available in menu : "+available1);
		System.out.println("Main method ended");
		
	
	}

}