
public class car extends Vehicle{
      //constructor
	
	public car(int wheels , String fuelType) {
		super(wheels,fuelType);
	}
	//Override
	@Override
	public  void start() {
		System.out.println("Car is Starting: Turn the key or push the start button.");
	}
	@Override
	public void describe() {
		System.out.println("This Vehical has 4 wheels and uses Gasoline");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
