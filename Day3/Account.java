package Day3;

public class Account {
	
	int accno;
	String name;
	double balance;
	
	public Account()
	{
		accno=1011;
		name="AKSHAY";
		balance=21547;
	}
	
	public Account(int accno,String name,double balance)
	{
		this.accno=accno;
		this.name=name;
		this.balance=balance;
		
	}
	
	public String toString()
	{
		return "Details = " +accno+ "   " +name+"  " +balance;
		
	}
	
	public static void main(String[] args)
	{
		
		Account a=new Account();
		System.out.println(a);
		Account a1=new Account(1002,"OMKAR",7845);
		System.out.println(a1);
		
	}

}
