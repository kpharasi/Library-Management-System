package bean;

public class Laptop extends Device
{
	private String Operating_System;

	public Laptop(String lib_Id, String resource_Id, String availability,
			String device_Model, String device_Brand, String device_Memory,
			String operating_System) {
		super(lib_Id, resource_Id, availability, device_Model, device_Brand,
				device_Memory);
		Operating_System = operating_System;
	}

	public String getOperating_System() {
		return Operating_System;
	}

	public void setOperating_System(String operating_System) {
		Operating_System = operating_System;
	}
	
	
}
