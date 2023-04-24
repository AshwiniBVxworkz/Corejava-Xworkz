class Hospital{
	static String docNames[]={"Dr.Nandini","Dr.Vijay","Dr.Pallavi","Dr.PAvan","dr.Sunitha","Dr.Amith","Dr.Chandrashekar","Dr.Palguni","Dr.Madan","Dr.Mamatha","Dr.Renuka","Dr.Apoorva","Dr.Ajay","Dr. Bharath","Dr.Susthmitha"};
	public static void main(String hos[]){
		System.out.println("Start of main method ");
	System.out.println("Doctors on duty: ");
	System.out.println("calling of getdocNames method ");
	getdocNames();
	System.out.println("End of main method ");
		
	}
	public static void getdocNames(){
		System.out.println("Start of getdocNames method");
		for(int i=0;i<docNames.length;i++){
		System.out.println( docNames[i]);
		
		}
		System.out.println("End of getdocNames method ");
		
	}
}