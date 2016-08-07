import java.util.Scanner;

public class Assignment2_eliu1285601
{
	public static void main( String [] args )
	{
		Scanner input = new Scanner( System.in ); //Creates a scanner for all the necessary inputs
		System.out.println();
		System.out.println("Let's start with a savings account!"); //Tells user that a savings account is being created
		System.out.println();

		System.out.print("What is your Savings Account number: "); //Gets savings account number
		int savingsAccountNumber = input.nextInt();
		System.out.println();

		System.out.print("What is your Savings Account starting balance: "); //Gets savings account balance
		double savingsAccountBalance = input.nextDouble();
		System.out.println();

		System.out.print("What is your Savings Account annual interest rate: "); //Gets savings account annual interest rate
		double savingsAccountInterest = input.nextDouble();
		System.out.println();

		System.out.print("What is the month that your Savings Account was created: "); //Gets the date that the savings account was created
		int savingsAccountMonth = input.nextInt();
		System.out.print("What is the day that your Savings Account was created: ");
		int savingsAccountDay = input.nextInt();
		System.out.print("What is the year that your Savings Account was created: ");
		int savingsAccountYear = input.nextInt();
		System.out.println();

		Date savingsAccountDateObj = new Date( savingsAccountMonth, savingsAccountDay, savingsAccountYear ); //Creates a new date object for the date
		String savingsAccountDate = savingsAccountDateObj.getDate();

		SavingsAccount savingsAccount = new SavingsAccount( savingsAccountNumber, savingsAccountBalance, savingsAccountInterest, savingsAccountDate );
		//Creates a new savings account object
		System.out.println("Make a deposit into your Savings Account!"); //Lets the user deposit into the savings account
		System.out.print("How much would you like to deposit: ");
		double savingsAccountDeposit = input.nextDouble();
		System.out.println();

		savingsAccount.deposit( savingsAccountDeposit );
		
		System.out.println("Make a withdrawal from your Savings Account!"); //Lets the user withdraw from the savings account
		System.out.print("How much would you like to withdraw (remember, no overdrawing): ");
		double savingsAccountWithdraw = input.nextDouble();
		System.out.println();

		savingsAccount.withdraw( savingsAccountWithdraw );

		System.out.println("Your all done with your Savings Account!");
		System.out.println();

		System.out.println("Now lets create a Checking Account!"); //Tells the user that a checking account is being created
		System.out.println();

		System.out.print("What is your Checking Account number: "); //Gets the number from the user
		int checkingAccountNumber = input.nextInt();
		System.out.println();

		System.out.print("What is your Checking Account starting balance: "); //Gets the starting balance from the user
		double checkingAccountBalance = input.nextDouble();
		System.out.println();

		System.out.print("What is your Checking Account annual interest rate: "); //Gets the annual interest rate from the user
		double checkingAccountInterest = input.nextDouble();
		System.out.println();

		System.out.print("What is the month that your Checking Account was created: "); //Gets the date that the checking account was created
		int checkingAccountMonth = input.nextInt();
		System.out.print("What is the day that your Checking Account was created: ");
		int checkingAccountDay = input.nextInt();
		System.out.print("What is the year that your Checking Account was created: ");
		int checkingAccountYear = input.nextInt();
		System.out.println();

		Date checkingAccountDateObj = new Date( checkingAccountMonth, checkingAccountDay, checkingAccountYear ); //Creates a new date object for the date of the checking account
		String checkingAccountDate = checkingAccountDateObj.getDate();
		
		System.out.print("What is your Checking Account overdraft limit: "); //Gets the overdraft limit from the user
		double checkingAccountOverdraft = input.nextDouble();
		System.out.println();

		CheckingAccount checkingAccount = new CheckingAccount( checkingAccountNumber, checkingAccountBalance, checkingAccountInterest, checkingAccountDate );
		checkingAccount.setOverdraftLimit( checkingAccountOverdraft ); //Sets the overdraft limit
		//Creates the checking account
		System.out.println("Make a deposit into your Checking Account!"); //Lets the user make a deposit into the checking account
		System.out.print("How much would you like to deposit: ");
		double checkingAccountDeposit = input.nextDouble();
		System.out.println();

		checkingAccount.deposit( checkingAccountDeposit );

		System.out.println("Make a withdrawal from your Checking Account!"); //Lets the user make a withdrawal from the checking account
		System.out.print("How much would you like to withdraw (remember, do not overdraw past the overdraft limit): ");
		double checkingAccountWithdraw = input.nextDouble();
		System.out.println();

		checkingAccount.withdraw( checkingAccountWithdraw );

		System.out.println("Your all done with your Checking Account!");
		System.out.println();
	}
}