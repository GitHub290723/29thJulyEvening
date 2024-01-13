package methods;

public class NonStaticAC {

	public static void main(String[] args)  // Calling non-static method from another class
	{
		// classname object name=new classname(); - creating object for calling from same class
		NonStaticAC subject=new NonStaticAC();
		
		subject.department();
		subject.department_1();
		
		// Calling from another class - NonStaticAC1
		// Creating object for calling from another class
		// To call from another class we need create object for that class
		// classname object name=new classname(); [classname should be the same name of that class whichever we want to call] 
		
		NonStaticAC1 passing=new NonStaticAC1();
		
		// Calling from another class - NonStaticAC1
		
		passing.students();
		passing.students_1();		
	}
	
	public void department()
	{
		System.out.println("Electronics department from Pune University");
	}
	
	public void department_1()
	{
		System.out.println("Electronics department from Mumbai Univestity");
	}

}
