class Modulus{
	public static void main(String mod[]){
		System.out.println("Main Start");
		System.out.println("calling method mod");
		mod(20,2);
		mod(14,28);
		mod(65,7);
		System.out.println("Main End");
	}

	public static void mod(int a,int b){
		System.out.println(a%b);
		return ;
	}
}  