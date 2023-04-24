class TouristPlace{
	
	static String placeNames[]={"Mysore: Palace","Goa: Beach","Madikeri: Waterfalls & Nature","Jaipur: Amer Fort","Agra: Taj Mahal","Munnar : Tea Gardens and Lakes","Gokarna: Land of palm tress and blue seas","Manali: forests and streams","Lakshadweep: Blue Sea","Delhi: India Gate and  Qutub Minar","Himachal Pradesh: Dalhousie","Allepey: Backwaters and Beaches","Jammu and Kashmir:lake and magnetic Hills","Punjab:Amrithsar and Golden Temple","Otoy:Mountains and  Lakes"};
	public static void main(String tour[]){
		System.out.println("Start of main method");
		System.out.println("Calling getPlace() method");
		getPlace();
		System.out.println("End of main method");
	}
	public static void getPlace(){
		System.out.println("Start of getPlace method");
		System.out.println("Tourist places in India:");
		for(int i=0;i<placeNames.length;i++){
			System.out.println(placeNames[i]);

		}
		System.out.println("End of getPlace method");	
	}

}