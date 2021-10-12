package s3;

import java.math.BigDecimal;

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
		float floatNum1 = 8; 
		float floateMax = Float.MAX_VALUE; // 	
		float floateMin = Float.MIN_VALUE; // 	
		float fx = 1.05f;
		float fy = 2.55f;
		float fyPx = fx+fy;
		System.out.println("flot y pluse x = " + fyPx);
		
		
		System.out.println("the float with specifies f   : " + floatNum);
		System.out.println("the float without specifies f: " + floatNum1 +"\n");
		System.out.print(floatNum / 5); System.out.println("(float number) 4 byte, Value range: 1.2E-38 to 3.4E+38,	 7 decimal places");
		System.out.println("the max value in float is :" + floateMax +", and the min value is: " + floateMin + "\n");
		
		// d specifies that value is double.
		double doubleNum = 8.1234567890123456789012345678d; // 	8 byte, Value range: 2.3E-308 to 1.7E+308, 	16 decimal places
		double doubleNum1 = 8.1234567890123456789012345678; 
		double doubleMax = Double.MAX_VALUE; // 	
		double doubleMin = Double.MIN_VALUE; // 	
		
		System.out.println("the double with specifies d   : " + doubleNum);
		System.out.println("the double without specifies d: " + doubleNum1 +"\n");
		System.out.print(doubleNum / 5); System.out.println("(double number) 8 byte, Value range: 2.3E-308 to 1.7E+308, 	16 decimal places");
		System.out.println("the max value in double is :" + doubleMax +", and the min value is: " + doubleMin);
		
		double dx = 1.05f;
		double dy = 2.55f;
		double dyPx = dx+dy; //  3.5999999046325684
		System.out.println("double y pluse x = " + dyPx);
		// to solve this problem and calculate digits with high precision, use BigDecimal class https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/math/BigDecimal.html
		BigDecimal d1y = new BigDecimal(1.05);
		BigDecimal d2x = new BigDecimal(2.55);
		BigDecimal dyPx1 = d1y.add(d2x); // 3.5999999999999998667732370449812151491641998291015625
		System.out.println("BigDecimal y pluse x = " + dyPx1);
		// to rounding the value up change the value to string.
		BigDecimal d1yS = new BigDecimal("1.05");
		BigDecimal d2xS = new BigDecimal("2.55");
		BigDecimal dyPx1S = d1yS.add(d2xS); // 3.5999999999999998667732370449812151491641998291015625
		System.out.println("BigDecimal as String y pluse x = " + dyPx1S);
		

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
