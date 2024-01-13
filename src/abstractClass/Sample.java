package abstractClass;

public abstract class Sample {

	public static void main(String[] args) 
	{
		// Sample s= new Sample(); // we can not create object of an abstract class 
		// s.test1(); 
		// s.test();
	}
	
	public abstract void test(); //incomplete method 
	public abstract void test2(); //incomplete method 
	public void test1() //complete method 
	{ 
		System.out.println("Complete method from Abstarct class"); 
	} 
	public static void test4() //static complete method 
	{ 
		System.out.println("static complete method"); 
	} 
	//public abstract static void test5();//we cannot make static method as abstract method

}
