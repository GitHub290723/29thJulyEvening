package string_Study;

public class StringMethods {

	public static void main(String[] args) 
	{
		//length() 
		
		String s="Pune INDIA MH"; 
		int slength = s.length(); 
		System.out.println("Length of string is "+slength); 
		
		System.out.println("==========================="); 
		
		//2. touppercase() 
		//3. toLowerCase() 
		
		String a="Pune"; 
		System.out.println(a.toUpperCase()); 
		String upperCase = a.toUpperCase(); 
		System.out.println(upperCase); 
		System.out.println(upperCase.toLowerCase()); 
		String lowerCase = upperCase.toLowerCase(); 
		System.out.println(lowerCase); 
		
		System.out.println("==========================="); 
		
		// 4. equals() 
		// 5. equalsIgnoreCase() 
		
		String x1="Velocity"; 
		String x2="Velocity"; 
		String x3="velocity"; 
		String x4= new String("Velocity");
		String x5= new String("Velocity"); 
		//String x6= new String("velocity"); 
		
		boolean result = x1.equals(x2); 
		System.out.println(result); 
		System.out.println(x2.equals(x4)); 
		System.out.println(x2.equals(x3));
		
		//case sensitive 
		
		System.out.println(x1==x2); 
		System.out.println(x1==x4);
		System.out.println(x5==x4); 
		System.out.println(x2.equalsIgnoreCase(x3)); 
		
		System.out.println("==========================="); 
		
		//6. contains() 
		
		String y1="INDIA"; 
		System.out.println(y1.contains("A")); 
		System.out.println(y1.contains("a")); 
		System.out.println(y1.contains("IND")); 
		System.out.println(y1.contains("NDA")); 
		
		System.out.println("==========================="); 
		
		//7. isEmpty() 
		
		String a1="Katraj"; 
		String a2=""; 
		String a3=" "; 
		System.out.println(a1.isEmpty()); 
		System.out.println(a2.isEmpty()); 
		System.out.println(a3.isEmpty());
		
		// isBlank 
		
		System.out.println(a1.isBlank()); 
		System.out.println(a2.isBlank()); 
		System.out.println(a3.isBlank()); 
		
		System.out.println("==========================="); 
		
		//8. charAt 
		
		String b1="Velocity"; 
		// String b2="Katraj"; 
		char myChar = b1.charAt(1); 
		System.out.println(myChar); 
		System.out.println(b1.charAt(4)); 
		// System.out.println(b1.charAt(40)); 
		// System.out.println(b1.charAt(-4)); 
		
		System.out.println("==========================="); 
		
		// 9. endsWith 
		// 10. startsWith 
		
		String c1="Velocity"; 
		System.out.println(c1.endsWith("city")); 
		System.out.println(c1.endsWith("loc")); 
		System.out.println(c1.endsWith("cty")); 
		System.out.println(c1.endsWith("Velocity")); 
		
		System.out.println("---------------------------------"); 
		
		System.out.println(c1.startsWith("city")); 
		System.out.println(c1.startsWith("Velo"));
		System.out.println(c1.startsWith("loc"));
		System.out.println(c1.startsWith("loc", 2)); 
		System.out.println(c1.startsWith("ocity",3)); 
		System.out.println(c1.startsWith("i",5));
		
		System.out.println("==========================="); 
		
		// 11. substring 
		
		String d1="MAHARASHTRA PUNE INDIA KATRAJ"; 
		System.out.println(d1.substring(12)); 
		System.out.println(d1.substring(17, 22)); 
		System.out.println(d1.substring(0, 11)); 
		
		System.out.println("==========================="); 
		
		// 12. concat 
		
		String e1="Software"; 
		String e2="Testing"; 
		System.out.println(e1.concat(" ").concat(e2)); 
		System.out.println(e1.concat("Development")); 
		
		System.out.println("==========================="); 
		
		// 13. indexOf 
		// 14. lastIndexOf 
		
		String f1="mumbai"; 
		System.out.println(f1.indexOf('i')); 
		System.out.println(f1.indexOf('u')); 
		System.out.println(f1.indexOf('m')); 
		System.out.println(f1.lastIndexOf('m')); 
		String f2="success"; 
		System.out.println(f2.lastIndexOf('s', 5));
		String f3="beginning"; 
		System.out.println(f3.indexOf("in")); 
		System.out.println(f3.lastIndexOf("in")); 
		
		System.out.println("==========================="); 
		
		// 15. replace 
		
		String g1="GA"; 
		System.out.println(g1.replace('A', 'N')); 
		System.out.println(g1.replace("GA", "HI")); 
		String g2="INDIA IS MY COUNTRY"; 
		System.out.println(g2.replaceAll(" ", "_")); 
		
		
		
	}

}
