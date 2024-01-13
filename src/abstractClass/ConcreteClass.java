package abstractClass;

public class ConcreteClass extends Sample{

	public static void main(String[] args)
	{
		ConcreteClass cc= new ConcreteClass(); 
		cc.test1();  //calling method from abstract class--> completed in sample(abstract class) 
		cc.test();   //calling method from concrete class--> completed in Concrete class(method from sample class) 
		cc.test2();  //calling method from concrete class--> completed in Concrete class(method from sample class) 
		cc.test3();  //calling method from concrete class--> completed in Concrete class(method from concrete class class) 
		Sample.test4();  //calling complete static method from Sample(abstract class)

	}
	
	@Override 
	public void test() 
	{ 
		System.out.println("This method is completed in Concrete class"); 
	}
	
	@Override 
	public void test2() 
	{ 
		System.out.println("This method is completed in Concrete class"); 
	}
	
	public void test3() 
	{
		System.out.println("Own method from Concrete class");
	}

}
