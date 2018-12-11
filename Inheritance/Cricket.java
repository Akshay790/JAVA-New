package Inheritance;

public class Cricket extends Player {
	
	int a;
	String batsman,bowler;

	
	public Cricket()
	{
		
		a=50;
		batsman="RIGHT HAND";
		bowler="RIGHT HAND";
	}
	
	public Cricket(int id,String n,String c,int i,String b,String bo)
	{
		super(id,n,c);
		a=i;
		batsman=b;
		bowler=bo;
		
	}
	
	public String toString()
	{
		return super.toString()+"  " +a+"  "+batsman+"    "+bowler;
	}
	
	
}
