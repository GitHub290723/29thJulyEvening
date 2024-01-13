package methods;

public class StaticAnotherClass { // Calling static regular method from another class

	public static void main(String[] args) 
	
	{
		
		// Calling static regular method from same class
		bank_lockers();  
		bank_lockers_1();
		bank_lockers_2();
		
		// Calling static regular method from another class - StaticAnotherClass2
		StaticAnotherClass2.locker_data(); 
		StaticAnotherClass2.locker_data_1();
		StaticAnotherClass2.locker_data_2();
		
		
		

	}
	
	
		
		public static void bank_lockers()
		{
			
			System.out.println("Reserved bank lockers for customers ");

		}
		
		public static void bank_lockers_1()
		
		{
			
			System.out.println("Reserved bank lockers for bank employees");
			
		}
		
		public static void bank_lockers_2()
		
		{
			
			System.out.println("Reserved bank lockers for business owners");
			
		}
		
		
		
	
	
	
	

}
