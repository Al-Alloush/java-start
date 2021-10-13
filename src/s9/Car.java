package s9;

public class Car {
	
	private String doors;
	private String engine;
	private String driver;
	private int speed;
	
	public Car() {
		this.doors = "doors";
		this.engine = "engine";
		this.driver = "driver";
		this.speed = 0;
	}
	
	public Car(String doors, String engine, String driver, int speed) {
		super();
		this.doors = doors;
		this.engine = engine;
		this.driver = driver;
		this.speed = speed;
	}
	
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getDriver() {
		return driver;
	}
	public void setDriver(String driver) {
		this.driver = driver;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String run() {
		
		if((this.doors.equals("closed") || this.doors.equals("close"))  &&
				this.engine.equals("start") &&
				this.speed <= 0 ) {
			return "the care is ready to drive";
		}
		
		return "please close the door, start the engine, and the speed must be 0"; 
	}
	
	
	
	

}
