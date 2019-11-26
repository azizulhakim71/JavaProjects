package com.proengineersdream.simple_java_projects;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		int num1,num2;
		String sign = "";
		System.out.println("*****Calculator*****");
		
		System.out.println("Please enter first number below:");
		Scanner scanner = new Scanner(System.in);
		num1 = scanner.nextInt();
		
		System.out.println("Please enter second number below:");
		num2 = scanner.nextInt();
		
		System.out.println("Please enter operator below, example ('+', '-', '*', '/', '%')");
		sign = scanner.next();
		
		if (sign.equals("+")) {
			System.out.println("Calculated result:"+ (num1+num2));
		}
		else if (sign.equals("-") ) {
			System.out.println("Calculated result:"+ (num1-num2));
		}
		else if (sign.equals("*")) {
			System.out.println("Calculated result:"+ (num1*num2));
		}
		else if (sign.equals("/")) {
			System.out.println("Calculated result:"+ (num1/num2));
		}
		else if (sign.equals("%")) {
			System.out.println("Calculated result:"+ (num1%num2));
		}
		else {
			System.out.println("Your input is not currect.");
		}
		scanner.close();
		
	}

}
