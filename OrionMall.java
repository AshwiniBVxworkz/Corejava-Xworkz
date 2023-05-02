class OrionMall{
	static String shopNames[]={null, null, null, null, null, null, null, null, null, null, null, null, null, null,null};
	static int index;
	//create/add/save
	public static boolean addShopName(String shopName){
		System.out.println("Add a  Shop Name ");
		boolean isAdded=false;
		if(shopName!=null){
			shopNames[index++]=shopName;
			isAdded=true;
		}else{
		System.out.println("Shop Name doesnot exist");
		}
		System.out.println("addShopName method ended ");
		return isAdded;
	}
	//read/fetch/get
	public static void readShopName(){
		System.out.println("readShopName method started");
		System.out.println("Shop Names are");
		for(int i=0;i<shopNames.length;i++){
			System.out.println(shopNames[i]);
		}
		System.out.println("readShopName method ended");
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
}