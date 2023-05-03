class TeaShopTester{
	public static void main(String tea[]){
		System.out.println("Main method started");
		TeaShop.getTeaNames(); // invoking method to read tea names
		TeaShop.addTeaName("Black Tea");//invoking method to add tea name
		TeaShop.addTeaName("Normal Tea");//invoking method to add tea name
		TeaShop.addTeaName("Lemon Tea");//invoking method to add tea name
		TeaShop.addTeaName("Masala Tea ");//invoking method to add tea name
		TeaShop.addTeaName("Green Tea");//invoking method to add tea name
		TeaShop.addTeaName("Ginger Tea");//invoking method to add tea name
		TeaShop.getTeaNames();//invoking method to read tea names
		TeaShop.updateTeaName("Green Tea","Ginger Masala Tea");//invoking method to update tea name
		TeaShop.getTeaNames();//invoking method to read tea names
		String isPresent=TeaShop.getTeaName("Lemon Tea");//invoking method to search tea name
		System.out.println("Search item is: "+isPresent);
		String isPresent1=TeaShop.getTeaName("White Tea");//invoking method to search tea name
		System.out.println("Search item is: "+isPresent1);
		System.out.println("Main method ended");
	}

}