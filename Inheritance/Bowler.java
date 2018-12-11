package Inheritance;

public class Bowler extends Cricket {
	
	int wi;
	int bwi;
	
	public Bowler()
	{
		wi=10;
		bwi=13/3;
		
	}
	
	public Bowler(int id1,String n1,String c1,int b1,String ba1,String bo1,int w,int wi)
	{
		super(id1,n1,c1,b1,ba1,bo1);
		wi=w;
		bwi=wi;
	
	}
	
	public String toString()
	{
		return super.toString()+"    "+wi+"      "+bwi;
		
	}

}
