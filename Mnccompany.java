class MncCompany{
	static String company[]={"Infosys","Accenture","Wipro","Tcs","Cognizent","Capgemini","IBM","Tech.Mahindra","Google","Amazon","Intel","Hp","BoSCH","MindTree","Microsoft"};
	public static void main(String args[]){
		System.out.println("Start of main method");
		getcompany();
		System.out.println("End  of main method");
	}
	public static void getcompany(){
		System.out.println("Start of getcompany method");
		System.out.println("Mnc Companies:");
		for(int i=0;i<company.length;i++){
		System.out.println(company[i]);
			}
		System.out.println("End of getcompany method");
	}
}