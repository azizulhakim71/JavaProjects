package com.proengineersdream.simple_java_projects;
import java.util.Scanner;

public class Quize {

	public static void main(String[] args){
		
		
		int correctAnswers=5;
		Scanner scanner = new Scanner(System.in);//create scanner object to collect user input (answers)
		//loop through 5 times and ask 5 different questions
		for(int i=0; i<5; i++){		
			
			System.out.println("Type true/false below of the question and then hit Enter:");
			//ask first question
			if(i==0){
				System.out.println("Dhaka is capital city of Bangladesh");
				//collect the answer by scanner and compare the result, if wrong then minus one point from correct answer point
				boolean answer=scanner.nextBoolean();
				if(answer==false){
					correctAnswers=correctAnswers-1;
				}
			}
			
			//ask second question
			if(i==1){
				System.out.println("Two + Two = 5");
				//collect the answer by scanner and compare the result, if wrong then minus one point from correct answer point
				boolean answer=scanner.nextBoolean();
				if(answer==true){
					correctAnswers=correctAnswers-1;
				}
			}
			//ask third question
			if(i==2){
				System.out.println("Five + Five = 10?");
				//collect the answer by scanner and compare the result, if wrong then minus one point from correct answer point
				boolean answer=scanner.nextBoolean();
				if(answer==false){
					correctAnswers=correctAnswers-1;
				}
			}
			//ask fourth question
			if(i==3){
				System.out.println("Can anyone learn programming language?");
				//collect the answer by scanner and compare the result, if wrong then minus one point from correct answer point
				boolean answer=scanner.nextBoolean();
				if(answer==false){
					correctAnswers=correctAnswers-1;
				}
			}
			//ask fifth question
			if(i==4){
				System.out.println("Venus and Mars both are nearest planet to the earth?");
				//collect the answer by scanner and compare the result, if wrong then minus one point from correct answer point
				boolean answer=scanner.nextBoolean();
				if(answer==false){
					correctAnswers=correctAnswers-1;
				}
			}
			
			
		}
		scanner.close();
		
		System.out.println("****************************************\n");
		System.out.println("Your score is: "+correctAnswers+"\nIncorrect Answer: "+ (5-correctAnswers));
		System.out.println("****************************************\n");
		
	}

		
	}


