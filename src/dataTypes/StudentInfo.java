package dataTypes;

public class StudentInfo {

	public static void main(String[] args) 
	{
		// name, gender, avg_result, marks, pass-fail status
		
		//1.Variable declaration
		
		String name;
		char gender;
		float avg_result;
		int marks;
		boolean result_status;
		
		//2.Variable Initialization
		
		name="Gaurav";
		gender='M';
		avg_result=71.13f;
		marks=80;
		result_status=true;
				
		//3.Usage
		
		System.out.println("=========================================");
		System.out.println("Name "+name);
		System.out.println("Gender "+gender);
		System.out.println("Avg_result "+avg_result);
		System.out.println("Marks "+marks);
		System.out.println("Result_status "+result_status);
		System.out.println("=========================================");
		

	}

}
