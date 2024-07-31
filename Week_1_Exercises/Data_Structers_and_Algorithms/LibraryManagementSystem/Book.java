package LibraryManagement;

public class Book {
	private int bookId;
    private String title;
    private String author;
	public Book(int bookId, String title, String author) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + "]";
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}