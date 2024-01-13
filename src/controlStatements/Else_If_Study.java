package controlStatements;

public class Else_If_Study {

	public static void main(String[] args) {
		
		// If my gender is M then I am Male 
		// else if My gender is F i am Female 
		// else please enter gender value either M or F 
		
		char gender='F'; 
		if(gender=='M') 
		{ 
			System.out.println("I am Male"); 
		} 
		
		else if (gender=='F') 
		{
			System.out.println("I am Female");
		}
		else 
		{
			System.out.println("please enter gender value either M or F");
		} 
		
		System.out.println("======================================="); 
		
		// If my marks are greater than or equal 80 and less than equal 100--> I am in dist 
		// else if my marks are greater than equal to 66 and less than to 80--> I am in 1st class 
		// else if my marks are greater than or equal to 50 and less than 66--> I am in 2nd class 
		// else if my marks are grater than equal to 40 and less than 50--> i am just pass 
		// else I am fail 
		
		int marks=66; 
		if (marks>100) 
		{
		    System.out.println("Please enter valid marks, shoud be less than 100"); 
		} 
		else if(marks>=80 && marks<=100) 
		{ 
			System.out.println("I am in dist"); 
		} 
		else if (marks>=66 && marks<80) 
		{
			System.out.println("I am in 1st class"); 
		} 
		else if (marks>=50 && marks<66) 
		{
			System.out.println("I am in 2nd class");
		}
		else if (marks>=40 && marks<50) 
		{
			System.out.println("I am just pass"); 
		} 
		else 
		{ 
			System.out.println("I am fail"); 
		}
		
	}

}


