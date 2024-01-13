package loops;

public class ForLoopStudy {

	public static void main(String[] args) 
	{
		// I want to print table of 5 
		//initialization condition updation 
		// 5               <=50       +5 
		
		for(int a=5;a<=50;a=a+5) 
		{ 
			System.out.println(a); 
		}
		
		// i want to print numbers from 1 to 10 
		//initialization condition updation 
		//    1            <=10       a++ 
		System.out.println("================="); 
		
		for(int i=1;i<=10;i++) 
		{ 
			System.out.println(i); 
		}
		
		System.out.println("================="); 
		
		//Pune-->10 times print 
		//initialization condition updation 
		//int j=1; j<=10; j++; 
		
		String city="Pune"; 
		for(int j=1;j<=10;j++) 
		{ 
			System.out.println(city); 
			System.out.println("Velocity");
		}

	}

}
