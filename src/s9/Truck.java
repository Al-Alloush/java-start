package s9;

public class Truck extends Vehicle {

	private String Steering;
	private String MusicSystem;
	private String SeatBelt;
	private String AirConditioner;
	private String Container;

	public Truck(String engine, int wheels, int seats, float fuelTank, boolean lights, String steering,
			String musicSystem, String seatBelt, String airConditioner, String container) {
		super(engine, wheels, seats, fuelTank, lights);

		Steering = steering;
		MusicSystem = musicSystem;
		SeatBelt = seatBelt;
		AirConditioner = airConditioner;
		Container = container;
	}

	@Override
	public String toString() {
		return "Truck [Steering=" + Steering + ", MusicSystem=" + MusicSystem + ", SeatBelt=" + SeatBelt
				+ ",\n AirConditioner=" + AirConditioner + ", Container=" + Container + ", getSteering()="
				+ getSteering() + ", getMusicSystem()=" + getMusicSystem() + ", getSeatBelt()=" + getSeatBelt()
				+ ", getAirConditioner()=" + getAirConditioner() + ", getContainer()=" + getContainer()
				+ ", getEngine()=" + getEngine() + ", getWheels()=" + getWheels() + ", getSeats()=" + getSeats()
				+ ", getFuelTank()=" + getFuelTank() + ", isLights()=" + isLights() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	public String getSteering() {
		return Steering;
	}

	public void setSteering(String steering) {
		Steering = steering;
	}

	public String getMusicSystem() {
		return MusicSystem;
	}

	public void setMusicSystem(String musicSystem) {
		MusicSystem = musicSystem;
	}

	public String getSeatBelt() {
		return SeatBelt;
	}

	public void setSeatBelt(String seatBelt) {
		SeatBelt = seatBelt;
	}

	public String getAirConditioner() {
		return AirConditioner;
	}

	public void setAirConditioner(String airConditioner) {
		AirConditioner = airConditioner;
	}

	public String getContainer() {
		return Container;
	}

	public void setContainer(String container) {
		Container = container;
	}

	// this function to
	public void functionToOverride() {
		System.out.println("the function from Truck class");
	}

}
