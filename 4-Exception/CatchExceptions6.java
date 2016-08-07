import java.util.Scanner;

public class CatchExceptions6
{
	public static void main ( String [] args )
	{
		int result; //Holds the result
		String resultString; //Turns the result into a string so that it can be printed
		Scanner input = new Scanner( System.in ); //Creates a scanner for inputs
		System.out.println();
		int number;
		System.out.print("What is the numerator: "); //Gets the numerator from the user (no restrictions on numerator, so it's not in the 'try' section)
		int numerator = input.nextInt();
		System.out.println();
		try //First time to ask the user for the denominator
		{
			System.out.print("What is the denominator: ");
			int denominator = input.nextInt(); //Gets the denominator
			result = divide( numerator, denominator );
			resultString = Integer.toString( result ); //This part is if the denominator is valid
			System.out.println();
			System.out.println("The quotient is " + resultString + "."); //Displays the result
		}
		catch ( DivideByZeroException e )
		{
			for(int i = 0; i == 0; i += 0) //A loop so that if the exception was caught, it would be relooped (a while loop would have been easier...)
			{
				try
				{
					System.out.println();
					System.out.print("Denominator must be nonzero...enter again: "); //Keeps on asking the user if they input an invalid response
					number = input.nextInt();
					result = divide( numerator, number );
					i = 1; //Breaks the loop if it runs past the above statement
					resultString = Integer.toString( result );
					System.out.println();
					System.out.println("The quotient is " + resultString + "."); //Displays the result
				}
				catch ( DivideByZeroException ex )
				{
					i = 0; //Continues the loop
				}
			}
		}
	}

	public static int divide ( int x, int y ) throws DivideByZeroException //Divide method given by lecture 4.4
	{
		int result = 0;
		try
		{
			result = x/y;
		}
		catch ( ArithmeticException e )
		{
			throw new DivideByZeroException( y );
		}
		return result;
	}
}