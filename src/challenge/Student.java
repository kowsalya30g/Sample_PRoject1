package challenge;


import java.util.Scanner;


public class Student {
	static Scanner sc = new Scanner(System.in);
	static EntityStudent student[] = new EntityStudent[1000];
	static int N=0;
	public static void main(String[] args) {
		int choice = 0;
		boolean condition = true;
		while(condition) {
			System.out.println("-----------------------------------------");
			System.out.println("1.Add student details\n2.Update grade and section\n3.Sort "
					+ "student list based on grade\n4.Exit");
			System.out.println("-----------------------------------------");
			System.out.println("Enter your choice ");
			choice = sc.nextInt();
			switch(choice) {
			case 1:
				getDetails();
				break;
			case 2:
				getGrade();
				break;
			case 3:
				sortStudent();
				break;
			case 4:
				condition = false;
				System.out.println("Thank you");
				break;
			default:
				System.out.println("Invalid choice ");
			}
		}
	}

	private static void getDetails() {
		// TODO Auto-generated method stub
		System.out.println("Enter student name:");
		String name = sc.next();
		name = ValidateInputs.stringValidate(name);
		System.out.println("Enter student id:");
		int id = ValidateInputs.intValidate();
		
		student[N] = new EntityStudent(name,id);
		N++;
		
		
	}

	private static void getGrade() {
		
		System.out.println("Enter your name:");
		String temp=sc.next();
		temp=ValidateInputs.stringValidate(temp);
		int count = 0;
		boolean isThere=false;
		while(isThere!=true) {
			for(int i=0;i<N;i++) {
				if(student[i].getName().equalsIgnoreCase(temp)) {
					System.out.println("Enter student grade:");
					int grade = ValidateInputs.intValidate();
					System.out.println("Enter student section: ");
					String section = sc.next();
					section = ValidateInputs.stringValidate(section);
					student[i].setGrade(grade);
					student[i].setSection(section);
					isThere=true;
				}else {
					count++;
				}
			}if(count==N) {
				System.out.println("the name you entered is wrong\nplease enter name again");
				temp=sc.next();
				temp=ValidateInputs.stringValidate(temp);
			}
		}
		
		
		
	}

	private static void sortStudent() {
		// TODO Auto-generated method stub
		System.out.println("The student list sorted here based on grade:" );
		EntityStudent temp = new EntityStudent();
		for(int i=0;i<N;i++) {
			for(int j=i+1;j<N;j++) {
				if((student[i].getGrade())>(student[j].getGrade())) {
					temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
			}
			
		}
		for(int i=0;i<N;i++) {
			System.out.println(" "+student[i].getGrade()+" "+student[i].getName());
		}
		
		
	}
	
	

}
