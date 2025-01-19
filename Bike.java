
public class Bike extends Vehicle {
  //constructor
	
	public Bike(int wheels , String fuelType) {
		super(wheels , fuelType);
	}
	//override
	@Override
	public  void start() {
		System.out.println("Bike is Starting: Kick-start or press the electric start ");
	}
	@Override
	public void describe() {
		System.out.println("This Vehical has 2 wheels and uses Petrol");
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
