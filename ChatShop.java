class ChatShop{
	static String chats[]={"Pani puri","Masal puri","Allo Chat","Bhelpuri","Tikki Chat","Dahi puri","Sukha Bhel","Aloo Chat","Samosa masala","Sev Puri","Palak Chat","Dahi  vada","Chana Chat","Vada Pav","Ram Ladoo"};
	public static void main(String []args){
		System.out.println("Start of Main method  ");
		System.out.println("Famous Chats:  ");
		getchats();
		System.out.println("End of main method ");
	}
	public static void getchats(){
				System.out.println("Start of getchats  method  ");

		for(int i=0;i<chats.length;i++){
			System.out.println(chats[i]);
			}
				System.out.println("End of gtechats method  ");

	}
}