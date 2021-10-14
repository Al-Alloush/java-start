package s9;

public class Vehicle {
	
	private String Engine;
	private int Wheels;
	private int Seats;
	private float FuelTank;
	private boolean Lights;
	
	public Vehicle(String engine, int wheels, int seats, float fuelTank, boolean lights) {
		super();
		Engine = engine;
		Wheels = wheels;
		Seats = seats;
		FuelTank = fuelTank;
		Lights = lights;
	}

	public String getEngine() {
		return Engine;
	}

	public void setEngine(String engine) {
		Engine = engine;
	}

	public int getWheels() {
		return Wheels;
	}

	public void setWheels(int wheels) {
		Wheels = wheels;
	}

	public int getSeats() {
		return Seats;
	}

	public void setSeats(int seats) {
		Seats = seats;
	}

	public float getFuelTank() {
		return FuelTank;
	}

	public void setFuelTank(float fuelTank) {
		FuelTank = fuelTank;
	}

	public boolean isLights() {
		return Lights;
	}

	public void setLights(boolean lights) {
		Lights = lights;
	}
	
	
	// this function to 
	public void functionToOverride() {
		System.out.println("the function from Vehicle class");
	}
	

}
