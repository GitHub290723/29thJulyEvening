package loops;

public class WhileLoopStudy {

	public static void main(String[] args) 
	{
		// I want to print table of 5 
		//initialization condition updation 
		//     5           <=50       +5 
		//initialization 
		int a=5; 
		while(a<=50)  //condition 
			{ 
			   //statement to be executed 
			   System.out.println(a); 
			   a=a+5; //updation 
			}
		
		System.out.println("============================="); 
		
		// I want to print table of 5 in reverse order 
		//initialization condition updation 
		//      50          >=5       -5 
		int b=500; 
		while(b>=5) 
		{ 
			System.out.println(b); 
			b=b-5; 
		}
			

	}

}
