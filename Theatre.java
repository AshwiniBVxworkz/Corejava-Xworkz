class Theatre{
	static String movies[]={null,null,null,null,null,null,null,null,null,null};
	static  int index;
	//add/create/save
	public static boolean addMovieName(String movieName){
		System.out.println("addMovieName method started");
		System.out.println("Add a Movie name");
		boolean isAdded=false;
		if(movieName!=null){
			movies[index++]=movieName;
			isAdded=true;
		}else{
			System.out.println("Enter valid movie name");
		}
		System.out.println("addMovieName method ended");
		return isAdded;
	} 
	//read/get
	public static void readMovieName(){
		System.out.println("readMovie method started");
		System.out.println("Movie Names are : ");
		for(int i=0;i<movies.length;i++){
			System.out.println(movies[i]);
		}
		System.out.println("readMovie method ended");
	}
	public static boolean updateMovieName(String oldMovieName, String updateMovieName){
		System.out.println("updateMovieName method Started");
		System.out.println("update a movie name");
		boolean isUpdate=false;
		for(int i=0;i<movies.length;i++){
			if(movies[i].equals(oldMovieName)){
				movies[i]=updateMovieName;
				isUpdate=true;
			}	
		}
		System.out.println("updateMovieName method Ended");
		return isUpdate;
	}
}