package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	
	//Constructor to receive the first name last name
	public Email(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName  = lastName;
		System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
	
	
	//CALL A METHOD ASKING FOR THE DEPARTMENT - RETURN THE DEPARTMENT
	this.department = setDepartment();
	System.out.println("Department: " + this.department);
	
	//CALL A METHOD THAT RETURNS A RANDOM PASSWORD
	this.password = randomPassword(defaultPasswordLength);
	System.out.println("Your password is: " + this.password);
	
	//COMBINE ELEMENTS TO GENERTAE EMAIL
	email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	}
	//Ask for the department
	private String setDepartment()
	{
		System.out.print("NEW WORKER: " +  firstName + "DEPARTMENT CODES\n1 for SALES\n2 for DEVELOPMENT\n3 for ACCOUNTING\n0 for NONE\n ENTER DEPARTMENT CODE: ");
	    Scanner in = new Scanner(System.in);
	    int depChoice = in.nextInt();
	    if     (depChoice == 1 ) {return "SALES";}
	    else if (depChoice == 2 ) {return "DEVELOPER";}
	    else if (depChoice == 3 ) {return "ACCOUNTING";}
	    else  {return "";}
	}
	
	//GENERATE RANDOM PASSWORD
	
	private String randomPassword(int length)
	{
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		for(int i=0; i<length; i++)
		{
			int rand = (int) (Math.random() * passwordSet.length() );
			password[i] = passwordSet.charAt(rand);
		}
	    return new String(password);
	}
	
	
	
	//SET THE MAILBOX CAPACITY
	public void setMailboxCapacity(int capacity)
	{
		this.mailboxCapacity = capacity;
	}
	
	
	//SET THE ALTERNATE EMAIL
	public void setAlternateEmail(String altEmail)
	{
		this.alternateEmail = altEmail;
	}
	

	//CHANGE THE PASSWORD
	public void changePassword(String password)
	{
		this.password = password; 
	}
	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail()  {return alternateEmail;}
	public String getPassword()  {return password;}
	public String showInfo()
	{
		return "DISPLAY NAME: " + firstName + " " + lastName +
			   "\nCOMPANY EMAIL: " + email +
			   "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
	}

}
