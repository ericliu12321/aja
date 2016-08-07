
public class DivideByZeroException extends Exception //Divide By Zero Exception given by lecture 4.4
{
	private int denom; //Denominator integer

	public DivideByZeroException() //Constructor
	{
	}

	public DivideByZeroException( String s ) //Constructor
	{
		super( s );
	}

	public DivideByZeroException( int d ) //Constructor
	{
		super( "div by zero" );
		denom = d; 
	}

	public int getDenominator() //Gets the denominator
	{
		return denom;
	}
}