class Speaker1{
	static boolean isConnected;
	public static void main(String spea[]){
		System.out.println("Main method Started ");
		boolean connected=onOrOff();
		System .out.println("Speaker is connected: "+connected);
		boolean connected1=onOrOff();
		System .out.println("Speaker is connected: "+connected1);
		boolean connected2=onOrOff();
		System .out.println("Speaker is connected: "+connected2);
	
		System.out.println("Main method Ended ");

		
	}
	public static boolean onOrOff(){
		System.out.println("onOrOff started");
		if(isConnected ==false){
			isConnected = true;
		System.out.println("Speaker is turned ON");
	}
	else if(isConnected==true){
		isConnected=false;
		System.out.println("Speaker is turned OFF");
	}
	System.out.println("onOrOff method ended");
	return isConnected;

	}
	

}