package methods;

public class StaticAnotherClass2 {

	public static void main(String[] args)
	{
		// Calling static regular method from another class - StaticAnotherClass
		StaticAnotherClass.bank_lockers(); 
		StaticAnotherClass.bank_lockers_1();
		StaticAnotherClass.bank_lockers_2();
		
		// Sample practice
		
		StaticAnotherClass.bank_lockers(); 
		locker_data();
		StaticAnotherClass.bank_lockers_1(); 
		locker_data_1();
		StaticAnotherClass.bank_lockers_2(); 
		locker_data_2();		
	}
	
	    public static void locker_data()
		   {
				System.out.println("Bank locker holding customer count = 150");
		   }
	
	    public static void locker_data_1()
		  {
		       System.out.println("Bank locker holding bank Employees Count = 32");
		  }
	
    	public static void locker_data_2()
		 {		
 		       System.out.println("Bank locker holding business owners count = 25");
	     }

}
