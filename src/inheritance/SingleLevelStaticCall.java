package inheritance;

public class SingleLevelStaticCall {

	public static void main(String[] args) {
		
		SingleLevelStatic sls = new SingleLevelStatic();  //created object of superClass 
		sls.look();  //calling method from superclass using superclass object 
		SingleLevelStatic.nature();  //calling static method from superclass using superclass ref 
		
		SingleLevelStatic_1 sls1= new SingleLevelStatic_1();  //created object of subClass 
		sls1.scooty();  //calling method from subclass using subclass object 
		sls1.look();  //calling method from superclass using subclass object** 
		SingleLevelStatic_1.laptop();  //calling static method from subclass using subclass ref 
		SingleLevelStatic_1.nature();  //calling static method from superclass using subclass ref**

	}

}
