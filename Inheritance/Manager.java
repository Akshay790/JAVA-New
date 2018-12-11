package Inheritance;

public class Manager extends Employee {
	
	int insentive;
	String company;
	
	public Manager()
	{
		insentive=2510;
		company="OLA";
		
	}
	
	public double Calculate()
	{
		return salary+insentive;
	}
	
	public Manager(int e,String s,double d,int i,String c)
	{
		super(e,s,d);
		insentive=i;
		company=c;
		
	}
	
	public String toString()
	{
		return super.toString()+"  "+insentive+"  "+company;
	}
	
}
