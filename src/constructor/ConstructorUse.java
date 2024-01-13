package constructor;

public class ConstructorUse 
{
	int a; // Variable declaration
	int b;
	int c;
	
	//use of constructor -->To initialize data member/variable 
	public ConstructorUse() // user defined zero/without parameter constructor 
	
	{ 
		a=100; 
		b=200; 
		c=300; 
	}
	

	public static void main(String[] args) 
	{
		// The constructor is called when an object of a class is created. 
		
		ConstructorUse cu= new ConstructorUse(); // created object of a class 
		cu.addition();
	}
	
	public void addition() 
	{ 
		int sum; 
		sum=a+b+c; 
		System.out.println("Sum is "+sum); 
	}

}
