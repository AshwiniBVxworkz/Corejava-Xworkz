class Netflix{
	static  String kannadaMovies[]={"A","Om","Dia","Kanthara","Uppi 2","H2O","Bandhana","KGF","",""};
	static String tamilMovies[]={"Ps1","Shivaji","Enemy","Singham","Pasha","Vikram","Sir","Master","Vathi"};
	public static void main(String net[]){
		System.out.println("Start of main method");
		getKannadaMovies();
		getTamilMovies();
		System.out.println("End of main method");
	}
	public static  void getKannadaMovies(){
		System.out.println("calling getKannadaMovies method:");
		System.out.println("KANNADA MOVIES");
		for(int i=0;i<kannadaMovies.length;i++){
			System.out.println(kannadaMovies[i]);
			
	
	}
	return;
	}
	public static  void getTamilMovies(){
		System.out.println("calling getTamilMovies method:");
		System.out.println("TAMIL MOVIES");
		for(int i=0;i<tamilMovies.length;i++){
			System.out.println(tamilMovies[i]);
			
	}
	return;
	}
	
	
}