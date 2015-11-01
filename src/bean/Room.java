package bean;

public class Room extends Lib_Resource
{

	private String Room_Number;
	private String Floor;
	private String Capacity;
	private String Category;
	
	public Room(String lib_Id, String resource_Id, String availability,
			String room_Number, String floor, String capacity, String category) {
		super(lib_Id, resource_Id, availability);
		Room_Number = room_Number;
		Floor = floor;
		Capacity = capacity;
		Category = category;
	}

	public String getRoom_Number() {
		return Room_Number;
	}

	public void setRoom_Number(String room_Number) {
		Room_Number = room_Number;
	}

	public String getFloor() {
		return Floor;
	}

	public void setFloor(String floor) {
		Floor = floor;
	}

	public String getCapacity() {
		return Capacity;
	}

	public void setCapacity(String capacity) {
		Capacity = capacity;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}
	
	
}
