class RestuarentTester{
	public static void main(String food[]){
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
		//invoking method to read Food Item 
		Restuarent.fetchFoodItem();
		//invoking method to update the Food Item
		Restuarent.updateFoodItem("Palav","Veg Biryani");
		//invoking method to read Food Item 
		Restuarent.fetchFoodItem();
		
	
	}

}