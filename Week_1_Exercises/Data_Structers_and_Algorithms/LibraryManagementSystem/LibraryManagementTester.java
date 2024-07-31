package LibraryManagement;

public class LibraryManagementTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryManagementSystem lms = new LibraryManagementSystem(5);

        lms.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        lms.addBook(new Book(2, "1984", "George Orwell"));
        lms.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));

       System.out.println();
        Book book = lms.linearSearchByTitle("1984");
        System.out.println(book != null ? book : "Book not found");

       System.out.println();
        book = lms.binarySearchByAuthor("1984");
        System.out.println(book != null ? book : "Book not found");
	}

}
