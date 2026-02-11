package week1.day2;

public class LibraryAssignment {
	
	String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
	}
	
	void issueBook() {
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		
		LibraryAssignment lib=new LibraryAssignment();
		String bookTitle=lib.addBook("Basic Java");
		lib.issueBook();
		System.out.println(bookTitle);
			
		
	}
	

}
