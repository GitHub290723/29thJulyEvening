package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHastSet_Traversing {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Pune");
		lhs.add("Mumbai");
		lhs.add(null);
		lhs.add(null);
		lhs.add("Nagpur");
		lhs.add("Dhule");
		
		System.out.println(lhs);
		System.out.println("====================================================================");
		
		System.out.println("======================== For each loop ==================================");
		
		for(String fl : lhs)
		{
			System.out.println(fl);
		}
		
		System.out.println("======================== For iterator ==================================");
		
		Iterator<String> it = lhs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
