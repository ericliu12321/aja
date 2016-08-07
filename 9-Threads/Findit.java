
public class Findit extends Thread
{
	
	private int number; //Gets the number
	private int begin; //Gets the beginning for that thread
	private int end; //Gets the ending for that thread
	private String numberString; //Changes the target to a string so that it can be displayed
	boolean flag = false; //Stops the run method when the number is found
	
	Findit( int numberToSearchFor, int beginSpot, int endSpot ) //Setter, sets the target, the beginning, and the end
	{
		number = numberToSearchFor;
		begin = beginSpot;
		end = endSpot;
		numberString = Integer.toString(number);
	}
	
	public void run() //Runs the threads
	{
		while( flag == false) //Continues running while the number is not found
		{
			find();
		}
	}
	
	private void find()
	{
		
		for( int i = begin; i < begin + 10; i++ ) //For loop to check ten numbers from each thread
		{ //Based on the beginning number of that specific thread
			if( i == number ) //If the number is found, display the following
			{
				System.out.println( Thread.currentThread().getName() + " has found the Number!" );
				System.out.println( "The number is: " + numberString );
				flag = true; //Stops the while loop
				break; //Gets out of the for loop
			}
		}
		if( ( begin + 10 ) > end ) //Always adds 10 to begin so that it searches different numbers next time
		{
			begin = end;
			flag = true; //New added part: breaks the while loop
		}
		else
		{
		begin += 10;
		}
		Thread.yield(); //Changes thread
		
	}
	
}
