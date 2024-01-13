package loops;

public class DoWhileLoop {

	public static void main(String[] args) 
	{
		// I want to print table of 5 
		//initialization condition updation 
		//      5           <=50      +5 
		int i=5;  //initialization//5 
		do 
		{
			System.out.println(i);
			//Statement to be executed //5,10,45,50 
			i=i+5; //updation 10,15 ....45 
		}
		while(i<=50); 
		
		System.out.println("=================="); 
		
		// I want to print table of 5 in reverse order 
		//initialization condition updation 
		//      50          >=5       -5 
		int j=50; 
		do 
		{ 
		   System.out.println(j); 
	   	   j=j-5; 
		}
		while(j<=5);
	}

}


