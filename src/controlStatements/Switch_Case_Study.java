package controlStatements;

public class Switch_Case_Study {

	public static void main(String[] args) {
		
		//M--> Male
		//F--> Female 
		//a-z--> please enter correct gender value--> default 
		
		char gender='A'; 
		switch (gender)   //M,F 
		{ 
		  case 'M':System.out.println("I am Male"); 
		  break; 
		  case 'F':System.out.println("I am Female");
		  break; 
		  default:System.out.println("please enter correct gender value"); 
		  break; 
		} 
		
		System.out.println("==============================================="); 
		
		//1-7 
		//1-->Monday 7--> Sunday 
		
		int day=3; 
		switch (day) 
		{
		   case 1:System.out.println("Today is Monday"); 
		   break;
	       case 2:System.out.println("Today is Tuesday"); 
	       break; 
	       case 3:System.out.println("Today is Wednesday"); 
	       break; 
	       case 4:System.out.println("Today is Thursday"); 
	       break; 
	       case 5:System.out.println("Today is Friday"); 
	       break; 
	       case 6:System.out.println("Today is Saturday"); 
	       break; 
	       case 7:System.out.println("Today is Sunday"); 
	       break; 
	       default:System.out.println("Please enter day between 1-7"); 
	       break; 
	    }
		
		//red
		//green
		//yellow

	}

}
