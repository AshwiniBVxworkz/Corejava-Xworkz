class OrionMallTester{
	public static void main(String shop[]){
		System.out.println("Main method started");
		//invoking method to read shop names
		OrionMall.readShopNames();
		//invoking method to add Shop Name
		OrionMall.addShopName("Zudio");
		OrionMall.addShopName("Allen Solley");
		OrionMall.addShopName("Columbia");
		OrionMall.addShopName("Shoppers Stop");
		OrionMall.addShopName("Skechers");
		OrionMall.addShopName("Van Heusen Women");
		OrionMall.addShopName("FOSSIl");
		OrionMall.addShopName("Adidas");
		OrionMall.addShopName("Jockey");
		OrionMall.addShopName("Steve Madden ");
		OrionMall.addShopName("Royce' Chocolate");
		OrionMall.addShopName("Pure Home");
		OrionMall.addShopName("Nykaa");
		OrionMall.addShopName("Jack&Jonas");
		OrionMall.addShopName("ROSSO BRUNELLO");
		OrionMall.addShopName("Parcos");
		//invoking method to read shop names
		OrionMall.readShopNames();
		//invoking method to update shop name
		OrionMall.updateShopName("Nykaa","Mother care");
		//invoking method to read shop names
		OrionMall.readShopNames();
		//invoking method to search a shop name
		String present=OrionMall.readShopName("Celio");
		System.out.println("Shop available is : "+present);
		//invoking method to search a shop name
		String present1=OrionMall.readShopName("Zudio");
		System.out.println("Shop available is : "+present1);
		System.out.println("Main method ended");
	}
}