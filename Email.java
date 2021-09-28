package EmailProject;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String alternateEmail;
	private int mailBoxCapacity=500;
	private int length=10;
	private String company="tcss.com";
	private String email;
	
	
	//Constructor to receive the first name and last name
	public Email (String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		
		this.department= setDepartment();
		System.out.println("Email created:"	+" "+ this.firstName +" "+ this.lastName+ " Department:"+this.department);
		
		this.password=randomPassword(length);
		System.out.println("New Password: " + password );
		//printEmail
		email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() +"."+ company;
		System.out.println("Your  Email is: "+email);
	}
	
	//Ask for department
	private String setDepartment() {
		System.out.println("Enter the Department\n1 for sales\n2 for Development\n3 for Accounting\n");
		Scanner scanner=new Scanner(System.in);
		 int depChoice=scanner.nextInt();
		if (depChoice==1) {return "sales";}
		else if (depChoice==2) {return "Development";}
		else if (depChoice==3) {return "Accounting";}
		else {return "blank";}
	}


		//Generate a random passwd
	private String randomPassword (int length) {
			String setPassword = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
			char[] password= new char[length];
			for (int i = 0; i < length; i++) {
				int rand= (int) (Math.random() * setPassword.length());
				password[i]= setPassword.charAt(rand);
				
			}
			String tmpPassword= String.valueOf(password);
			return tmpPassword;
	}
	

	//set mailbox capacity
	public int mailBoxCapacity() {
		System.out.println("set mail box capacity:");
		Scanner scanner = new Scanner(System.in);
		int userMailCapacity= scanner.nextInt();
		
		this.mailBoxCapacity=userMailCapacity;
		System.out.println("New Mail Capacity:"+mailBoxCapacity);
		return mailBoxCapacity;
		
		
	}
}
	//set alternate mail
	// change password
		
