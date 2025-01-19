
public class TestVehicless {

	public static void main(String[] args) {
		// create objects 
		
       car car1 = new car(4 , "Gasoline");
       Bike bike1 = new Bike(2 , "Petrol");
       
       
       
       car1.start();
       car1.describe();
       bike1.start();
       bike1.describe();
	}

}
