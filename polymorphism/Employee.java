package polymorphism;

public class Employee {

	int empid;
	String name;
	
	public Employee()
	{
		
		empid=1021;
		name="Sudhir";	
	}
	
//	public void Show()
//	{
//		System.out.println("EMPID :"+empid+ "NAME :"+name);
//	}
//	

	public String toString()
	{
		return "EMPID :"+empid+" NAME : "+name;
	}
}
