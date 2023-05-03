class TheatreTester{
	public static void main(String movie[]){
		System.out.println("Main method started");
		// invoking method to read movie name
		Theatre.readMovieNames();
		// invoking method to add movie name
		System.out.println("Add Movie Names");
		Theatre.addMovieName("A");
		Theatre.addMovieName("Simple aag ond Love Story");
		Theatre.addMovieName("Charlie 777");
		Theatre.addMovieName("Om");
		Theatre.addMovieName("Dia");
		Theatre.addMovieName("Love Mocktail");
		Theatre.addMovieName("Sita Ramam");
		Theatre.addMovieName("Banglore Days");
		Theatre.addMovieName("Kirik Party");
		Theatre.addMovieName("Ulidavaru Kandanthe");
		Theatre.addMovieName("Ush");
		// invoking method to read movie names
		Theatre.readMovieNames();
		// invoking method to update movie name
		Theatre.updateMovieName("A","Kantara");
		// invoking method to read movie names
		Theatre.readMovieNames();
		System.out.println("Main method ended");
		// invoking method to search movie name
		String present=Theatre.readMovieName("Om");
		System.out.println("Movie available is : "+present);
		// invoking method to search movie name
		String present1=Theatre.readMovieName("Ush");
		System.out.println("Movie available is : "+present1);
	}
}