package dataTypes;

public class NumericAndDecimal {

	public static void main(String[] args)
	{
		
		// age,height,percentage etc
		// only two variables float and double
		
		// float
		
		float height;
		height=5.7f; // When we use float we need to use 'f' after give value
		System.out.println("My height is "+height);
		
		float distance;
	    distance=5.765432107654321f; // When we use float we need to use 'f' after give value
		System.out.println("Distance is "+distance); // output is not accurate in float as per given value upto 6 values after decimal
		
		// double
		
		double distance1;
	    distance1=5.765432107654321d; // When we use float we need to use 'd' after give value
		System.out.println("Distance 1 is "+distance1); // output is accurate in float as per given value upto 15 values after decimal
		

	}

}
