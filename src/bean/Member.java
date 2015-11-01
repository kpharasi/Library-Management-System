package bean;

public class Member {
	private String Member_Id;
	private String  Fname;
	private String  Lname;
	private String Dob;
	private String Sex;
	private String  City;
	private String  Street;
	private int Postcode;
	private String Nationality;
	private long Phone_no;
	private long Alt_phone;
	private int Priority;
	private String Password;
	private String Department;
	private String State;
	private String User_Id;
	
	public Member()
	{
		
	}
	public Member(String member_Id, String fname, String lname, String dob,
			String sex, String city, String street, int postcode,
			String nationality, long phone_no, long alt_phone, int priority,
			String password, String department, String state, String user_Id) {
		super();
		Member_Id = member_Id;
		Fname = fname;
		Lname = lname;
		Dob = dob;
		Sex = sex;
		City = city;
		Street = street;
		Postcode = postcode;
		Nationality = nationality;
		Phone_no = phone_no;
		Alt_phone = alt_phone;
		Priority = priority;
		Password = password;
		Department = department;
		State = state;
		User_Id = user_Id;
	}

	public String getMember_Id() {
		return Member_Id;
	}

	public void setMember_Id(String member_Id) {
		Member_Id = member_Id;
	}

	public String getFname() {
		return Fname;
	}

	public void setFname(String fname) {
		Fname = fname;
	}

	public String getLname() {
		return Lname;
	}

	public void setLname(String lname) {
		Lname = lname;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public int getPostcode() {
		return Postcode;
	}

	public void setPostcode(int postcode) {
		Postcode = postcode;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public long getPhone_no() {
		return Phone_no;
	}

	public void setPhone_no(long phone_no) {
		Phone_no = phone_no;
	}

	public long getAlt_phone() {
		return Alt_phone;
	}

	public void setAlt_phone(long alt_phone) {
		Alt_phone = alt_phone;
	}

	public int getPriority() {
		return Priority;
	}

	public void setPriority(int priority) {
		Priority = priority;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(String user_Id) {
		User_Id = user_Id;
	}
	
	
	
}
