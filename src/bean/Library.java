package bean;

public class Library {
	
	private String Lib_Id;
	private String Address;
	private String Name;
	private long Phone_No;
	
		
	public Library(String lib_Id, String address, String name, long phone_No) {
		super();
		Lib_Id = lib_Id;
		Address = address;
		Name = name;
		Phone_No = phone_No;
	}
	
	public String getLib_Id() {
		return Lib_Id;
	}
	public void setLib_Id(String lib_Id) {
		Lib_Id = lib_Id;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public long getPhone_No() {
		return Phone_No;
	}
	public void setPhone_No(long phone_No) {
		Phone_No = phone_No;
	}
	
	
		
}
