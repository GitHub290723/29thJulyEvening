package inheritance;

public class SingleLevelOutput {

	public static void main(String[] args) {
		
		SingleLevel sl = new SingleLevel(); //created object of superClass 
		sl.look();  //calling method from superclass using superclass object 
		
		SingleLevel_1 sl1= new SingleLevel_1();  //created object of subClass 
		sl1.scooty();  //calling method from subclass using subclass object 
		sl1.look();  //calling method from superclass using subclass object
	}

}
