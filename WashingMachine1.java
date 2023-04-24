class WashingMachine1{
	static boolean isConnected;
	static String steamCycle[]={"Cotten","Baby care","Mix","Sports Wear","Delicate","Quick 30","Wool"};
	static int temperature=18;
	public static void main(String machine[]){
		System.out.println("Main method is started");
		onOrOff();
		selectFabric();
		System.out.println("Main method is started");
	}
	
	public static boolean onOrOff(){
		System.out.println("onOrOff method started");
		if(isConnected ==false){
			isConnected = true;
			System.out.println("Washing Machine is turned ON");
		}else if(isConnected==true){
			isConnected=false;
			System.out.println("Washing Machine is turned OFF");
		}
		System.out.println("onOrOff method ended");
		return isConnected;
	}

	public static String[]  selectFabric(){
		System.out.println("selectFabric  method started");	
		if (isConnected==true){
			for(int i=0;i<steamCycle.length;i++){
			if(steamCycle[i].equals("Cotten")){
				System.out.println("1500 RPM");
				temperature=temperature+1;
				System.out.println("Temperature: "+temperature);
				break;
			}else if(steamCycle[i].equals("Wool")){
				System.out.println("500 RPM");
				temperature=temperature-1;
				System.out.println("Temperature: "+temperature);
				break;
			}
			}
			}
		else{
		System.out.println("Switch ON madrooo....");
		}	
		System.out.println("selectFabric  method started");
		return steamCycle;
	}

 
}