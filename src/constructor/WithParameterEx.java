package constructor;

public class WithParameterEx 
{
	int a; 
	int b; 
	int c;  
	
	public WithParameterEx()
	{
		a=1; 
	    b=2;
	    c=3; 
    }	
    
    public WithParameterEx(int x) //user defined single parameter constructor 
    {
    	a=x; 
    	//b? 
    	//c? 
    }
    
    public WithParameterEx(int x, int y) //user defined two parameter constructor 
    { 
    	a=x; 
    	b=y; 
    	//c? 
    }
    
    public WithParameterEx(int x, int y,int z) //user defined three parameter constructor
	{
    	a=x;
    	b=y;
    	c=z;
    }
    
    public static void main(String[] args) 
    { 
    	WithParameterEx  c= new WithParameterEx (); 
    	c.addition(); 
    	c.subtraction(); 
    	System.out.println("===================");
    	WithParameterEx  c1= new WithParameterEx (100);
    	c1.addition(); 
    	c1.subtraction(); 
    	System.out.println("==================="); 
    	WithParameterEx  c2= new WithParameterEx (9, 10); 
    	c2.addition(); 
    	c2.subtraction();
    	System.out.println("==================="); 
    }
    
    public void addition() // non static method 
    { 
    	int sum=a+b+c; 
    	System.out.println("a value is "+a);
    	System.out.println("b value is "+b);
	    System.out.println("c value is "+c); 
	    System.out.println("Sum is "+sum); 
	}
    
    public void subtraction() 
    { 
    	int sub=a-b-c; 
    	System.out.println("sub is "+sub); 
    } 

}
