class Games{
	String name;//instance variables 
	String type;
	int player;
	String tools;
	String place;
	//Default constructor
	public Games(){
		System.out.println("The Game :");
	}
	public Games(String name,String type,int player,String tools,String place){
	this.name=name;
	this.type=type;
	this.player=player;
	this.tools=tools;
	this.place=place;
	
	}
}
