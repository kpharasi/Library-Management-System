package bean;

public class Camera extends Device 
{
	private String megapixel;

	public Camera(String lib_Id, String resource_Id, String availability,
			String device_Model, String device_Brand, String device_Memory,
			String megapixel) {
		super(lib_Id, resource_Id, availability, device_Model, device_Brand,
				device_Memory);
		this.megapixel = megapixel;
	}

	public String getMegapixel() {
		return megapixel;
	}

	public void setMegapixel(String megapixel) {
		this.megapixel = megapixel;
	}
	
	

}
