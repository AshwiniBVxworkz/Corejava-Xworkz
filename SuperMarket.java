class SuperMarket{
	static 	String groceries[]={"Oil","Vinegar","Honey","Sauce","Mustard","Breadcrumps","Pasta","Flour","Baking soda","Daal","Rice","Sugar","Salt","Corn","Moong"};
	static	String chocolates[]={"Cadbury","lindt","Ferrero Rocher","Hersheys","Nestle","Amul chocolates","Parle chocolates","Mars","Toblerone","Snikers","KitKat","Munch","Silk","Fruit and Nut","Perk"};
	static	String shampoos[]={"Head & Shoulders","Dove","Pantene","Garnier","Suave","Sunsilk","Clinic Plus","Himalaya","Mamaearth","Loreal Paris","Herbal Essences","Nyle","Tresemme","Selsun","Indulekha"};
	static	String perfumes[]={"Chanel","Burberry","Gucci","Dolce & Gabbana","HErmes","Eva","FOGG","Miss Dior","Gloossier You","CK One","Dior sauvage","Calvin Klein","Hugo Boss","AZZARo","Mont Blanc"};
	static String soaps[]={"Pears","Mysore Sandal","Dettol","Medimix","Cinthol","Dove","Himalaya","Patanjali","Santhoor","Liril","Biotique","fiama","Nivea","Lux","Venus"};
	static	String brandsOfShirts[]={"Arrow","Peter England","Van Heusen","Zodiac","Louis Phillipe","John Players","Park Avenue","Parx","Wills Lifestyle","Allen Solly","Levi's","Lee 404","Tommy Hilfiger","Blackberrys","Black Coffee"};
	public static void main(String []args){
		System.out.println("Start of main method");
		getGroceries();
		getChocolates();
		getShampoos();
		getPerfumes();
		getSoaps();
		getShirts();
	System.out.println("End of main method");
	}
public static void getGroceries(){
	System.out.println(" ");
	System.out.println("GROCERY ITEMS");
		for(int i=0;i<groceries.length;i++){
			System.out.println(groceries[i]);
		}
	}

public static void getChocolates(){
	System.out.println(" ");
	System.out.println("CHOCOLATES");
		for(int i=0;i<chocolates.length;i++){
			System.out.println(chocolates[i]);
		}
	}
public static void getShampoos(){
	System.out.println(" ");
	System.out.println("SHAMPOOS");
		for(int i=0;i<shampoos.length;i++){
			System.out.println(shampoos[i]);
		}
	}
public static void getPerfumes(){
	System.out.println(" ");
	System.out.println("PERFUMES");
		for(int i=0;i<perfumes.length;i++){
			System.out.println(perfumes[i]);
		}
	}
public static void getSoaps(){
	System.out.println(" ");
	System.out.println("SOAPS");
		for(int i=0;i<soaps.length;i++){
			System.out.println(soaps[i]);
		}
	
	}
public static void getShirts(){
	System.out.println(" ");
	System.out.println("BRANDS OF SHIRTS");
		for(int i=0;i<brandsOfShirts.length;i++){
			System.out.println(brandsOfShirts[i]);
		}
	}

}