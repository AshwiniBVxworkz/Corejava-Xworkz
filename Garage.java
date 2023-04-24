class Garage{
	static	String []workersName={"Abhay","Aamir","Shiva","Bhavesh","Suresh","Mohan","Nataraj","Naveen","Vinod","Madan","Vinay","Shahid","John","Nuthan","chandan"};
	public static void main(String garage[]){
		System.out.println("Start of Main method");
		System.out.println("Callin  getworkersName method");
		getworkersName();
		System.out.println("End of Main method");
	}
	public static void getworkersName(){
		
		for(int i=0;i<workersName.length;i++){
			System.out.println(workersName[i]);
		}
	System.out.println("End of  getworkersName method");	
	}

	
}