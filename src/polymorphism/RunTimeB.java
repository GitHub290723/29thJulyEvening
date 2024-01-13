package polymorphism;

public class RunTimeB extends RunTimeA 
{

	public static void main(String[] args) 
	{
		RunTimeA a= new RunTimeA();// created object of super class 
		RunTimeB b= new RunTimeB();// created object of sub class
		b.test(); 
		b.math_operation(0, 0); 
		b.math_operation(2, 2); 
		a.math_operation(2, 2);

	}
	
	public void show() 
	{ 
		System.out.println("B's Show method"); 
	}
	
	public void test() 
	{
		System.out.println("B's Test method"); 
	}
	
	public void math_operation(int a, int b) 
	{ 
		int sub=a-b; 
		System.out.println("sub is "+sub); 
	}

}
