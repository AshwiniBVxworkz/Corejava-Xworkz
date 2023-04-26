class Multiply{
	public static void main(String mul[]){
		System.out.println("Main Start");
		System.out.println("Multiplication of two Numbers");
		multiply(245,78);
		multiply(14,5);
		multiply(9,98);
		System.out.println("Multiplication of three Numbers");
		multiply(3,5,67);
		multiply(39,45,267);
		System.out.println("Main End");
	}
	public static void multiply(int a,int b){
		System.out.println(a*b);
	}
	public static void multiply(int a,int b,int c){
		System.out.println(a*b*c);
	}
}  