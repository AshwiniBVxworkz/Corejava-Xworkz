class OrionMall{
	static String shopNames[]={null, null, null, null, null, null, null, null, null, null, null, null, null, null,null};
	static int index;
	//create/add/save
	public static boolean addShopName(String shopName){
		System.out.println("Add a  Shop Name ");
		boolean isAdded=false;
		if(shopName!=null && index<shopNames.length){
			shopNames[index++]=shopName;
			isAdded=true;
		}else{
		System.out.println("Shop Name cannot be included in this list");
		}
		System.out.println("addShopName method ended ");
		return isAdded;
	}
	//read/fetch/get
	public static void readShopNames(){
		System.out.println("readShopNames method started");
		System.out.println("Shop Names are");
		for(int i=0;i<shopNames.length;i++){
			System.out.println(shopNames[i]);
		}
		System.out.println("readShopNames method ended");
	} 
	//update
	public static boolean updateShopName(String oldShopName, String updateShopName){
		System.out.println("updateShopName method started");
		boolean isUpdated=false;
		for(int i=0;i<shopNames.length;i++){
			if(shopNames[i].equals(oldShopName)){
				shopNames[i]= updateShopName;
				isUpdated=true;
			}
		}
		System.out.println("updateShopName method Ended");
		return isUpdated;
	}
	//searching 
	public static String readShopName(String shopName){
		System.out.println("readShopName method started");
		System.out.println("search a shop ");
		for(int i=0;i<shopNames.length;i++){
			if(shopNames[i].equals(shopName))
			return shopNames[i];
		}
		return "shop name not found";
	}
}