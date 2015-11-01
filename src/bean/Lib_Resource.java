package bean;

public class Lib_Resource {
	
	private String Lib_Id;
	private String Resource_Id;
	private String Availability;
	private String Availability_Date;
	
	public Lib_Resource(String lib_Id, String resource_Id, String availability) {
		super();
		Lib_Id = lib_Id;
		Resource_Id = resource_Id;
		Availability = availability;
	}

	public String getLib_Id() {
		return Lib_Id;
	}

	public void setLib_Id(String lib_Id) {
		Lib_Id = lib_Id;
	}

	public String getResource_Id() {
		return Resource_Id;
	}

	public void setResource_Id(String resource_Id) {
		Resource_Id = resource_Id;
	}

	public String getAvailability() {
		return Availability;
	}

	public void setAvailability(String availability) {
		Availability = availability;
	}
	
		
}
