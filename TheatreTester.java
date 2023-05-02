class TheatreTester{
	public static void main(String movie[]){
		// invoking method to add movie name
		System.out.println("Main method started");
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
		// invoking method to read movie name
		Theatre.readMovieName();
		// invoking method to update movie name
		Theatre.updateMovieName("A","Kantara");
		System.out.println("Main method ended");
		// invoking method to read movie name
		Theatre.readMovieName();
	}
}