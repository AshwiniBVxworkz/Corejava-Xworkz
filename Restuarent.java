class Restuarent{
	static String menu[]={null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;
	//create/save/add
	public static boolean addFoodItem(String foodItem){
		System.out.println("Add Food Item ");
		boolean isAdded=false;
		if(foodItem!=null && index<menu.length){
			menu[index++]=foodItem;
			isAdded=true;
		}else{
		System.out.println("Food Item cannot be added to the menu");
		}
		System.out.println("addFoodItem method ended ");
		return isAdded;
	}
	//read/get/fetch
	public static void fetchFoodItems(){
		System.out.println("fetchFoodItems method started");
		System.out.println("Get Menu");
		for(int i=0;i<menu.length;i++){
			System.out.println(menu[i]);
		}
		System.out.println("fetchFoodItems method ended ");
	}
	//update
	public static boolean updateFoodItem(String oldFoodItem, String updateFoodItem){
		System.out.println("update Food Item ");
		boolean isUpdate=false;
		for(int i=0;i<menu.length;i++){
			if(menu[i].equals(oldFoodItem)){
				menu[i]=updateFoodItem;
				isUpdate=true;
			}
		}
		System.out.println("updateFoodItem method ended");
		return isUpdate;
	}
	//search
	public static String getFoodItem(String foodItem){
		System.out.println( "getFoodItem method started");
		System.out.println("search Food Item ");
		for(int i=0;i<menu.length;i++){
			if(menu[i].equals(foodItem))
				return menu[i];
		}
		return "food item not found in menu";
	}
}