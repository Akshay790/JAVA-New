package Inheritance;

public class TestInheritance {
	
	
	public static void main(String[] args){
	
	
	
	
	Manager m1=new Manager();
	System.out.println(m1);
	
	Manager m2=new Manager(1002,"Ram",4220,780,"UBER");
	System.out.println(m2);
	

	System.out.println("UBER :"+m2.Calculate());
	System.out.println("OLA :"+m1.Calculate());
	
	}

}
