package bean;

public class ConferencePaper extends Publication {
	
	private String Conference_Number;
	private String Conference_Name;
	public ConferencePaper(String lib_Id, String resource_Id,
			String availability, String title, int publish_Year,
			String publish_Format, String author_id, String conference_Number,
			String conference_Name) {
		super(lib_Id, resource_Id, availability, title, publish_Year,
				publish_Format, author_id);
		Conference_Number = conference_Number;
		Conference_Name = conference_Name;
	}
	public String getConference_Number() {
		return Conference_Number;
	}
	public void setConference_Number(String conference_Number) {
		Conference_Number = conference_Number;
	}
	public String getConference_Name() {
		return Conference_Name;
	}
	public void setConference_Name(String conference_Name) {
		Conference_Name = conference_Name;
	}
	
	
}
