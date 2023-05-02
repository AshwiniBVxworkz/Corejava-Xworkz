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
		// invoking method to read mobile name
		MobileShop.readMobileName();
		// invoking method to update mobile name
		MobileShop.updateMobileName("HUAWEI","OPPO");
		// invoking method to read mobile name
		MobileShop.readMobileName();
		System.out.println("Main method ended");
	}

}