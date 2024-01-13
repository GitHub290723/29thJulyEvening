package loops;

public class PreAndPostIncrement {

	public static void main(String[] args) 
	{
		int a=10; 
		System.out.println(a); 
		int i; 
		//post increment 1st assignment 
		i=a++; 
		System.out.println(i); 
		System.out.println(a); 
		System.out.println("================================"); 
		
		int z=99; 
		int y; 
		System.out.println(z);
		y=z++;  // post increment 
		System.out.println(y); 
		System.out.println(z++); 
		System.out.println(z); 
		System.out.println("================================"); 
		
		//pre increment 
		int m=99; 
		int n; 
		n=++m; 
		System.out.println(n); 
		System.out.println(m); 
		++m; 
		System.out.println(m); 
		System.out.println(n); 
		System.out.println("=================================="); 
		
		int p=10; 
		int q; 
		q=p--;  // post decrement 
		System.out.println(q); 
		System.out.println(p); 
		System.out.println("=================================="); 
		
		int w=10; 
		int x; 
		x=--w;  //pre decrement 
		System.out.println(x); 
		System.out.println(w);

	}

}
