package polymorphism;

public class CompileTime {

	public static void main(String[] args) 
	{
		CompileTime ct=new CompileTime();
		ct.addition();
		ct.addition(100, 200);
		ct.addition(99.9f, 1);
		ct.addition(2, 99.9f);
    }
	
	public void addition() 
	{ 
		int a=10; 
		int b=20; 
		int sum=a+b; 
		System.out.println("Addition is "+sum); 
	}
	
	public void addition(int a, int b) 
	{ 
		int sum=a+b; 
		System.out.println("Addition is "+sum); 
	} 
	
	public void addition(float a, int b) 
	{ 
		float sum=a+b; 
		System.out.println("Addition is "+sum); 
	}
	
	public void addition(int a, float b) 
	{ 
		float sum=a+b; System.out.println("Addition is "+sum); 
	}

}
