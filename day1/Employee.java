package day1;

public class Employee {
	
	
	//data member
	int emp_id,salary;
	String name,city;
	
	
	public void initEmployee()//method
	{
		emp_id=1;
		name="AKSHAY";
		salary=20000;
		city="SATARA";
		
	}
	
	public void printEmployee()
	{
		
		System.out.println("EMP_ID :"+emp_id);
		System.out.println("NAME :"+name);
		System.out.println("Salary :"+salary);
		System.out.println("CITY :"+city);
	}
	
	
	public static void main(String[]args){
		
		
		Employee e1=new Employee();//object create
		e1.initEmployee();//call method
		e1.printEmployee();
		
	}
	

}
