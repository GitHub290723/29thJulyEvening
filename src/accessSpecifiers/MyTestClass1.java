package accessSpecifiers;

public class MyTestClass1 {

	public static void main(String[] args) 
	{
		//create object another class(Myclass) 
		MyClass m= new MyClass(); 
	  
		//m.test1(); test1 is private can be accessed only within same class not in another class
		m.test2();  // calling default method from another class 
		m.test3();  // calling protected method from another class 
		m.test4();  //calling public method from another class
		
	   //System.out.println(m.a); variable is private can be accessed only within same class not in another class 
		System.out.println(m.b);  //calling default variable from another class
		System.out.println(m.c);  //calling protected variable from another class 
		System.out.println(m.d);  //calling public variable from another class

	}

}
