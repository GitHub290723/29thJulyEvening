package collection;

import java.util.Vector;

public class VectorStudy {

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
		
		// All ArrayList methods + vector methods
		System.out.println("=========================================================================================");
		
		// capacity() :- Return current capcity of vector i.e number of elements that can handle. Return type is int.
		
		System.out.println(v.capacity());
		System.out.println("=========================================================================================");
		
		// size() :- Return the number of components/element in this vector
		
		System.out.println(v.size());
		System.out.println("=========================================================================================");
		
		// get() :- Returns the element from specified position. This is collection method. 
		
		System.out.println(v.get(1));
		System.out.println("=========================================================================================");
		
		// elementAt() :- Returns the component at specified index. This is vector method.
		
		System.out.println(v.elementAt(2));
		System.out.println("=========================================================================================");
		
		// firstElement() :- Return the first element from list i.e index 0.
		
		System.out.println(v.firstElement());
		System.out.println("=========================================================================================");
		
		// lastElement() :- Return the first element from list (last index).
		
		System.out.println(v.lastElement());
		System.out.println("=========================================================================================");
		
		// insertElementAt() :- Insert the element in list at specified index & remaining will be shifted to right side
		
		v.insertElementAt("GA", 1);  // Same as add(index,element);
		System.out.println("=========================================================================================");
		
		// remove(index) :- Removes the element at specified position & sifts subsequent elements to left. Returns the element that is removed
		System.out.println(v.remove(3));
		System.out.println("=========================================================================================");
		
		// remove(object) :- Removes the first occurrence of the specified element
		System.out.println(v.remove("KA"));
		System.out.println("=========================================================================================");
		
		// set() :- Replace the element at specified position with the specified element
		System.out.println(v.set(2, "KL"));
		System.out.println("=========================================================================================");
		
		// setElement() :- Replace the element at specified position with the specified element
		v.setElementAt("CG", 2);
		System.out.println("=========================================================================================");
		
		/* setSize() :- Set the size of vector if the new size > current size then null items added to end of vector 
		 * & if the new size > current size then all component at index new size & greater are discarded
		 */
		v.setSize(10);
		System.out.println("=========================================================================================");
		
		// clear() :- Removes all the elements from this vector 		
		//v.clear();
		System.out.println(v);
		System.out.println("=========================================================================================");
		
		 
	}

}
