package thisAndSuperKeyword;

public class ThisKeyWord {
	
	int a=100;  // non static global variable 
	int b=190;  // non static global variable static  
	int c=100;

	public static void main(String[] args) 
	{
		ThisKeyWord t= new ThisKeyWord();  // created object of a class 
		t.test();		
	}
	
	public void test() 
	{ 
		int a=101;  // non static local variable 
		int sum=a+10; 
		System.out.println("sum is "+sum); 
		int sum1= this.a+10; 
		System.out.println("sum is "+sum1); 
		
		int b=900; 
		int sum2=b+10;
		System.out.println("sum is "+sum2);
		int sum3=this.b+10; 
		System.out.println("sum is "+sum3); 
		
		int div=c/10;  //we can use static variables in static as well as non static methods methods
		System.out.println("div is "+div);
		int div1=this.c/10;
		System.out.println("div is "+div1);
	} 
	
	static void test1() 
	{
	   //int mul=a*10; we cant use non-static variables in static methods 
	   // int mul1=c*100; 
}
}

