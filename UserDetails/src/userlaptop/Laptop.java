package userlaptop;

public class Laptop {
	
	private int LaptopId;
	private String LaptopName;
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLaptopId() {
		return LaptopId;
	}
	public void setLaptopId(int laptopId) {
		LaptopId = laptopId;
	}
	public String getLaptopName() {
		return LaptopName;
	}
	public void setLaptopName(String laptopName) {
		LaptopName = laptopName;
	}
	public Laptop(int laptopId, String laptopName) {
		super();
		LaptopId = laptopId;
		LaptopName = laptopName;
	}
	@Override
	public String toString() {
		return "Laptop [LaptopId=" + LaptopId + ", LaptopName=" + LaptopName + "]";
	}
	
	
	

}
