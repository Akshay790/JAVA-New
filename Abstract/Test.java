package Abstract;

public class Test {
	
	public static void main(String[] args)
	{
		Shape s=new Circle();
		System.out.println("AREA CIRCLE :"+s.Area());
		
		Shape s1=new Rectangle();
		System.out.println("AREA RECTANGLE :"+s1.Area());
		
		Circle c=new Circle();
		System.out.println("C"+c.Area());
	}

}
