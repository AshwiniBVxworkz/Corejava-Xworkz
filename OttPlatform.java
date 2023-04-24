class OttPlatform{
	static	String kannada[]={"Lucia","U turn","Thithi","Ondu Motteya Kathe","Urvi","Suddi","kahi","The Plan","Hombanna"};
	static String english[]={"PEAKY BLINDERS","strangers Things","Wednesday","Dark","Money Heist","You","squid game","The Crown","The Last Kingdom","Ozark","Elite","Anatomy of Scandal","Criminal united kingdom","Mindhunter","Black Mirror"};
	static String tamil[]={"Vaathi","The Elephant Whispers","Thunnivu","DSP","Beast","Don","Annatthe","Sinam","Love Today","Poochandi","Buffoon"};
	public static void main(String ott[]){
		System.out.println("Start of main method");
		getEnglish();
		getKannada();
		getTamil();
		System.out.println("Start of end method");
		
		
	}
	public static void getEnglish(){
		System.out.println("List of Ott Releases..streamed on Netflix ");
		System.out.println("KANNADA");
		for(int i=0;i<kannada.length;i++){
			System.out.println(kannada[i]);

			}
		System.out.println("******");
	}
	public static void getKannada(){
		System.out.println("ENGLISH");
		for(int j=0;j<english.length;j++){
			System.out.println(english[j]);
			}
		System.out.println("******");
	}
	public static void getTamil(){
	System.out.println("TAMIL");
	for(int k=0;k<tamil.length;k++){
		System.out.println(tamil[k]);
		}
	}



}