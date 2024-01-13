package thisAndSuperKeyword;

public class SuperKeyword extends ThisKeyWord {
	
	int a=1000;  //global non-static variable from sub class


	public static void main(String[] args) 
	{
		 SuperKeyword su= new SuperKeyword(); 
		 su.test3(); 
	} 
	
	public void test3() 
	{ 
		int a=999;  //local non-static variable from sub class 
		int sum=a+100;  //used local value of a-->999 
		System.out.println(sum+" used local value of a"); 
		
		int sum1=this.a+100;  //used local value of a-->1000 
		System.out.println(sum1+" used global value of a same class"); 
		
		int sum2=b+100;  //used global value of b-->190 from super class(ThisKeyWord) 
		System.out.println(sum2);
		int sum3=super.a+100;  //used global value of a-->100 from super class(ThisKeyWord) 
		System.out.println(sum3+" used global value of a super class");

	}

}
