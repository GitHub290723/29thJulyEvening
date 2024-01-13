package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Traversing {

	public static void main(String[] args) 
	{
		ArrayList<Integer> i = new ArrayList<>(); // Here we have taken specified data type "Integer"
		i.add(1);
		i.add(2);
		i.add(3);
		i.add(4);
		i.add(5);
		i.add(10);
		
		
		System.out.println(i);
		
		System.out.println("===================For Loop==================");
		
		for(int a=0; a<=i.size()-1;a++)
		{
			System.out.println(i.get(a));
		}
		
		System.out.println("===========for each loop===============");
		
		for(Integer b:i)
		{
		    System.out.println(b);
		}
		
		System.out.println("==============Iterator===================");
		
		Iterator<Integer> iI = i.iterator();
		while(iI.hasNext())
		{
			System.out.println(iI.next());
		}
		
		System.out.println("==============List Iterator===================");
		
		ListIterator<Integer> li = i.listIterator();
		while(li.hasNext())  // Ascending order
		{
			System.out.println(li.next());
		}
		
		while(li.hasPrevious())  // Reverse Direction / Descending order
		{
			System.out.println(li.previous());
		}
		
		System.out.println("==============We can't perform enumeration in ArrayList===================");


	}

}
