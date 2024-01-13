package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		
		MultiGrandMother gm= new MultiGrandMother(); 
		gm.receipe();  //calling non static method from superMost class using object of superMost class 
		
		MultiGrandMother.keys();  //calling static method from superMost class using ref of superMost class 
		
		MultiMother m= new MultiMother(); 
		m.look();  //calling non static method from super class using object of super class 
		m.receipe();  //calling non static method from superMost class using object of super class 
		
		MultiMother.nature();  //calling static method from super class using ref of super class 
		MultiMother.keys();  //calling static method from superMost class using ref of super class** 
		
		MultiDaughter d= new MultiDaughter();  
		d.scooty();  //calling non static method from sub class using object of sub class 
		d.look();  //calling non static method from super class using object of sub class** 
		d.receipe();  //calling non static method from superMost class using object of sub class*** 
		
		MultiDaughter.laptop();  //calling static method from sub class using ref of sub class 
		MultiDaughter.nature();  //calling static method from super class using ref of sub class** 
		MultiDaughter.keys();  //calling static method from superMost class using ref of sub class
	}

}
