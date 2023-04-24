class FindNum{
	public static void main(String[] args){
		int []pName={1,2,3,4,5,6,2,4,8,9};
		for(int i=0;i<pName.length;i++){
			if(pName[i]>2){
				System.out.println("Number found : "+pName[i]);
			}
			
		else{
		System.out.println("Number not found");
		}
		
		}
	}

}