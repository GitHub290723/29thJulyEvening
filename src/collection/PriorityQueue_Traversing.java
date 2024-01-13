package collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Traversing {

	public static void main(String[] args) 
	{
		PriorityQueue<Object> pq = new PriorityQueue<>();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(10);
		pq.add(40);
		pq.add(50);
		
		System.out.println(pq);
		System.out.println("==================================================================================================");
		
		System.out.println("===================================== For each loop ==============================================");
		for( Object a:pq)
		{
			System.out.println(a);
		}
		
		System.out.println("======================================== Iterator ===========================================");
		Iterator<Object> it = pq.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
