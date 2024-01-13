package collection;

import java.util.LinkedHashSet;

public class LinkedHashSet_Study {

	public static void main(String[] args) 
	{
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("Pune");
		lhs.add("Mumbai");
		lhs.add(null);
		lhs.add(null);
		lhs.add("Nagpur");
		lhs.add("Dhule");
		
		System.out.println(lhs); // No duplicates & insertion is maintained 
		System.out.println("===============================================================");
		
		//lhs.clear();
		//System.out.println();
		//System.out.println("===============================================================");
		
		Object lhs1 = lhs.clone();
		System.out.println(lhs1);
		System.out.println("===============================================================");
		
		System.out.println(lhs.contains("Nagpur"));
		System.out.println("===============================================================");
		
		System.out.println(lhs.equals(lhs1));
		System.out.println("===============================================================");
		
		System.out.println(lhs.hashCode());
		System.out.println("===============================================================");
		
		System.out.println(lhs.isEmpty());
		System.out.println("===============================================================");
		
		System.out.println(lhs.remove(lhs1));
		System.out.println("===============================================================");
		
		System.out.println(lhs.size());
	

	}

}
