import java.io.*;
public class ReadStudents {
	
	public void display()
	{
		ObjectInputStream in = null;
		try
		{
			in = new ObjectInputStream( new BufferedInputStream( new FileInputStream( "students.dat") ) );
			for( int i = 0; i < 3; i++ ) //Reads each object
			{
				Student student = (Student) in.readObject();
				display2(student);
			}
			in.close(); //Closes stream and flushes buffer
		}
		catch( Exception e )
		{
			System.out.println("Exception Caught");
		}
	}
	
	protected void display2( Student student )
	{
		System.out.println();
		System.out.println("Name: " + student.getName()); //Displays the name
		System.out.println("GPA: " + student.getGPA()); //Displays the GPA
	}
}
