package s17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FilesHandilingInOutPut {

	public static void main(String[] args) {

		// path can be like: Complete path( "D:/...") or in project path ("src/")
		// String directoryPath = "D:/MyFirstProjects/Core
		// Project/JavaFiles/projects/JavaStart/LocalFiles/"; // the / or
		String directoryPath = "LocalFiles/";

		// Create the file directory if not exist
		File _directoryPath = new File(directoryPath);
		if (!_directoryPath.exists()) {
			_directoryPath.mkdirs(); // mkdir for one directory
			System.out.println("create \"" + directoryPath + "\" successfully");
		}

		// create File with any type like: *.txt, *.json, *.doc, ...
		File file = new File(directoryPath + "StudyDoc.doc");

		if (!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("file created");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		// input string from user
		String userInput = null;
		System.out.print("please insert some text: ");
		@SuppressWarnings("resource") // to avoid the warning about the stream type if not add close method at end.
		Scanner scan = new Scanner(System.in);
		if (scan.hasNextLine()) {
			userInput = scan.nextLine();
			System.out.println("the text is: " + userInput);
		}
		//scan.close();

		// after create the file write some text inside the file.
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
			bw.write(userInput);
			bw.newLine();
			bw.write("text line 1");
			bw.newLine();
			bw.write("text line 2");
			//bw.close(); // this method not necessary, because the BufferWriter is inside the try 
			System.out.println("Write some text inside the dec file, the text are:");
			
		} catch (Exception e) {
			file.delete();
			System.out.println("somthing wrong!, deleted the file");
		}

		
		try {
			// use BufferReader to read the text in the file
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new FileReader(file));
			String txtLine;
			while ((txtLine = br.readLine()) != null) {
				System.out.println(txtLine);
			}
			//br.close(); // add @SuppressWarnings("resource") if don't neet to add br.close() function
			
			System.out.println("000000000000000000000000000000000");
			
			// use Scanner to read the text in the file
			Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}
			scanner.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
