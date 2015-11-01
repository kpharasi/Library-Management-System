package bean;

public class Author {

	private String author_id;
	private String fname;
	private String lmame;
	
	public Author(String author_id, String fname, String lmame) {
		super();
		this.author_id = author_id;
		this.fname = fname;
		this.lmame = lmame;
	}

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLmame() {
		return lmame;
	}

	public void setLmame(String lmame) {
		this.lmame = lmame;
	}
	
	
}
