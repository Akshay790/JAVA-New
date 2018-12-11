package RunTimeTypeIdentity;

public class TestRTTI {
	
	public static void main(String [] args)
	{	
		Employee e=new Manager();//up Casting
		System.out.println(e.calculate());
		
		//System.out.println(e.calaincentive());//down casting
		
		Manager m=(Manager) e;//down casting
		System.out.println(m.calaincentive());
		
		
		
		
	}

}
