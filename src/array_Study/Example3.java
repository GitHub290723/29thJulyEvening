package array_Study;

import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) 
	{
		int[] age= {7,8,1,9,6,4,5}; //I want to print the age values as it is
		
		System.out.println("========Same order============="); 
		
		for(int i=0;i<=age.length-1;i++) 
		{ 
			System.out.println(age[i]); 
		} 
		
		System.out.println("==========Reverse order============"); 
		//I want to print the age values in reverse order 
		for(int i=age.length-1;i>=0;i--) 
		{ 
			System.out.println(age[i]); 
		}
		
		System.out.println("=========Ascending order============="); 
		Arrays.sort(age);  //using sort method of Arrays class 
		for(int i=0;i<=age.length-1;i++) 
		{ 
			System.out.println(age[i]);
	    } 
		
		System.out.println("=========Descending order============="); 
		for(int i=age.length-1;i>=0;i--) 
		{ 
			System.out.println(age[i]); 
		}
		
		System.out.println("======================================="); 
		
		String[] names= {"Navaaj","Akshay","Salman","John","Bobby"}; 
		Arrays.sort(names);  //we have sorted array called as names 
		
		System.out.println("=========Ascending order============="); 
		for(int i=0;i<=names.length-1;i++) 
		{ 
			System.out.println(names[i]); 
		}
		
		System.out.println("=========Descending order============="); 
		for(int i=names.length-1;i>=0;i--) 
		{ 
			System.out.print(names[i]+" "); 
		}
	}

}
