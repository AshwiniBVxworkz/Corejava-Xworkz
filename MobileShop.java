class MobileShop{
	static String mobileNames[]={null, null, null, null, null, null, null, null, null, null };
	static int index;
	//read/add/save
	public static boolean saveMobileName(String mobileName){
		System.out.println("saveMovieName method started");
		boolean isSaved=false;
		if(mobileName!=null && index<mobileNames.length){
			mobileNames[index++]=mobileName;
			isSaved=true;
		}else{
		System.out.println("Cannot add this mobile name");
		}
		System.out.println("saveMovieName method ended");
		return isSaved; 
	}
	//fetch/get
	public static void readMobileNames(){
		System.out.println("Read Mobile name");
		for(int i=0;i<mobileNames.length;i++){
			System.out.println(mobileNames[i]);
		}
		System.out.println("readMobileNames method  ended");
	}
	//update
	public static boolean updateMobileName(String oldMobileName, String updateMobileName){
		System.out.println("updateMobileName method started");
		boolean isUpdated=false;
		for(int i=0;i<mobileNames.length;i++){
			if(mobileNames[i].equals(oldMobileName)){
				mobileNames[i]=updateMobileName;
				isUpdated=true;
			}
		}
		System.out.println("updateMobileName method ended");
		return isUpdated;
	} 
	//searching 
	public static String readMobileName(String mobileName){
		System.out.println("readMobileName method started");
		System.out.println("Search a mobile name");
		for(int i=0;i<mobileNames.length;i++){
			if(mobileNames[i].equals(mobileName))
				return mobileNames[i];
		}
		return "mobile name not found";
	}
}