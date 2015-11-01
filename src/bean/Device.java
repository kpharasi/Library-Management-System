package bean;

public class Device extends Lib_Resource
{
	
	private String Device_Model;
	private String Device_Brand;
	private String Device_Memory;
	
	public Device(String lib_Id, String resource_Id, String availability,
			String device_Model, String device_Brand, String device_Memory) {
		super(lib_Id, resource_Id, availability);
		Device_Model = device_Model;
		Device_Brand = device_Brand;
		Device_Memory = device_Memory;
	}

	public String getDevice_Model() {
		return Device_Model;
	}

	public void setDevice_Model(String device_Model) {
		Device_Model = device_Model;
	}

	public String getDevice_Brand() {
		return Device_Brand;
	}

	public void setDevice_Brand(String device_Brand) {
		Device_Brand = device_Brand;
	}

	public String getDevice_Memory() {
		return Device_Memory;
	}

	public void setDevice_Memory(String device_Memory) {
		Device_Memory = device_Memory;
	}
	
	

}
