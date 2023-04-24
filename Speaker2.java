class Speaker2{
	static boolean isConnected;
	static int currentVolume;
	static int miniVolume=8;
	static int maxVolume;
	public static void main(String spea[]){
		System.out.println("Main method Started ");
		onOrOff();
		onOrOff();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		increaseVolume();
		onOrOff();
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
	public static int increaseVolume(){
		System.out.println("increaseVolume method started");
		if(isConnected==true){
			if(currentVolume<maxVolume){
			System.out.println("Current volume is less than max volume..proceed");
			currentVolume=currentVolume+1;
			System.out.println("The Current Volume is "+currentVolume);
		}else {
			System.out.println("Max Volume reached");
		}
	
	
	}else{
		System.out.println("Gube...Speaker turn on madu..");
	}
	System.out.println("increaseVolume method ended");
	return currentVolume;
	
	}
	

}