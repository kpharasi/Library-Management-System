package bean;

public class Course {
	
	private String Course_Id;
	private String Course_Name;
	
	public Course(String course_Id, String course_Name) {
		super();
		Course_Id = course_Id;
		Course_Name = course_Name;
	}

	public String getCourse_Id() {
		return Course_Id;
	}

	public void setCourse_Id(String course_Id) {
		Course_Id = course_Id;
	}

	public String getCourse_Name() {
		return Course_Name;
	}

	public void setCourse_Name(String course_Name) {
		Course_Name = course_Name;
	} 
	
	
}
