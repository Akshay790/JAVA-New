package Day2;

public class Overloading {
	
	
//	public void add(int a,int b)
//	{
//		System.out.println(a+b);
//		
//	}
	

	public void add(float a,float b)
	{
		System.out.println(a+b);
		
	}
	

	public void add(int a,float b)
	{
		System.out.println(a+b);
		
	}
	
	

	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	
	
	public static void main( String[] args){
		
		
		Overloading o=new Overloading();//create object
		o.add(1,2 ,5 );
		o.add(3, 8);
		o.add(5, 8);
	}
	
	
	
	
	
}
