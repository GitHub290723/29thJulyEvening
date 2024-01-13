package encapsulation;

public class EncapsulationUse 
{
	private int a=10;
	private int b=20;
	
	public void addition()
	{
	   int sum=a+b;
	   System.out.println(sum);
	}
	
	public int getAvalue()
	{
	   return a;
	}
	
	public int getBvalue()
	{
	   return b;
	}
}
