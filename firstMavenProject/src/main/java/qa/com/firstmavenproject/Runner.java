package qa.com.firstmavenproject;

import java.util.Scanner;

import qa.com.firstmavenproject.calculator.Calculator;

public class Runner {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int num = 0;
		boolean flag = true;
		
		while (flag) {
			System.out.println("Please choose a calculation to perform:\n");
			System.out.println("1: Addition \n2: Subtraction \n3: Multiplication \n4: Division \n5: Modulus\n6: Exit program");
			
			String selection = scanner.nextLine();
			
			switch(selection) {
			case "1":
				subMenuHelper(Integer.parseInt(selection));
			case "2":
			case "3":
			case "4":
			case "5":
				break;
			case "6":
				flag = false;
				break;
			default:
				flag = true;
			}
//			
//			if (scanner.nextLine().length() == 0) {
//				num = 7;
//			} else if ()
//			
//			if (num > 0 && num < 6) {
//				subMenuHelper(num);
//			} else if (num == 6) {
//				flag = false;
//			} else if (num == 7) {
//				flag = true;
//			}
		} 
		System.out.println("Exiting program");
		scanner.close();
	}
	
	static void subMenuHelper(int num) {
		String operator = "";
		String input2 = "";
		int num1;
		int num2;
		boolean flag = true;
			switch(num) {
			case 1:
				operator = "+";
				input2 = "Enter a number to add to it";
				break;
			case 2:
				operator = "-";
				input2 = "Enter a number to subtract from it";
				break;
			case 3:
				operator = "*";
				input2 = "Enter a number to multiply it by";
				break;
			case 4:
				operator = "/";
				input2 = "Enter a number to divide it by";
				break;
			case 5:
				operator = "%";
				input2 = "Enter a number to find the modulus";
				break;
			default:
				operator = "?";
				input2 = "???";
			}
			
			System.out.println("Enter a number");
			num1 = Integer.parseInt(scanner.nextLine());
			System.out.println(input2);
			num2 = Integer.parseInt(scanner.nextLine());
			double answer;
			
			switch(num) {
			case 1:
				answer = Calculator.add(num1, num2);
				break;
			case 2:
				answer = Calculator.subract(num1, num2);
				break;
			case 3:
				answer = Calculator.multiply(num1, num2);
				break;
			case 4:
				answer = Calculator.divide(num1, num2);
				break;
			case 5:
				answer = Calculator.mod(num1, num2);
				break;
			default:
				answer = 0;
			}
			
			System.out.println(num1 + " " + operator + " " + num2 + "\n= " + answer);
			System.out.println(" ");
	}
}
