package polymorphism;

public class Overriding extends Employee {
	
	String projectnm;
	
	public Overriding()
	{
		super();
		projectnm="TESTING";
	
	}
	
//	public void Show()
//	{
//		
//		super.Show();
//		System.out.println("PROJECT NAME :"+projectnm);
//		
//	}

	public String toString()
	{
		return super.toString()+" PROJECT NAME :  "+projectnm;
	}
	
}
