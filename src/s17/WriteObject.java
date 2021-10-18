package s17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		Vehicle bike = new Vehicle("bike", 9444);
		Vehicle car = new Vehicle("Car", 4268);

		String directoryPath = "LocalFiles/";

		// Create the file directory if not exist
		File _directoryPath = new File(directoryPath);
		if (!_directoryPath.exists()) {
			_directoryPath.mkdirs(); 
			System.out.println("create \"" + directoryPath + "\" successfully");
		}

		File file = new File(directoryPath + "vehicles.dat");

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try (FileOutputStream fos = new FileOutputStream(directoryPath + "vehicles.dat")) {
			try (ObjectOutputStream obj = new ObjectOutputStream(fos)) {
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("Object written onto the file");
			}

		} catch (FileNotFoundException e) {
			System.out.println("ileNotFoundException");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("IOException");
		}

	}

}
