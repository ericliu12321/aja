
public class CheckingAccount extends Account
{
	double overdraftLimit;
	public CheckingAccount( int accountNumber, double balance, double interestRate, String dateCreated )
	{ //Checking account constructor
		super( accountNumber, balance, interestRate, dateCreated ); //Uses the Account class constructor
	}

	public void deposit( double amount ) //Uses the Account classes deposit method
	{
		double original = getBalance();
		double newAmount = original + amount;
		String newAmountString = Double.toString( newAmount );
		setBalance( newAmount );
		System.out.println("You now have " + newAmountString + " dollars in your Checking Account!");
	}

	public void setOverdraftLimit( double overdraft ) //Setter for the overdraft limit
	{
		overdraftLimit = overdraft;
	}
	
	public void withdraw( double amount ) //Uses the Account classes withdraw method
	{
		double original = getBalance();
		double newAmount = original - amount;
		if((newAmount + overdraftLimit) < 0) //If too much is withdrawed (over the overdraft limit)
			error();
		else
		{
			if(newAmount >= 0) //Check to see if it used the overdraft limit at all
			{
				String newAmountString = Double.toString( newAmount );
				setBalance(newAmount);
				System.out.println("You now have " + newAmountString + " dollars in your Checking Account!");
			}
			else //Tells the user that they are in debt if they use the overdraft limit
			{
				double debt = Math.abs(newAmount);
				String debtString = Double.toString(debt);
				setBalance( 0 );
				System.out.println("You now owe the bank " + debtString + " dollars from your Checking Account!");
			}
		}
	}
	
	protected void error() //If the user tries to take out too much money, will display this error message
	{
		System.out.println("Sorry, you don't have that much in the account currently.");
	}
}