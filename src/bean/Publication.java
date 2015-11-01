package bean;

public class Publication extends Lib_Resource
{
	
	private String Title;
	private int Publish_Year;
	private String Publish_Format;
	private String author_id;
	
	public Publication(String lib_Id, String resource_Id, String availability,
			String title, int publish_Year, String publish_Format,
			String author_id) {
		super(lib_Id, resource_Id, availability);
		Title = title;
		Publish_Year = publish_Year;
		Publish_Format = publish_Format;
		this.author_id = author_id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public int getPublish_Year() {
		return Publish_Year;
	}

	public void setPublish_Year(int publish_Year) {
		Publish_Year = publish_Year;
	}

	public String getPublish_Format() {
		return Publish_Format;
	}

	public void setPublish_Format(String publish_Format) {
		Publish_Format = publish_Format;
	}

	public String getAuthor_id() {
		return author_id;
	}

	public void setAuthor_id(String author_id) {
		this.author_id = author_id;
	}
	
	
		
}