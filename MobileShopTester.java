class MobileShopTester{
	public static void main(String mobile[]){
		System.out.println("Main method started");
		//invoking method to add mobile name
		MobileShop.saveMobileName("One Plus ");
		MobileShop.saveMobileName("SAMSUNG");
		MobileShop.saveMobileName("One Plus Nord ");
		MobileShop.saveMobileName("iPhone 12 Pro");
		MobileShop.saveMobileName("Realme GT");
		MobileShop.saveMobileName("Vivo V27 128");
		MobileShop.saveMobileName("Realme 10 Pro");
		MobileShop.saveMobileName("Samsung Galaxy S23");
		MobileShop.saveMobileName("Motorola Moto G82");
		MobileShop.saveMobileName("HUAWEI");
		MobileShop.saveMobileName("Alcatel");
		// invoking method to read mobile names
		MobileShop.readMobileNames();
		// invoking method to update mobile name
		MobileShop.updateMobileName("HUAWEI","OPPO");
		// invoking method to read mobile names
		MobileShop.readMobileNames();
		// invoking method to search mobile name
		String find=MobileShop.readMobileName("One Plus ");
		System.out.println("Searched mobile is : "+find);
		String find1=MobileShop.readMobileName(" Nokia ");
		System.out.println("Searched mobile is : "+find1);
		System.out.println("Main method ended");
	}

}