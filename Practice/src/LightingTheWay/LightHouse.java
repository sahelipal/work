package LightingTheWay;

public class LightHouse {
	private String location;
	private int height;
	private String lightType;
	private int hours;
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getLightType() {
		return lightType;
	}
	public void setLightType(String lightType) {
		this.lightType = lightType;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public LightHouse(String location, int height, String lightType, int hours) {
		super();
		this.location = location;
		this.height = height;
		this.lightType = lightType;
		this.hours = hours;
	}
	
	public int calculateFlashesForGivenHours() {
		if(hours<0 || height<0) {
//			System.out.println("Invalid blight housedetails");
			return -1;
		}
		else {
			int flashes=(int)(hours*60*60)/72;
			return flashes;
		}
	}
}
