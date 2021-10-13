package s6;

public class SwitchStatments {

	public static void main(String[] args) {
		// int switch
		int intExpression = 10;
		switch (intExpression) {
		case 5:
			System.out.println("the num is 5");
			break;
		case 10:
			System.out.println("the num is 10");
			break;
		default:
			System.out.println("the default int");
			break;
		}

		// char switch
		char charExpression = 'M'; // lower case and upper case are definitely different characters
		switch (charExpression) {
		case 'M': // if this condition doesn't have a break, then if charExpression is M or m will execute.
		case 'm':
			System.out.println("the char is m or M");
			break;
		case 'b':
			System.out.println("the cahr is b");
			break;
		default:
			System.out.println("the default cahr");
			break;
		}

		// string switch
		String stringExpression = "Ahmad";
		switch (stringExpression.toLowerCase()) { // change the string to be lower case
		case "ahmad":
			System.out.println("the String is ahmad");
			break;
		case "sam":
			System.out.println("the String is sam");
			break;
		default:
			System.out.println("the default String");
			break;
		}

	}

}
