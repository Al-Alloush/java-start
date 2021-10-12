package s3;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// integer
		System.out.println("\n----------------------------\n->Integer Types:");
		
		byte byteNum = 127; //				 	 8 bit/1byte: -128 -> 127 .
		short shortNum = 32767; // 				16 bit/2byte: -32768 -> 32767 .
		int intNum = 2147483647; // 			32 bit/4byte: 2147483648 -> 2147483647 .
		long longNum = 9223372036854775807L; // 64 bit/8byte: 9223372036854775808 -> 9223372036854775807 .	
		

		System.out.println("\n----------------------------\n->Floating type:");
		
		// f specifies that value is a float.
		float floatNum = 8.1234567890123456789f; // 			4 byte, Value range: 1.2E-38 to 3.4E+38,	 7 decimal places
		double floateMax = Float.MAX_VALUE; // 	
		double floateMin = Float.MIN_VALUE; // 	
		
		// d specifies that value is double.
		double doubleNum = 8.1234567890123456789012345678d; // 	8 byte, Value range: 2.3E-308 to 1.7E+308, 	16 decimal places
		double doubleMax = Double.MAX_VALUE; // 	
		double doubleMin = Double.MIN_VALUE; // 	
		
		System.out.print(floatNum / 5); System.out.println("(float number) 4 byte, Value range: 1.2E-38 to 3.4E+38,	 7 decimal places");
		System.out.println("the max value in float is :" + floateMax +", and the min value is: " + floateMin + "\n");
		System.out.print(doubleNum / 5); System.out.println("(double number) 8 byte, Value range: 2.3E-308 to 1.7E+308, 	16 decimal places");
		System.out.println("the max value in double is :" + doubleMax +", and the min value is: " + doubleMin);
		

		System.out.println("\n----------------------------\n->Boolean: ");
		boolean bool = true;	
	    System.out.println (bool);
	    
	    System.out.println("\n----------------------------\n->char & string: ");
	    String string = "the string";
	    String string1 = "\u00A7"; // §
	    char charS = '\u00A7'; // §
		char charA = 'A';
		System.out.println (string);
		System.out.println (string1);
		System.out.println (charS);
		System.out.println (charA);

		
		
		
	}

}
