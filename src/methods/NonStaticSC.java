package methods;

public class NonStaticSC {

	public static void main(String[] args) // Calling Non-static regular method from same class 
	
	{
	
		// To call non-static method we need object
		// Object creation should be within main method only, Syntax :- classname object name=new classname();
		
		NonStaticSC university =new NonStaticSC();
		
		// Calling non-static method :- objectname.methodname();
		
		university.city();
		university.city_2();
		
		
	}
	
	public void city()
	
	{
		System.out.println("1. Pune University ");
	
	}
	
	public void city_2()

	{
		
		System.out.println("2. Mumbai Univesity");
	
	}

}
