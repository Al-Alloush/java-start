package s9;

public class ClassOOP {

	public static void main(String[] args) {
		Car car = new Car("close", "start", "Ahmad", 4);
		Car car1 = new Car();

		System.out.println(car.run());
		System.out.println(car1.run());
		
		
		Truck truck = new Truck("start", 3, 4, 12.4f, true, "steering", "nusicA", "seatBelt", "on", "Container A");
		System.out.println(truck.getFuelTank());
		
		// after add toString @Override method in truck function will be understandable.
		System.out.println(truck);
		
		// test function override 
		truck.functionToOverride();
		
		

	}

}
