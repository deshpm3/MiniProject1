package com.student.exam;

import java.util.Scanner;

public class StudentRegistration {
	int rollno;
	String firstname;
	String middlename;
	String lastname; 
    long mobileno;
    String city;
    String password;
    
    Scanner sc = new Scanner(System.in);
    
  
   // taking user inputs

    void getDetails()
    {
    	System.out.println("=============================================================================================");
    	System.out.println("                           STUDENT REGISTRATION                                              ");
    	System.out.println("=============================================================================================");
    	System.out.println("Enter Roll no");
		rollno =sc.nextInt();
		
		System.out.println("Enter your First  Name");
		firstname= sc.next();
		System.out.println("Enter your Middle Name");
		middlename =sc.next();
		System.out.println("Enter your Last Name");
		lastname=sc.next();
		System.out.println("Enter your mobile number");
		mobileno = sc.nextLong();
		System.out.println("Enter your city");
		city=sc.next();
		System.out.println("Enter your Password");
		password = sc.next();
    	
    }
	
    //---------------------------------------------------------------------------------------------------------------------------------
    
    //Display student details
	void display()
	{
		System.out.println("=============================================================================================");
		System.out.println("Roll No :"+rollno);
		System.out.println("Name: "+firstname+ " "+middlename+ " "+ lastname);
		System.out.println("Mobile No "+mobileno);
		System.out.println("Password:"+password);
		System.out.println("Registration complete");
		System.out.println("=============================================================================================");
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		StudentRegistration s1= new StudentRegistration();
		s1.getDetails();
		s1.display();
				

	}

}
