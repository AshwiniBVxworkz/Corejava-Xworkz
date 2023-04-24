class Fan1{
	static boolean isConnected;
	static int maxSpeed=6;
	static int miniSpeed;
	static int currentSpeed;
	public static void main(String []mix){
		System.out.println("Main method is started");
		onOrOff();
		increaseSpeed();
		increaseSpeed();
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
			System.out.println("Fan is turned ON");
		}else if(isConnected==true){
		isConnected=false;
		System.out.println("Fan is turned OFF");
	}
	System.out.println("onOrOff method ended");
	return isConnected;

	}
	public static int increaseSpeed(){
		System.out.println("IncreaseSpeed is started ");
		if(isConnected==true){
			if(currentSpeed<maxSpeed){
				System.out.println("Current speed is less than Maximun Speed,proceed......");
				currentSpeed=currentSpeed+1;
				System.out.println("Current speed  :"+currentSpeed);
			}else{
			System.out.println("Maximum Speed is reached");
			}
		}else{
			System.out.println("Fan ON madi........");
		}
		System.out.println("IncreaseSpeed method is ended ");
		return currentSpeed;
	}
	public static int decreaseSpeed(){
		System.out.println("decreaseSpeed  method is started ");
		if(isConnected==true){
			if(currentSpeed>=miniSpeed){
				System.out.println("Current speed is more than Maximun Speed,proceed......");
				currentSpeed=currentSpeed-1;
				System.out.println("Current speed  :"+currentSpeed);
			}else{
			System.out.println("Minimum Speed is reached");
			}
		}else{
			System.out.println("Fan switch ON madi........");
		}
		System.out.println("decreaseSpeed method is started ");
		return currentSpeed;
	}


}