class Cake{
	String shape;//instance variable
	String flavour;
	String design;
	double weight;
	String color;
	int price;
	//default constructor
	public Cake(){
	System.out.println("Default Constructor");
	}
	//parameterised constructor
	public Cake(String shp, String flv, String dsg,double wgh, String clr,int p){
		System.out.println("Artistic Designer Cakes");
		shape=shp;
		flavour=flv;//local variable 
		design=dsg;
		weight=wgh;
		color=clr;
		price=p;
	}

}