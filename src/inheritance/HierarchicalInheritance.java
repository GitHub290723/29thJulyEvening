package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) {
		
		HierarchicalFather f= new HierarchicalFather(); 
		f.hardWork();  //super class object calling super class method 
		
		HierarchicalSon1 s1= new HierarchicalSon1(); 
		s1.Thar();  //sub class object calling sub class method 
		s1.hardWork();  //sub class object calling super class method** 
		
		HierarchicalSon2 s2= new HierarchicalSon2(); 
		s2.Bullet();  //sub class object calling sub class method 
		s2.hardWork();//sub class object calling super class method**

	}

}
