package bean;

public class Student extends Member 
{
	
	private String Category;
	private String Degree_Pgm;
	private String Stud_Class;
	
	
	public Student(String member_Id, String fname, String lname, String dob,
			String sex, String city, String street, int postcode,
			String nationality, long phone_no, long alt_phone, int priority,
			String password, String department, String state, String user_Id,
			String category, String degree_Pgm, String stud_Class) {
		super(member_Id, fname, lname, dob, sex, city, street, postcode,
				nationality, phone_no, alt_phone, priority, password,
				department, state, user_Id);
		Category = category;
		Degree_Pgm = degree_Pgm;
		Stud_Class = stud_Class;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getDegree_Pgm() {
		return Degree_Pgm;
	}

	public void setDegree_Pgm(String degree_Pgm) {
		Degree_Pgm = degree_Pgm;
	}

	public String getStud_Class() {
		return Stud_Class;
	}

	public void setStud_Class(String stud_Class) {
		Stud_Class = stud_Class;
	}
	
					
}
