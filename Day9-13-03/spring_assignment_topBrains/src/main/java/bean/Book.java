package bean;

public class Book {
	private int bookId;
	private String title;
	private String author;
	
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
	
	public void displayBookDetails() {
		System.out.println("\tBook Id: " + this.bookId);
		System.out.println("\tTitle: " + this.title);
		System.out.println("\tAuthor: " + this.author);
	}
	
	

}
