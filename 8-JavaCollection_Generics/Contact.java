import java.io.Serializable;

public class Contact implements Serializable{ //Is serializable
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	
	Contact( String first, String last, String phone, String emailAddress ) //constructor
	{
		firstName = first;
		lastName = last;
		phoneNumber = phone;
		email = emailAddress;
	}
	
	public void setFirst( String first ) //sets the first name
	{
		firstName = first;
	}
	
	public void setLast( String last ) //sets the last name
	{
		lastName = last;
	}
	
	public void setPhone( String phone ) //sets the phone number
	{
		phoneNumber = phoneNumber;
	}
	
	public void setEmail( String emailAddress ) //sets the email address
	{
		email = emailAddress;
	}
	
	public String getFirst() //gets the first name
	{
		return firstName;
	}
	
	public String getLast() //gets the last name
	{
		return lastName;
	}
	
	public String getPhone() //gets the phone number string form
	{
		return phoneNumber;
	}
	
	public String getEmail() //gets the email
	{
		return email;
	}
	
}
