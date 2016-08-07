
public class LongDate extends Date
{
	private String monthName;

	public LongDate( String m , int d , int y ) //Uses the setDate method in the constructor
	{
		setDate(m, d, y);
	}
	public void setDate( String m , int d , int y ) //Uses the parent class to help set up the long date object
	{
		int monthInt = monthToInt( m );
		super.setDate( monthInt, d, y );
		monthName = m;
	}
	public String getDate() //Long date
	{
		int day = getDay();
		int year = getYear();
		String dayString = Integer.toString(day); //Turns the day and year integers into strings so that they can be displayed as a long date string
		String yearString = Integer.toString(year);
		String longDate = monthName + " " + dayString + ", " + yearString;
		return longDate;
	}
	public String getShortDate() //Uses the parent class to return a short date
	{
		return super.getDate();
	}
	private int monthToInt( String monthName ) //Private method - converts the month to its respective number on the calender
	{
		int month;
		if(monthName == "January")
		{
			month = 1;
		}
		else if(monthName == "Febuary")
		{
			month = 2;
		}
		else if(monthName == "March")
		{
			month = 3;
		}
		else if(monthName == "April")
		{
			month = 4;
		}
		else if(monthName == "May")
		{
			month = 5;
		}
		else if(monthName == "June")
		{
			month = 6;
		}
		else if(monthName == "July")
		{
			month = 7;
		}
		else if(monthName == "August")
		{
			month = 8;
		}
		else if(monthName == "September")
		{
			month = 9;
		}
		else if(monthName == "October")
		{
			month = 10;
		}
		else if(monthName == "November")
		{
			month = 11;
		}
		else if(monthName == "December")
		{
			month = 12;
		}
		else
		{
			month = 0;
		}
		return month;
	}
}