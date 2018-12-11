package polymorphism;

public class Account {
	
	int Accno;
	String name;
	
	
	public Account()
	{
		Accno=1511;
		name="AKSHAY";		
	}
	
	public Account(int a,String n)
	{
		Accno=a;
		name=n;
	}
	
	public String toString()
	{
		return "ACCOUNT NUMBER :"+Accno+"NAME :"+name;
	}
	

}
