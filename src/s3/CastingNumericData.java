package s3;

public class CastingNumericData {

	public static void main(String[] args) {
		// Casting is a process of converting a variable of one data type into another.

		
		short shortVal =  10;  
        int intVal = shortVal;  
        System.out.println("castring short to int: " + intVal);  
        intVal = 32760; // if was the int number bigger than the short max storage, set the -32767 and vice versa if was more than  -32767 the value will be 32767
        shortVal = (short) intVal;
        System.out.println("castring int to short: " + shortVal);  
        
        // cast int to float
        float floatVal = intVal + 137.2222f;
        System.out.println("castring int to float: " + floatVal);  
        intVal = (int) floatVal;
        System.out.println("castring float to int: " + intVal);  
        
        // casting int to double
        double doubleVal = intVal;
        System.out.println("castring int to double: " + doubleVal);  
        
        // super simple equation
        // value = a square + 2ab + b square
        // value = ((a*a) +  2*(a*b) + b*b)
        int a = 25;
        float b = 42.159f;
        
        // 4510.3310546875 casting to int
        int value = (int) ((a*a) +  2*(a*b) + b*b);
        System.out.println("the value simple equation is : " + value);
        
        
        // hexadecimal number
        short hexaInt = 0x64;
        System.out.println(hexaInt);
        // Binary number
        int binary = 0b10011101;
        System.out.println(binary);


        
	}

}
