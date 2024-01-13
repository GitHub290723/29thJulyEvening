package interface_study;

final public class FinalKeyword1 {
	
		// If we make any class as final class then we cannot extend that class 
		
		static int b=90;
	
	public static void main(String[] args) 
	{
		final int a=100;  // we can not re assign values to the final variables 
		//String b="Hi"; 
		System.out.println(a); 
		
		//a=a+20; 
		System.out.println(a); 
		
		//a=a+40; 
		System.out.println(a);
		
	}
	
	final void show()  //We cannot override final method 
	{ 
		System.out.println("Show method from Test class"); 
	}

}
