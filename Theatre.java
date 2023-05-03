class Theatre{
	static String movies[]={null,null,null,null,null,null,null,null,null,null};;
	static  int index;
	//add/create/save
	public static boolean addMovieName(String movieName){
		System.out.println("addMovieName method started");
		System.out.println("Add a Movie name");
		boolean isAdded=false;
		if(movieName!=null && index<movies.length){
			movies[index++]=movieName;
			isAdded=true;
		}else{
			System.out.println(" movie name cannot be added");
		}
		System.out.println("addMovieName method ended");
		return isAdded;
	} 
	//read/get
	public static void readMovieNames(){
		System.out.println("readMovieNames method started");
		System.out.println("Movie Names are : ");
		for(int i=0;i<movies.length;i++){
			System.out.println(movies[i]);
		}
		System.out.println("readMovieNames method ended");
	}
	//update
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
	//search
	public static String readMovieName(String movieName){
		System.out.println("readMovieName method started");
		System.out.println("search a movie name");
		for(int i=0;i<movies.length;i++){
			if(movies[i].equals(movieName))
				return movies[i];
		}return "movie not available";
	}
}