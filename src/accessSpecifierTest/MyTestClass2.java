package accessSpecifierTest;

import accessSpecifiers.MyClass;

public class MyTestClass2 extends MyClass 
{

	public static void main(String[] args) 
	{
		MyClass m= new MyClass(); 
		
	  //m.test1(); test1 is private can be accessed only within same class not in another package 
	  //m.test2(); test2 is default can be accessed only within same package not in another package 
	  //m.test3(); test3 is protected can be accessed only within same package, to call in another package we need inheritance 
		m.test4(); //calling public method from another package 
		
		//to access protected members do inheritance 1st and create object of subclass 
		
		MyTestClass2 mt2= new MyTestClass2(); //protected members can be called using subClass object only 
		mt2.test3();  //test3 is protected can be accessed only within same package, to call in another package we need inheritance 
		mt2.test4();  //calling public method from another package
		

	}

}
