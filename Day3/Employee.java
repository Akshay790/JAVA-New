package Day3;

public class Employee {
	
	
	//data member
	int emp_id,salary;
	String name,city;
	 static int count; //class variable

	
	
	public Employee()//method
	{
		emp_id=1;
		name="AKSHAY";
		salary=20000;
		city="SATARA";
		count++;
	}
	
	public Employee(int emp_id,int salary,String name,String city)
	{
		
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
		this.city=city;
		count++;
		
	}
	
	public String toString()
	{
		
		return "ID :" +emp_id + "NAME : " +name + "SALARY :" +salary+ "CITY:" +city;
	}
	
	public static int printCount()
	{
			
		return count;
		
	}
	
//	
//	public static void main(String[]args){
//		
//		
//		Employee.printCount();
//		System.out.println("BEFORE :"+count);
//		Employee e1=new Employee();//object create
//		System.out.println(e1);
//		 Employee.printCount();
//		 System.out.println("AFTER :"+count);
//		 
//	}
//	

}
