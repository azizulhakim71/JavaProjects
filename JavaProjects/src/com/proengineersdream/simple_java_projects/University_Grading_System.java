package com.proengineersdream.simple_java_projects;
import java.util.Scanner;

public class University_Grading_System {
	public static void main(String arg[]) {
		
	double num;
	System.out.println("Please input your mark");
	Scanner scanner = new Scanner(System.in);
	num = scanner.nextDouble();
	
	if (num <= 100 && num >= 90) {
		System.out.println("\tYou have got: A+ \n \t You have got: 4.0 out of 4.00\n \tMarks: Excellent");
	}
	else if (num <90 && num >= 85) {
		System.out.println("\tYou have got: A- \n \t You have got: 3.7 out of 4.00\n \t Marks: Excellent");
	}
	else if (num < 85 && num >= 82.5) {
		System.out.println("\tYou have got: B+ \n \t You have got: 3.3 out of 4.00\n \t Marks: Very Good");
	}
	else if (num < 82.5 && num >= 77.5) {
		System.out.println("\tYou have got: B \n \t You have got: 3.0 out of 4.00\n \t Marks: Very Good");
	}
	else if (num < 77.5 && num >= 75) {
		System.out.println("\tYou have got: B- \n \t You have got: 2.7 out of 4.00\n \t Marks: Very Good");
	}
	else if (num < 75 && num >= 72.5) {
		System.out.println("\tYou have got: C+ \n \t You have got: 2.3 out of 4.00\n \t Marks: Good");
	}
	else if (num < 72.5 && num >= 67.5) {
		System.out.println("\tYou have got: C \n \t You have got: 2.0 out of 4.00\n \t Marks: Good");
	}
	else if (num < 67.5 && num >= 65) {
		System.out.println("\tYou have got: C- \n \t You have got: 1.7 out of 4.00\n \t Marks: Good");
	}
	else if (num < 65 && num >= 62.5) {
		System.out.println("\tYou have got: D+ \n \t You have got: 1.3 out of 4.00\n \t Marks: Satisfactory");
	}
	else if (num < 62.5 && num >= 60) {
		System.out.println("\tYou have got: D \n \t You have got: 1.00 out of 4.00\n \t Marks: Satisfactory");
	}
	else if (num < 60 && num >= 0) {
		System.out.println("\tYou have got: F \n \t You have got: Zero out of 4.00\n \t Marks: Fail");
	}else {
		System.out.println("Your value is not valid");
	}
	scanner.close();
	
	}
}
