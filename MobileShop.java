class MobileShop{
	static String mobileNames[]={null, null, null, null, null, null, null, null, null, null };
	static int index;
	//read/add/save
	public static boolean saveMobileName(String mobileName){
		System.out.println("saveMovieName method started");
		boolean isSaved=false;
		if(mobileName!=null){
			mobileNames[index++]=mobileName;
			isSaved=true;
		}else{
		System.out.println("No mobile exist by this name");
		}
		System.out.println("saveMovieName method ended");
		return isSaved; 
	}
	//read/get
	public static void readMobileName(){
		System.out.println("Read Mobile name");
		for(int i=0;i<mobileNames.length;i++){
			System.out.println(mobileNames[i]);
		}
		System.out.println("readMobileName ended");
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
}