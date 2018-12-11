package Day2;

public class Accessor {

	
	//data member
	int empid;
	String name,Add,email;
	double balance;
	
	public String getEmail()//get method=Show
	
	{
		email="abc@xyz.com";
		return email;
	}
	
	public void setEmail(String e)//Set method=MODIFy
	{
		email=e;
		System.out.println(e);
	}
	
	public static void main (String[] args)
	{
		Accessor a=new Accessor();//object create
		String e=a.getEmail();
		System.out.println("ODD MAIL :"+e);//show
		a.setEmail("akshaydesai@gmail.com");//modify//set
	}
	
	
}
