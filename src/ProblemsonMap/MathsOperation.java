package ProblemsonMap;

import java.util.Scanner;

public class MathsOperation {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.println("Enter the first number");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
	    int num2 = sc.nextInt();
	
		int choice = 0;
		boolean condition = true;
		while(condition) {
			System.out.println("-----------------------------------------");
			System.out.println("1.Add two numbers\n2.Sub two numbers\n3.Mul two numbers\n"
					+ "4.Divide Two numbers\n5.Exit");
			System.out.println("-----------------------------------------");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				addNumbers(num1,num2);
				break;
			case 2:
				subNumbers(num1,num2);
				break;
			case 3:
				multiplyNumbers(num1,num2);
				break;
			case 4:
				try {
				   divideNumbers(num1,num2);
				}catch(ArithmeticException e){
					System.out.println(e);
				}
				break;
			case 5:
				condition = false;
				break;
			default:
				System.out.println("Invalid choice ");
			}
		}
		
	}
    
    static void addNumbers(int num1,int num2) {
      System.out.println(num1+num2);
	}

	private static void subNumbers(int num1,int num2) {
	  System.out.println(num1-num2);
		
	}

	private static void multiplyNumbers(int num1,int num2) {
		System.out.println(num1*num2);
		
	}

	private static void divideNumbers(int num1,int num2) {
		float result = (float)num1/num2;
		System.out.println(result);
		
	}

}
