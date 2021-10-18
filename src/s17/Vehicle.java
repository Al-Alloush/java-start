package s17;

import java.io.Serializable;

// Serializable to save this class in memory, file or database .
public class Vehicle implements Serializable {

	private static final long serialVersionUID = 3331664872084106493L;
	private String type;
	private int number;

	public Vehicle(String type, int number) {
		this.type = type;
		this.number = number;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}
	
	
	


}
