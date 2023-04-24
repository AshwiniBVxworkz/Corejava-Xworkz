class Mixer{
	static boolean isConnected;
	static int maxNumSpeed=4;
	static int miniNumSpeed;
	static int currentNumSpeed;
	public static void main(String []mix){
		System.out.println("Main method is started");
		onOrOff();
		increaseSpeed();
		increaseSpeed();
		increaseSpeed();
		increaseSpeed();
		increaseSpeed();
		onOrOff();
		decreaseSpeed();
		onOrOff();
		decreaseSpeed();
		System.out.println("Main method is Ended");

}
	public static boolean onOrOff(){
		System.out.println("onOrOff started");
		if(isConnected ==false){
			isConnected = true;
		System.out.println("Mixer is turned ON");
	}else if(isConnected==true){
		isConnected=false;
		System.out.println("Mixer is turned OFF");
	}
	System.out.println("onOrOff method ended");
	return isConnected;

	}
	public static int increaseSpeed(){
		System.out.println("IncreaseSpeed is started ");
		if(isConnected==true){
			if(currentNumSpeed<maxNumSpeed){
				System.out.println("Current speed is less than Maximin Speed,proceed......");
				currentNumSpeed=currentNumSpeed+1;
				System.out.println("Current speed  :"+currentNumSpeed);
			}else{
			System.out.println("Maximum Speed is reached");
			}
		}else{
			System.out.println("Mixer switch ON madi........");
		}
		System.out.println("IncreaseSpeed method is ended ");
		return currentNumSpeed;
	}
	public static int decreaseSpeed(){
		System.out.println("decreaseSpeed  method is started ");
		if(isConnected==true){
			if(currentNumSpeed>miniNumSpeed){
				System.out.println("Current speed is more than Maximin Speed,proceed......");
				currentNumSpeed=currentNumSpeed-1;
				System.out.println("Current speed  :"+currentNumSpeed);
			}else{
			System.out.println("Mniimum Speed is reached");
			}
		}else{
			System.out.println("Mixer switch ON madi........");
		}
		System.out.println("decreaseSpeed method is started ");
		return currentNumSpeed;
	}


}