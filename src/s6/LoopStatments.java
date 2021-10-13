package s6;

import java.util.Iterator;

public class LoopStatments {

	public static void main(String[] args) {
		// for loop
		for (int i = 0; i<5; i++) {
			System.out.println("the for loop index is : " + i);
		}
		// Revisited for loop
		for (int i = 0, j = 0; i<5 && j < 10; i++, j++) {
			System.out.println("the Revisited for loop index is: " + i + "and the j index is: " + j);
		}
		
		// the foreach loop in java
		// array
		int[] numbers = new int[] { 342, 33, 51 };
		for (int num : numbers) {
			System.out.println("the index num in foreach is :" + num);
		}
		
		
		// while loop
		int whileI = 1;
		while (whileI < 5) {
			System.out.println("the while index is: " + whileI);
			if(whileI == 4) {
				break;
			}
			whileI++;
		}
		
		// do loop
		int doI = 1;
		do {
			System.out.println("the do index is :" + doI);
			doI++;
			if(doI == 4) {
				continue;
			}
		} while (doI < 5);
		

	}

}
