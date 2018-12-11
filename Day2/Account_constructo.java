package Day2;

public class Account_constructo {
	
	 int accno;
	String Name;
	double balance;
	
	public  Account_constructo()
	{
		
		accno=501;
		Name="AKSHAy";
		balance=7001;
		
	}
	
	public void  Account_constructo(int a,String s,double d)
	{
		
		accno=a;
		Name=s;
		balance=d;
		
		
	}
	
	public void printAccount_constructo()
	{
		System.out.println("D: "+accno+" "+Name+"  "+balance);
	}
	
	
	public static void main(String[] args)
	{
		
		Account_constructo a =new Account_constructo();
		a.printAccount_constructo();
		Account_constructo a2 =new Account_constructo();
		a2. printAccount_constructo();
		
	}
	

}
