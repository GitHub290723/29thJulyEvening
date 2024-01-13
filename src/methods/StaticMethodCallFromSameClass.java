package methods;

public class StaticMethodCallFromSameClass {

	public static void main(String[] args) 
	{
		//How to call static regular method from same(own) class
		// methodName();
		
		test(); // calling static regular method from same class
		test1(); //calling static regular method from same class
		test1();
		test1();
		test1();
		test();

	}
	
	public static void test() // complete static regular method
	
	{
	
		System.out.println("Hi this is static regular method test");
	}
	
	public static void test1() // complete static regular method
	
	{
	
		System.out.println("Hi this is static regular method test1");
	}

}
