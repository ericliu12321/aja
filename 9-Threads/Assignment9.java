import java.util.*;
public class Assignment9 {
	
	public static void main( String [] args )
	{
		Random r = new Random(); //Creates a random number generator
		
		int find = r.nextInt(1001); //Gets a random number from 0 to 1000
		
		Findit f1 = new Findit( find, 0, 349 ); //Creates three find it objects for the three threads
		Findit f2 = new Findit( find, 350, 699 ); //Each find it object has the range as parameters
		Findit f3 = new Findit( find, 700, 1000 );
		
		Thread t1 = new Thread( f1, "Thread 1" ); //Makes the threads
		Thread t2 = new Thread( f2, "Thread 2" );
		Thread t3 = new Thread( f3, "Thread 3" );
		
		t1.start(); //Starts the threads
		t2.start();
		t3.start();

	}
	
}
