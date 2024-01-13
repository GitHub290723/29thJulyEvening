package array_Study;

public class MultiDimentionalArray2 {

	public static void main(String[] args) 
	{
		// || A B C || 
		// || D E F ||
		// || G H I || 
		char[][] div= {{'A','B','C'},{'D','E','F'},{'G','H','I'}}; 
		
		//outer for loop
		for(int i=0;i<=div.length-1;i++) 
		{ 
			for(int j=0;j<=div.length-1;j++) 
			{ 
				System.out.print(div[i][j]+" "); 
			} System.out.println(); 
		}
		
		System.out.println("======================="); 
		
		// true false true 
		// true true true 
		// false false false 
		boolean result[][]= {{true, false, true},{ true, true, true},{false, false, false}}; 
		
		//outer for loop--> rows 
		for(int i=0;i<=result.length-1;i++) 
		{ 
			for(int j=0;j<=result.length-1;j++) 
			{
				System.out.print(result[i][j]+" "); 
			}
			System.out.println(); 
		}

	}

}
