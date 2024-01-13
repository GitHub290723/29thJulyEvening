package collection;

import java.util.PriorityQueue;

public class PriorityQueue_Study {

	public static void main(String[] args) 
	{
		PriorityQueue<Object> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(10);
		pq.add(40);
		pq.add(50);
		//pq.add('A'); // Class cast exception
		//pq.add("Pune"); // Class cast exception
		//pq.add(33.33f); // Class cast exception
		//pq.add(null); // Null pointer exception
		
		System.out.println(pq); // Duplicates are allowed & in ascending order
		System.out.println("=========================================================================================");
		
		// Returns the comparator used to order elements in this queue or null if this queue is sorted according to the natural ordering of its element. 
		System.out.println(pq.comparator()); 
		System.out.println("=========================================================================================");
		
		System.out.println(pq.contains(30));
		System.out.println("=========================================================================================");
		
		System.out.println(pq.containsAll(pq));
		System.out.println("=========================================================================================");
		
		System.out.println(pq.offer(60));
		System.out.println("=========================================================================================");
		
		int pq1 = pq.hashCode();
		System.out.println(pq1);
		System.out.println("=========================================================================================");
		
		System.out.println(pq.isEmpty());
		System.out.println("=========================================================================================");
		
		System.out.println(pq.peek());
		System.out.println("=========================================================================================");
		
		System.out.println(pq.poll()); // Retrive & remove first element in this list, returns "null" if there is no element 
		System.out.println("=========================================================================================");
		
		System.out.println(pq.remove()); // Same as poll() only difference is throws "no such element exception" if there is no element 
		System.out.println("=========================================================================================");
		
		System.out.println(pq.size());
		System.out.println("=========================================================================================");
		
		System.out.println(pq.equals(pq));
		System.out.println(pq.equals(null));
		System.out.println("=========================================================================================");

	}

}
