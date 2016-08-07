
public abstract class Account //Declares that the class account is an abstract account
{
	private int accountNumber;
	private double balance;
	private double interestRate;
	private String dateCreated;

	public Account( int aNumber, double theBalance, double rate, String date ) //A general Account constructor
	{
		accountNumber = aNumber;
		balance = theBalance;
		interestRate = rate;
		dateCreated = date;
	}
	
	public abstract void deposit( double amount ); //Creates an abstract method deposit

	public abstract void withdraw( double amount ); //Creates an abstract method withdraw

	protected void setAccountNumber( int number ) //All these setter methods are for holding the account information
	{
		accountNumber = number;
	}
	
	protected void setBalance( double number )
	{
		balance = number;
	}
	
	protected void setInterestRate( double interestRate)
	{
		interestRate = interestRate;
	}
	
	protected void setDate( String date )
	{
		dateCreated = date;
	}
	
	protected int getAccountNumber() //These getter methods are for if the subclasses ever have to use any of the information entered
	{
		return accountNumber;
	}
	
	protected double getBalance()
	{
		return balance;
	}
	
	protected double getInterestRate()
	{
		return interestRate;
	}
	
	protected String getDate()
	{
		return dateCreated;
	}
}