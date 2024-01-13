package interface_study;

public class MyClass /*implements MyInterface*/  

// Most Important :- Need to watch interface videos to solve the problems

{
	public static void main(String[] args) 
	{ 
		MyClass m= new MyClass();  //created object of implementation class 
		m.test();
		// m.test1(); 
		m.test1(10, 20); 
	}
	
	
	public void test() 
	{ 
		System.out.println("Method completed in Implementation class"); 
	}
	
	public void test1() 
	{
		System.out.println("Own method of implementation class"); 
	}
	
	
	public void test1(int a, int b) 
	{ 
		int sum=a+b; 
		System.out.println("Sum is "+sum); 
	}


		
	
}

	
	

