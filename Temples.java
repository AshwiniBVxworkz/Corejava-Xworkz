class Temples{
	static String []godNames={"Shiva","Bhramha","Vishnu","Parvathi","Lakshmi","Sarasvathi","Ganesha","Rama","Krishna","Chamundeshwari","Durgi","Subramanya","Sai Baba","Raghavendra Swamy","Manjunatheshwara"};
	public static void main(String tem[]){
		System.out.println("Start of main method  ");
		System.out.println("Calling getNames method");
		getGodNames();
		System.out.println("End of main method");
	}
public static void getGodNames(){
	System.out.println("Start of getNames method  ");
	System.out.println("Gods:  ");
	for(int i=0;i<godNames.length;i++){
		System.out.println(godNames[i]);

		}
System.out.println("End  of getNames method  ");
	}
} 