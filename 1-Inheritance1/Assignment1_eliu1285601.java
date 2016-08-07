
public class Assignment1_eliu1285601
{
	public static void main ( String [] args )
	{
		System.out.println();
		
		Date dateArray [] = new Date [ 4 ]; //Creates the date array
		
		for(int i = 0; i < 4; i++)
		{
			int month;
			String Month;
			int day;
			int year;
			if( i % 2 == 0 ) //Sets all the even elements to a regular date class and all the odds to a long date class
			{
				month = Input.getInt("What is the month (number form) : "); //Runs the date class and uses it to create a date object using the constructor
				day = Input.getInt("What is the day: ");
				year = Input.getInt("What is the year: ");
				dateArray[i] = new Date( month, day, year );
				System.out.println("All Set");
				System.out.println();
			}
			else
			{
				do {
					Month = Input.getString("What is the month (capitalize the first letter) : "); //Creates the long date object
				} while (!((Month.equals("January")) | (Month.equals("Febuary")) | (Month.equals("March")) | (Month.equals("April")) | (Month.equals("May")) | (Month.equals("June")) | (Month.equals("July")) | (Month.equals("August")) | (Month.equals("September")) | (Month.equals("October")) | (Month.equals("November")) | (Month.equals("December"))));
				if((Month.equals("January")) | (Month.equals("March")) | (Month.equals("May")) | (Month.equals("July")) | (Month.equals("August")) | (Month.equals("October")) | (Month.equals("December")))
				{ //If the month is invalid, then user is forced to re-enter information
					do {
						day = Input.getInt("What is the day: ");
					} while (!(day<32 & day>0)); //Checks of date is valid based on month
				}
				else if((Month.equals("April")) | (Month.equals("June")) | (Month.equals("September")) | (Month.equals("November")))
				{
					do {
						day = Input.getInt("What is the day: ");
					} while (!(day<31 & day>0));
				}
				else
				{
					do {
						day = Input.getInt("What is the day: ");
					} while (!(day<29 & day>0));
				}
				do {
					year = Input.getInt("What is the year: ");
				} while (!(year > 0)); //Checks that the year is not negative
				dateArray[i] = new LongDate( Month, day, year ); //Creates the long date object using parameterized constructor
				System.out.println("All Set");
				System.out.println();
			}
		}
		for(int i = 0; i < 4; i++) //Displays the dates
		{
			if( i == 0 )
			{
				System.out.println("The first date is: " + dateArray[i].getDate()); //Displays the regular date
			}
			else if( i == 1)
			{
				System.out.println("The long version for the second date is: " + dateArray[i].getDate()); //Displays the long date
				//System.out.println("The second date is: " + dateArray[i].getShortDate()); //I wasn't sure if you wanted me to display the short date, so I commented it out
			}
			else if( i == 2)
			{
				System.out.println("The third date is: " + dateArray[i].getDate());
			}
			else
			{
				System.out.println("The long version for the fourth date is: " + dateArray[i].getDate());
				//System.out.println("The fourth date is: " + dateArray[i].getShortDate());
			}	
		}
	}
}