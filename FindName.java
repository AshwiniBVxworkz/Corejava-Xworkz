class FindName{
	public static void main(String[] args){
		String []pName={"Darshan","Ganavi","Aishu","Ashwini","Suhas","Guru","Chandru"};
		for(int i=0;i<pName.length;i++){
			if(pName[i].equals("Ashwini")){
				System.out.println("Name found : "+pName[i]);
				break;
			}
			
		else{
		System.out.println("Name not found");
		}
		
		}
	}

}