package collection;

import java.util.ArrayList;

public class ArrayListMethodEg2 {

	public static void main(String[] args) 
	{
		ArrayList<Object> al = new ArrayList<>();
		
		System.out.println(al.add("Pune")); 
		System.out.println(al); 
		
		al.add(0, "Katraj"); 
		System.out.println(al); 
		
		// al.clear(); 
		// System.out.println(al);
		
		Object alNew = al.clone(); 
		System.out.println("cloned array list--> "+alNew); 
		System.out.println(al.contains("Pune")); 
		System.out.println(al.contains("Mumbai"));
		
		al.ensureCapacity(3); 
		al.add("MH"); 
		System.out.println(al); 
		al.add("Bharat"); 
		System.out.println(al); 
		al.add("New"); 
		System.out.println(al);
		
		System.out.println("=============================="); 
		System.out.println(alNew); 
		System.out.println(al); 
		System.out.println(al.equals(alNew));
		
		System.out.println("=============================="); 
		System.out.println(al.get(2)); 
		System.out.println("=============================="); 
		System.out.println(al.indexOf("MH")); 
		System.out.println("==============================");
		
		//al.clear(); 
		System.out.println(al.isEmpty()); 
		
		System.out.println("=============================="); 
		System.out.println(al); 
		System.out.println(al.remove(1)); 
		System.out.println(al);
		
		System.out.println("=============================="); 
		al.set(1, "Maharashtra"); 
		System.out.println(al); 
		
		System.out.println("=============================="); 
		System.out.println(al.size());

	}

}
