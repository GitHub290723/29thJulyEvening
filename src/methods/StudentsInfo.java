package methods;

public class StudentsInfo {

	public static void main(String[] args)  
	{
		StudentsInfo si=new StudentsInfo(); // Calling method without parameter
		si.Student_Data();
		System.out.println("=======================================");
		si.Student_Data1("Gaurav", 'M', 71.13f, 80, true);	// Calling method with parameter
		System.out.println("=======================================");
		si.Student_Data1("Mandar", 'M', 71, 79, true);
		System.out.println("=======================================");
		si.Student_Data1("Jayant", 'M', 71.01f, 78, true);
		System.out.println("=======================================");
		si.Student_Data1("Rohini", 'F', 70.01f, 77, true);
		System.out.println("=======================================");
		si.Student_Data1("Neha", 'F', 68.88f, 74, true);

	}
	
	public void Student_Data() // Calling method without parameters
	{
		String name;
		char gender;
		float avg_result;
		int marks;
		boolean result_status;
		
		name="Gaurav";
		gender='M';
		avg_result=71.13f;
		marks=80;
		result_status=true;
		
		System.out.println("Name = "+name);
		System.out.println("Gender = "+gender);
		System.out.println("Result = "+avg_result);
		System.out.println("Marks = "+marks);
		System.out.println("Result Status = "+result_status);		
	}
	     // Calling method with parameter
	
	public void Student_Data1(String name, char gender, float percentage, int marks, boolean status)
	{				
		System.out.println("Name = "+name);
		System.out.println("Gender = "+gender);
		System.out.println("Result = "+percentage+ "%");
		System.out.println("Marks = "+marks);
		System.out.println("Result Status = "+status);
	}

}
