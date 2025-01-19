
public abstract class Vehicle {
	private int wheels;
	private String fuelType;
	
	//constructor 
	public Vehicle(int wheels , String fuleType) {
		this.wheels = wheels;
		this.fuelType = fuleType;
	}
	//getter 
	public int getwheel() {
		return wheels;
	}
// abstractor method 
	
	public abstract void start(); 
	
//Add concrete method 
	public void describe() {
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
