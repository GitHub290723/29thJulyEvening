package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vector_Traversing {

	public static void main(String[] args) 
	{
        Vector<String> v = new Vector<>();
		
		v.add("MH");
		v.add("AP");
		v.add("TN");
		v.add("KA");
		v.add("PB");
		v.add("UP");
		v.add("DL");
		
		System.out.println(v);
		
		System.out.println("================================For Loop================================");
		
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.println(v.get(i));
		}
		
		System.out.println("================================For each Loop================================");
		
		for (String vect:v)
		{
			System.out.println(vect);
		}
		
		System.out.println("================================By Iterator================================");
		
		Iterator<String> a = v.iterator();
		while(a.hasNext())
		{
			System.out.println(a.next());
		}
		
		System.out.println("================================By List Iterator================================");
		
		ListIterator<String> b = v.listIterator();
		while(b.hasNext())
		{
			System.out.println(b.next());
		}
		
		while(b.hasPrevious())
		{
			System.out.println(b.previous());
		}
		
		System.out.println("================================Enumeration================================");
		
		Enumeration<String> c = v.elements();
		while(c.hasMoreElements())
		{
			System.out.println(c.nextElement());
		}	

	}

}
