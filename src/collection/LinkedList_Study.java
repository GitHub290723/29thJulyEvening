package collection;

import java.util.LinkedList;

public class LinkedList_Study {

	public static void main(String[] args) 
	{
		LinkedList<Character> ll = new LinkedList<>();
		
		ll.add('A');
		ll.add('B');
		ll.add('C');
		ll.add('D');
		ll.add('E');
		ll.add('D');
		ll.add('B');
		ll.add(null);
		ll.add(null);
		
		System.out.println(ll);
		
		System.out.println("==================================Methods========================================");
		System.out.println("VIMP difference between elemnt() & poll()");
		
		ll.add(8, 'F');
		System.out.println(ll);
		
		ll.addFirst('G');
		System.out.println(ll);
		
		ll.addLast('H');
		System.out.println(ll);
		
		Object ll1 = ll.clone();
		System.out.println(ll1);
		
		//ll.clear();
		//System.out.println();
		
		System.out.println(ll.contains('C')); 
		
		System.out.println( ll.containsAll(ll));
		
		System.out.println(ll.element()); // Retrieves but does not remove the head of the list, if list empty then shows no such element exception
		
		System.out.println(ll.equals(ll1));
		
		//System.out.println(ll.hashCode());
		
		System.out.println(ll.indexOf('E'));
		
		System.out.println(ll.isEmpty());
		
		//System.out.println(ll.lastIndexOf(ll1));
	
		System.out.println(ll.get(5));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println(ll.offer('I'));
		
		System.out.println(ll.peek());
		
		System.out.println(ll.peekFirst());
		
		System.out.println(ll.peekLast());
		
		System.out.println(ll.poll());  // Retrieves & removes the head from the list if list empty then shows empty
		
		System.out.println(ll.pollFirst());
		
		System.out.println(ll.pollLast());
		
		System.out.println(ll.pop());
		
		ll.push('J');
		System.out.println();
		
		System.out.println(ll);
		
		System.out.println(ll.remove());
		
		System.out.println(ll.remove(0));
		
		System.out.println(ll.set(0, 'G'));
		
		System.out.println(ll.size());
		
		System.out.println(ll);
		

	}

}
