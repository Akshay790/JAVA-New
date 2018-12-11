package day1;

public class Student {
	
	// data member
	int rollno;
	String name;
	
	
	//method
	
	public void initStudent()
	{
		
		rollno=1;
		name="AKSHAY";
		
		
	}
	
	public void printStudent() //method
	{
		System.out.println("ROLL NUMBER :"+rollno);
		System.out.println("NAME IS "+name);
		
	}
	

	
	public static void main(String[]args){
	
		Student s1=new Student();//create object
		s1.initStudent();//call method
		s1.printStudent();//call method
		
	}

}
