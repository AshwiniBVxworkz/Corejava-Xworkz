class DishConnectionTester{
	public static void main(String dishconnect[] ){
		DishConnection dish=new DishConnection(1,"Jio","100","1 month"); 
		System.out.println(dish.dishId+" "+dish.dishName+" "+dish.dishNoChannels+" "+dish.plan);
		DishConnection dish1=new DishConnection(2,"Airtel","120","2 month"); 
		System.out.println(dish1.dishId+" "+dish1.dishName+" "+dish1.dishNoChannels+" "+dish1.plan);
		DishConnection dish2=new DishConnection(3,"Sun Direct","80","1 month"); 
		System.out.println(dish2.dishId+" "+dish2.dishName+" "+dish2.dishNoChannels+" "+dish2.plan);
		DishConnection dish3=new DishConnection(4,"TATA SKY","125","3 month"); 
		System.out.println(dish3.dishId+" "+dish3.dishName+" "+dish3.dishNoChannels+" "+dish3.plan);
		DishConnection dish4=new DishConnection(5,"Videocon","50","1 month"); 
		System.out.println(dish4.dishId+" "+dish4.dishName+" "+dish4.dishNoChannels+" "+dish4.plan);
		DishConnection dish5=new DishConnection(6,"Vodaphone","90","1 month"); 
		System.out.println(dish5.dishId+" "+dish5.dishName+" "+dish5.dishNoChannels+" "+dish5.plan);
		
		
		
}
}