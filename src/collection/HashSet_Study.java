package collection;

import java.util.HashSet;

public class HashSet_Study {

	public static void main(String[] args) 
	{
		HashSet<Object> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(2);
		hs.add(3);
		hs.add(5);
		hs.add(7);
		hs.add(4);
		hs.add(6);
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs); // No duplicates & random insertion
		System.out.println("================================================================");
		
		// hs.clear(); // Remves all elements from list
		System.out.println("================================================================");
		
		System.out.println(hs.contains(3)); // true
		System.out.println(hs.contains(9)); // false
		System.out.println("================================================================");
		
		System.out.println(hs.isEmpty());  // Returns true if there is no elements in list
		System.out.println("================================================================");
		
		hs.remove(4);
		System.out.println(hs);
		System.out.println("================================================================");
		
		System.out.println(hs.size());
		System.out.println("================================================================");
		
		
		
		
		
		

	}

}
