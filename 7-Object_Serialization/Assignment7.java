import java.util.Scanner;
public class Assignment7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner( System.in ); //Creates a scanner for each person
		Scanner input2 = new Scanner( System.in );
		Scanner input3 = new Scanner( System.in );
		System.out.println();
		System.out.println("You will be assigning data to three students!"); //Informs the user what they are doing
		System.out.println();
		
		System.out.print("What is the name of the student: "); //For each student, computer gets the name
		String name = input.nextLine();
		System.out.print("What is the social security number: "); //And the social security number
		int number = input.nextInt();
		System.out.print("What is the number of courses completed: "); //And the number of courses completed
		int courses = input.nextInt();
		double [] grades = new double[courses]; //Creates an array of grades based off of the number of courses completed
		int [] credits = new int[courses];
		for(int i = 0; i < courses; i++ ) //Gets the grades and credits for each course
		{
			System.out.print("What is a grade of the student: ");
			grades[i] = input.nextDouble();
			System.out.print("What is the credit score of that grade: ");
			credits[i] = input.nextInt();
		}
		Student first = new Student( name, number, courses, grades, credits ); //Creates the student
		System.out.println(); //Process repeated two more times
		
		System.out.print("What is the name of the student: ");
		String name2 = input2.nextLine();
		System.out.print("What is the social security number: ");
		int number2 = input2.nextInt();
		System.out.print("What is the number of courses completed: ");
		int courses2 = input2.nextInt();
		double [] grades2 = new double[courses2];
		int [] credits2 = new int[courses2];
		for(int i = 0; i < courses2; i++ )
		{
			System.out.print("What is a grade of the student: ");
			grades2[i] = input2.nextDouble();
			System.out.print("What is the credit score of that grade: ");
			credits2[i] = input2.nextInt();
		}
		Student second = new Student( name2, number2, courses2, grades2, credits2 );
		System.out.println();
		
		System.out.print("What is the name of the student: ");
		String name3 = input3.nextLine();
		System.out.print("What is the social security number: ");
		int number3 = input3.nextInt();
		System.out.print("What is the number of courses completed: ");
		int courses3 = input3.nextInt();
		double [] grades3 = new double[courses3];
		int [] credits3 = new int[courses3];
		for(int i = 0; i < courses3; i++ )
		{
			System.out.print("What is a grade of the student: ");
			grades3[i] = input3.nextDouble();
			System.out.print("What is the credit score of that grade: ");
			credits3[i] = input3.nextInt();
		}
		Student third = new Student( name3, number3, courses3, grades3, credits3 );
		System.out.println();
		
		System.out.println("Displaying all names of students and GPAs: "); //Displays all the names and GPAs
		first.simpleGPA(); //Calculates the GPAs first
		second.simpleGPA();
		third.simpleGPA();
		WriteStudents write = new WriteStudents( first, second, third ); //Writes information down
		write.writeStudent();
		ReadStudents read = new ReadStudents(); //Reads the information
		read.display(); //Displays the information
	}

}
