package Containment;

public class Employee {
	
	int empid;
	String name;
	Date doj;
	
	public Employee()
	{
		empid=1001;
		name="Sudhir";
		doj=new Date();//call the Date constructor
		
	}
	
	
	public Employee(int em,String n,Date d)
	{
		empid=em;
		name=n;
		doj=d;
	}
	
	public String toString()
	{
		return empid+"  "+name+"  "+doj;
	}
	

}
