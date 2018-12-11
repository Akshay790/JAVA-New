package day1;

public class School {

	
	//data member
	
	int no_classroom,div,number_student;
	String name;
	
	
	public void initSchool() //method
	{
		
		name="Y.C.I.S.SATARA";
		no_classroom=50;
		div=20;
		number_student=2000;
		
	}
	
	
	public void printschool()
	{
		System.out.println("NAME OF SCHOOL :"+name);
		System.out.println("NUMBER CLASS :"+no_classroom);
		System.out.println("DIV :"+div);
		System.out.println("NUMBER OF STUDENT :"+number_student);
		
	}
	
	
	
	
	
	
	public static void main(String[]args){
		
	
		School s1 = new School();//create object
		s1.initSchool();
		s1.printschool();
		School s2 = new School();
	
		s2.printschool();
		
	}
	
	
	
}
