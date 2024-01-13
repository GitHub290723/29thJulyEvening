package controlStatements;

public class Nested_If_Else {

	public static void main(String[] args) {
		
		//If email_ID is correct then please enter password 
		//If password is correct then welcome to home page 
		//else password is wrong then please enter correct password 
		//else email id is wrong then please enter correct email id 
		
		String email="velocity@vctcpune.com"; 
		String password="Velocity@123"; 
		
		if(email=="velocity@vctcpune.com")  //outer if statement 
			{ 
		    	System.out.println("please enter password"); 
		    	
		    	if(password=="Velocity@123")  // inner if statement 
		    		{ 
		    		   System.out.println("welcome to home page"); 
		    		   } 
		    	else  //inner else statement 
		    		{ 
		    		    System.out.println("please enter correct password"); 
		    		    } 
		    	}
		else   //outer else statement 
			{ 
			    System.out.println("please enter correct email id"); 
		    } 
		}
		    		
}
		






