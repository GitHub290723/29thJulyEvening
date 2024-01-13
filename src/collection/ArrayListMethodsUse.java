package collection;

import java.util.ArrayList;

public class ArrayListMethodsUse {

	public static void main(String[] args) 
	{
		ArrayList<Object> a1 = new ArrayList<>();
		
		// add method :-
		a1.add("Pune");
		System.out.println(a1);
		System.out.println("=========================================================================");
		
		// add(int index, object element ) :- // Element will be inserted in specified space in this eg. space/index is '0' declared for element 'Aanandanagar'
		a1.add(0, "Anandanagar");
		a1.add(1, "Suncity");
		a1.add(2, "Sinhgad Road");
		a1.add(3, "India");
		System.out.println(a1);
		System.out.println("=========================================================================");
		
		// clear method :- Removes all elements from list & output will be blank []
		//a1.clear();
		//System.out.println(a1);
		System.out.println("=========================================================================");
		
		// clone method :- Create the duplicate also we can't manipulate duplicate list created by using clone
		Object a1New = a1.clone();
		System.out.println("Clone list --> "+a1New);
		System.out.println("=========================================================================");
		
		// contains method :- To find element is present or not in list, Return type is boolean		
		System.out.println(a1.contains("Pune")); // Here we written cmd directly in printing statement because we don't want to create ref variable
		System.out.println("=========================================================================");
		
		// ensureCapacity method :- 
		a1.ensureCapacity(3);
		System.out.println(a1);
		System.out.println("=========================================================================");
		
		// equals methods :- Compare two object are equal size and the elements in them, Return type is boolean
		System.out.println(a1.equals(a1New));
		System.out.println("=========================================================================");
		
		// get method :- Returns the element at the specified position in list		
		System.out.println(a1.get(1));
		System.out.println("=========================================================================");
		
		// indexOf method :- Returns the index of the first occurance of the specified element in the list, Return type int
		System.out.println(a1.indexOf("Pune"));
		System.out.println("=========================================================================");
		
		// isEmpty method :- Returns true if their is element present
		System.out.println(a1.isEmpty());
		System.out.println("=========================================================================");
		
		// lastIndexOf method :- Returns the index of the last occurance of element
		System.out.println(a1.lastIndexOf("Pune"));
		System.out.println("=========================================================================");
		
		// remove method :- Removes the element at the specified position of index and shifts any subsequent to the left
		//a1.remove(1);
		//System.out.println(a1);
		System.out.println("=========================================================================");
		
		// set method :- replace the element at specified position in this list with the specified element
		
		a1.set(0, "Suncity");
		System.out.println(a1);
		System.out.println("=========================================================================");
		
		// size method :- Gives the count of elements present in list
		
		System.out.println(a1.size());
		
		
		

	}

}
