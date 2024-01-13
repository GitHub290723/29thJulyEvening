package collection;

import java.util.TreeSet;

public class Treeset_Study {  // Don't have index based methods

	public static void main(String[] args) 
	{
		TreeSet<Object> ts = new TreeSet<>();
		
		ts.add('A');
		ts.add('B');
		ts.add('C');
		//ts.add(null);  // No null allowed, we get null pointer exception here
		//ts.add("Pune");  // Here we get class cast exception, because it store only homogeneous data even if we take 'Object' as a data type.
		//ts.add(12345);  // Here we get class cast exception, because it store only homogeneous data even if we take 'Object' as a data type.
		ts.add('A');
		ts.add('D');
		ts.add('E');
		ts.add('F');
		ts.add('G');
		ts.add('H');
		ts.add('I');
		
		
		System.out.println(ts); // Will be in ascending order 
		System.out.println("==========================================================================");
		
		// ceiling() :-  Returns the least element in this set greater than or equal to the given element, or null if there is no such element
		System.out.println(ts.ceiling('B'));
		System.out.println("==========================================================================");
		
		// floor() :- Returns the greatest element in this set less than or equal to the given element, or null if there is no such element
		System.out.println(ts.floor('F')); 
		System.out.println("==========================================================================");
		
		// first() :- Returns the first(lowest) element currently in this set
		System.out.println(ts.first()); 
		System.out.println("==========================================================================");
		
		// last() :- Returns the last(highest) element currently in this set
		System.out.println(ts.last()); 
		System.out.println("==========================================================================");
		
		// size() :- Returns the number of elements in this set
		System.out.println(ts.size()); 
		System.out.println("==========================================================================");
		
		System.out.println(ts.remove('F')); 
		System.out.println("==========================================================================");						
		
		// higher() :- Returns the least element in this set strictly greater than the given element, or null if there is no such element
		System.out.println(ts.higher('D')); 
		System.out.println("==========================================================================");
		
		// lower() :- Returns the greatest element in this set strictly less than the given element, or null if there is no such element
		System.out.println(ts.lower('F'));
		System.out.println("==========================================================================");
		
		Object ts1 = ts.clone();
		System.out.println(ts1); 
		System.out.println("==========================================================================");
		
		System.out.println(ts.contains('G'));
		System.out.println("==========================================================================");
		
		System.out.println(ts.equals(ts1));
		System.out.println("==========================================================================");
		
		System.out.println(ts.isEmpty());
		System.out.println("==========================================================================");
		
		System.out.println(ts.pollFirst());
		System.out.println("==========================================================================");
		
		System.out.println(ts.pollLast());
		System.out.println("==========================================================================");
		
		
		
		

	}

}
