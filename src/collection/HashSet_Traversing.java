package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_Traversing { // SSet is not index basis it's hash table basis therefore index is not supported in Set

	public static void main(String[] args) 
	{
		HashSet<Object> hs1 = new HashSet<>();
		
		hs1.add("HI");
		hs1.add("BYE");
		hs1.add("GN");
		hs1.add(null);
		hs1.add(null);
		
		System.out.println(hs1); // No duplicate & random insertion
		
		// With hashSet Traversing we can't use for loop because it uses get method & get method use index.
		
		System.out.println("=================== For each loop ==============================");
		
		for(Object fl : hs1)
		{
			System.out.println(fl);
		}
		
		System.out.println("=================== Iterator ==============================");
		
		Iterator<Object> it = hs1.iterator();
		while (it.hasNext())
		{
			System.out.println(it.next());
		}
		

	}

}
