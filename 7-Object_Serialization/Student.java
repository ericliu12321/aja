import java.io.Serializable;

public class Student implements Serializable {
	
	private String name;
	private int socialSecurityNumber;
	private int completedCourses;
	private double [] grades;
	private int [] credits;
	private double gpa;
	
	Student( String n, int ssn, int completed, double [] grade, int [] credit )
	{
		name = n; //Sets the name, social security number, completed courses, grades, and credits
		socialSecurityNumber = ssn;
		completedCourses = completed;
		grades = new double[completed];
		credits = new int[completed];
		grades = grade;
		credits = credit;
	}
	
	public void simpleGPA() //Calculates simple GPA, averages the point score
	{
		double sum = 0;
		for(int i = 0; i < grades.length; i++) //Takes the sum and adds it up
		{
			sum = sum + grades[i];
		}
		sum = sum/completedCourses; //Finds average
		gpa = sum; //Sets the GPA as the sum
	}
	
	public String getName()
	{
		return name; //Gets name
	}
	
	public String getGPA()
	{
		String gpaString = Double.toString(gpa);
		return gpaString; //Gets the GPA in a string form
	}
}
