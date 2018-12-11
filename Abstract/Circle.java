package Abstract;

public class Circle extends Shape  {
	
	double  pi,redius;
	
	
	public Circle()
	{
		
		redius=7;
		pi=3.14;
		
	}
	
	public double Area()
	{
		return redius*pi;
	}
	
	

}
