package methods;

public class MathematicalOperations {

	public static void main(String[] args) // Calling non-static without parameter
	
	{
		MathematicalOperations mo=new MathematicalOperations();
		mo.addition();		
	}
	
	public void addition ()
	{
		int a;
		int b;
		int sum, sum1, sum2, sum3;
		
		a=10;
		b=20;
		sum=a+b;
		sum1=a-b;
		sum2=a*b;
		sum3=b/a;
		
		System.out.println("Addition = "+sum);
		System.out.println("Subtraction = "+sum1);
		System.out.println("Multiplication = "+sum2);
		System.out.println("Division = "+sum3);
	}
}
