class LibraryTester{
	public static void main(String books[]){
	System.out.println("Main method started");
	//invoking method to add a book name
	Library.addBookName("IT ENDS WITH US");
	Library.addBookName("REMINDERS OF HIM");
	Library.addBookName("HEART BONES");
	Library.addBookName("finding CINDERELLA");
	Library.addBookName("half girlfriend");
	Library.addBookName("2 STATES");
	Library.addBookName("WHAT YOUNG INDIA WANTS");
	Library.addBookName("Here, There and Everywhere");
	Library.addBookName("The Blue Umbrella");
	Library.addBookName("falling in love again");
	Library.addBookName("The Great Train Again");
	Library.addBookName("JUGARI CROSS");
	Library.addBookName("The Bird with golden wings");
	Library.addBookName("The GOPI Diaries");
	Library.addBookName("Three Thousand Stiches");
	//invoking method to read book names
	Library.getBookNames();
	// invoking method to update book name
	Library.updateBookName("2 STATES","UGLY LOVE");
	//invoking method to read book names
	Library.getBookNames();
	System.out.println("Main method ended");
	}

}