import java.io.*;
public class WriteStudents {
	
	Student first;
	Student second;
	Student third;
	
	WriteStudents( Student student1, Student student2, Student student3 ) //Gets the three student classes
	{
		first = student1;
		second = student2;
		third = student3;
	}
	
	public void writeStudent()
	{
		ObjectOutputStream out = null;
		try
		{
		out = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream( "students.dat" ) ) ); //Puts the data in students.dat
		out.writeObject( first ); //Writes all the student objects
		out.writeObject( second );
		out.writeObject( third );
		out.close();
		}
		catch( IOException e )
		{
			System.out.println("IOException Caught");
		}
	}
	
}
