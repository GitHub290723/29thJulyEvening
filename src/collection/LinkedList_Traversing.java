package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList_Traversing {

	public static void main(String[] args)  // Enumeration can't be done
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
		 
		 System.out.println("=========================For Loop============================");
		 
		 for(int i=0; i<=ll.size()-1;i++)
		 {
			 System.out.println(ll.get(i));
		 }
		 
		 System.out.println("=========================For each Loop============================");
		 
		 for (Character a:ll)
		 {
		   	 System.out.println(a);
		 }
		 
		
		 System.out.println("=========================Iterator============================");
		
		 Iterator<Character> it = ll.iterator();
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 System.out.println("=========================List Iterator============================");
		 ListIterator<Character> it1 = ll.listIterator();
		 while(it1.hasNext())
		 {
			 System.out.println(it1.next());
		 }
		 

	}

}
