package RunTimeTypeIdentity;

public class Manager extends Employee {
	
	int incentive;
	
	public Manager()
	{
		super();
		incentive=4520;
	}
	
	public double calaculate()//overriding
	{
		
		return salary;
		
	}
	
	public double calaincentive()
	{
		return salary+incentive;
		
	}

}
