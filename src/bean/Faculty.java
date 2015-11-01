package bean;

public class Faculty extends Member
{
	
	private String Category;
	private String Course;
	

	public Faculty(String member_Id, String fname, String lname, String dob,
			String sex, String city, String street, int postcode,
			String nationality, long phone_no, long alt_phone, int priority,
			String password, String department, String state, String user_Id,
			String category, String course) {
		super(member_Id, fname, lname, dob, sex, city, street, postcode,
				nationality, phone_no, alt_phone, priority, password,
				department, state, user_Id);
		Category = category;
		Course = course;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getCourse() {
		return Course;
	}

	public void setCourse(String course) {
		Course = course;
	}
	
					
}
