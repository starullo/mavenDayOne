package qa.com.firstmavenproject.calculator;

public class Calculator {
	
	public static double add(int a, int b) {
		return a + b;
	}
	
	public static double subract(int a, int b) {
		return a - b;
	}
	
	public static double multiply(int a, int b) {
		return a * b;
	}
	
	public static double divide(int a, int b) throws ArithmeticException {
		if (a == 0) {
			throw new ArithmeticException("Cannot divide zero by a number");
		} else if (b == 0) {
			throw new ArithmeticException("Cannot divide a number by zero");
		}
		return a / b;
	}
	
	public static double mod(int a, int b) {
		return a % b;
	}
	
}
