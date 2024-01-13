package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Traversing {

	public static void main(String[] args) 
	{
		TreeSet<Object> ts = new TreeSet<>();
		ts.add(1);
		ts.add(2);
		ts.add(3);
		ts.add(9);
		ts.add(7);
		ts.add(10);
		ts.add(5);
		ts.add(6);
		
		System.out.println(ts);
		System.out.println("===============================================================================");
		
		System.out.println("============================= For each loop ===================================");
		for(Object fl:ts)
		{
			System.out.println(fl);
		}
		
		System.out.println("============================= Iterator ===================================");
		Iterator<Object> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("============================= Descending Iterator ===================================");
		Iterator<Object> dit = ts.descendingIterator();
		while(dit.hasNext())
		{
			System.out.println(dit.next());
		}
		
		
		
		
		// Can't use For Loop & Eneumeration is not possible
		

	}

}
