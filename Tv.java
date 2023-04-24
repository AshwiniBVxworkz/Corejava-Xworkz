class Tv{

	static boolean isConnect;
	static int currentChannelNumber;
	static int maxChannelNumber=6;
	static int miniChannelNumber;
	public static void main(String []tv){
		System.out.println("Main method started");
		onOrOff();
		nextChannelNumber();
		nextChannelNumber();
		nextChannelNumber();
		previousChannelNumber();
		onOrOff();
		previousChannelNumber();
		System.out.println("Main method Ended");
	}
	public static boolean onOrOff(){
		System.out.println("onOrOff method started");
		if(isConnect==false){
			isConnect=true;
			System.out.println("TV is turned ON");
		}else{
			isConnect=false;
			System.out.println("TV is turned OFF");
		}
	
		System.out.println("onOrOff method is ended");
		return isConnect;
	}
	public static int nextChannelNumber(){	
		System.out.println("nextChannelNumber method started");
		if(isConnect==true){
			if(currentChannelNumber<maxChannelNumber){
			System.out.println("Channel number can be increased......");
			currentChannelNumber=currentChannelNumber+1;
			System.out.println("Present Channel Number is: "+currentChannelNumber);
		}else{
			System.out.println("Maximum Channel Number Reached");
		}
	
		}else{
		System.out.println("Switch ON the TV ");
		
	}	System.out.println("nextChannelNumber method Ended");
		return currentChannelNumber;
	
	}
	public static int previousChannelNumber(){	
		System.out.println("previousChannelNumber method started");
		if(isConnect==true){
			if(currentChannelNumber>=miniChannelNumber){
			System.out.println("Channel number can be decreases");
			currentChannelNumber=currentChannelNumber-1;
			System.out.println("Present Channel Number is: "+currentChannelNumber);
		}else{
			System.out.println("Minimum Channel Number Reached");
		}
	
		}else{
		System.out.println("Switch ON the TV ");	
	}
	System.out.println("previousChannelNumber method Ended");
	return currentChannelNumber;
	
	}
		
}