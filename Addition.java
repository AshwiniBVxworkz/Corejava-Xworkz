class Addition{
	public static void main(String add[]){
		System.out.println("Main Start");
		System.out.println("Addtion of two Numbers");
		add(245,78);
		add(14,89);
		add(678,98);
		System.out.println("Addtion of three Numbers");
		add(4,5,2);
		add(7,79,456);
		System.out.println("Main End");
	}
	public static void add(int a,int b){
		System.out.println(a+b);
	}
	public static void add(int a,int b,int c){
		System.out.println(a+b+c);
	}
	
}   