package Inheritance;

public class Employee {
	
	int empid;
	String name;
	double salary;
	
	
	public Employee()
	{
		
		empid=1003;
		name="Sam";
		salary=1204;
	}
	
	public Employee(int e,String n,double s)
	{
		empid=e;
		name=n;
		salary=s;
	
	}
	
	public String toString()
	{
		return empid+"  "+name+"    "+salary;
	}

}
