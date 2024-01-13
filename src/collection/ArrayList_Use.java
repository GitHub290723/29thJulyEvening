package collection;

import java.util.ArrayList;

public class ArrayList_Use {

	public static void main(String[] args) 
	{
		ArrayList<Object> a1 = new ArrayList<>(); 
		a1.add("gaurav");
		a1.add(123456789);
		a1.add('G');
		a1.add(true);
		a1.add(null);
		a1.add(12.12f);
		a1.add(12.121212);
		
		System.out.println("List Contains "+a1);
		
		// ArrayList<Object> a2 = new ArrayList<>();   This is Generic type array list --> When we use object as type argument it means we can call any data type don't need to be specified.
		// ArrayList<String> a3 = new ArrayList<>();   This is Specific type array list --> In this type we have to declare specific data type as argument  
	}

}
