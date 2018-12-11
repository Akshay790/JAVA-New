package Inheritance;

public class Batsman extends Cricket {
	
	int trun,brun;
	
	public Batsman()
	{
		trun=10201;
		brun=183;
	}
	
	public Batsman(int id,String n,String c,int b,String ba,String bo,int tr,int br)
	{
		super(id,n,c,b,ba,bo);
		trun=tr;
		brun=br;
	}
	
	public String toString()
	
	{
		return super.toString()+"    "+trun+"   "+brun;
		
	}
	

}
