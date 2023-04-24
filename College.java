class College{
	static String departments[]={"EEE","Civil","Mech","ECE","CSE","ISE","Mechetronics","Chemical","Aerospace","Architectural","Biotechnology","Nuclear","Petroleum","Marine","Metallurgy"};
	public static void main(String col[]){
		System.out.println("Start of main method");
		System.out.println("Departments in College :");
		getdept();
		System.out.println("End of main method");
		
	}
	public static void getdept(){
	System.out.println("Start of getdept method");
	for(int i=0;i<departments.length;i++){
			System.out.println(departments[i]);
			}
			System.out.println("end of getdept method");
	}
}