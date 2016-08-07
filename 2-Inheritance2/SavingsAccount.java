
public class SavingsAccount extends Account
{
	public SavingsAccount( int accountNumber, double balance, double interestRate, String dateCreated ) //Savings account constructor
	{
		super( accountNumber, balance, interestRate, dateCreated ); //Uses the Account class constructor
	}
	
	public void deposit( double amount ) //Uses the Account classes deposit method
	{
		double original = getBalance();
		double newAmount = original + amount;
		String newAmountString = Double.toString( newAmount );
		setBalance( newAmount );
		System.out.println("You now have " + newAmountString + " dollars in your Savings Account!");
	}
	
	public void withdraw( double amount ) //Uses the Account classes withdraw method
	{
		double original = getBalance();
		double newAmount = original - amount;
		if(newAmount >= 0) //Prevends the user from overdrawing
		{
			String newAmountString = Double.toString( newAmount );
			setBalance( newAmount );
			System.out.println("You now have " + newAmountString + " dollars in your Savings Account!");
		}
		else
			error();	
	}
	
	protected void error() //Error message if the user tries to overdraw
	{
		System.out.println("Sorry, you don't have that much in the account currently.");
	}
}