package bean;

public class Book extends Publication {

	private String edition;
	private String isbn;
	private String publisher;
	public Book(String lib_Id, String resource_Id, String availability,
			String title, int publish_Year, String publish_Format,
			String author_id, String edition, String isbn, String publisher) {
		super(lib_Id, resource_Id, availability, title, publish_Year,
				publish_Format, author_id);
		this.edition = edition;
		this.isbn = isbn;
		this.publisher = publisher;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
					
}
