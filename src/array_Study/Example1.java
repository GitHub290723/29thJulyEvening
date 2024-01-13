package array_Study;

public class Example1 {

	public static void main(String[] args) 
	{
		//I want to store student names 
		
		//String name[]= new String[5]; 
		//int tableOf2[]= new int[10]; 
		//char[] gender= new char[3]; 
		
		//I want to store players 
		
		String[] players= new String[10]; // Array Declaration 
		players[0]="Gill"; // Array initialization
		players[1]="Rohit"; 
		players[2]="Virat"; 
		players[3]="KL"; 
		players[4]="Surya"; 
		System.out.println(players[0]);  //Array Usage 
		System.out.println(players[1]); 
		System.out.println(players[2]); 
		System.out.println(players[3]); 
		System.out.println(players[4]); 
		System.out.println(players[5]); 
		
		System.out.println("===================================="); 
		
		int[] rollNum=new int[10];  // Array Declaration 
		rollNum[0]=10; // Array initialization 
		rollNum[1]=11;
		rollNum[2]=12; 
		rollNum[3]=13;
		rollNum[4]=14; 
		// rollNum[5]=15; 
		System.out.println(rollNum[0]);  //Array Usage 
		System.out.println(rollNum[1]); 
		System.out.println(rollNum[2]);
		System.out.println(rollNum[3]); 
		System.out.println(rollNum[4]); 
		
		//static for loop 
		
		System.out.println("===================================="); 
		for(int i=0;i<=4;i++)  //0->1->2->3->4 
			{ 
			System.out.println(rollNum[i]); 
			}
		
		System.out.println("====================================");
		
		System.out.println(rollNum.length); 
		
		System.out.println("===================================="); 
		
		//Dynamic for loop 
		for(int i=0;i<=rollNum.length-1;i++) 
		{ 
			System.out.println(rollNum[i]); 
		}

	}

}
