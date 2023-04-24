class AirPods{
	//static variable example i.e reinitialization of static variables
	static String mobileName="Boat";
	static int cost=2500;
	static String color="Black";
	static String model="11";
	static String size="Boat ultra";
	static long mobileNumber=6757987689l;
	public static void main(String mobile[]){
		System.out.println("Reinitialization of above mentioned static variables");
		mobileName="Apple";
		cost=5000;
		color="white";
		model="apple1";
		size="3";
		mobileNumber=9796675678l;
		System.out.println("The Mobile Name is: "+mobileName);
		System.out.println("The cost is: "+cost);
		System.out.println("The colour is: "+color);
		System.out.println("The model is: "+model);
		System.out.println("The size is: "+size);
		System.out.println("Mobile number is: "+mobileNumber);
	}

}  