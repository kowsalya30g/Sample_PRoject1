package ProblemsonMap;

import java.util.HashSet;
import java.util.Scanner;

public class Teacher {
	static Scanner sc = new Scanner(System.in);
	static HashSet<EntityTeacher> set = new HashSet<EntityTeacher>();
	public static void main(String[] args) {
		int choice = 0;
		boolean condition = true;
		while(condition) {
			System.out.println("-----------------------------------------");
			System.out.println("1.Add teacher details \n 2. Display the details\n3.Exit");
			System.out.println("-----------------------------------------");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				getDetails();
				break;
			case 2:
				displayDetails();
				break;
			case 3:
				condition = false;
				break;
			default:
				System.out.println("Invalid choice ");
			}
		}
		
}
	
	private static void getDetails() {
		System.out.println("Enter teacher name: ");
		String name = sc.next();
		name = ValidateInputs.stringValidate(name);
		System.out.println("Enter subject taken by the teacher ");
		String subject = sc.next();
		subject = ValidateInputs.stringValidate(subject);
		EntityTeacher newdetails = new EntityTeacher(name,subject);
		set.add(newdetails);
		
	}
	
	private static void displayDetails() {
		System.out.println(set);
		
	}
	

}
