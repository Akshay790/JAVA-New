package Day3;

public class Swp {
	
	int DD,MM,YY;
	public Swp()
	{
		
		DD=05;
		MM=12;
		YY=2018;
	}
	
	public Swp(int d,int m,int y)
	{
		DD=d;
		MM=m;
		YY=y;
	}
	
	public static void Swap(Swp []darr)
	{
		
		Swp temp=darr[0];
		darr[0]=darr[1];
		darr[1]=temp;
	
		
	}
	
	
	public static void main(String[] args)
	{
		
		Swp []dt=new Swp[2];
		
		dt[0]=new Swp(10,20,25);
		dt[1]=new Swp(14,12,84);
		
		System.out.println("Before" +dt[0]+"  " +dt[1]);
		
		
		
	}
	
}
