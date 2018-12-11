package polymorphism;

public class SavingAccount extends Account{
	
	double balance;
	
	public SavingAccount()
	{
		super();
		balance=12484;
	
	}
	
	public SavingAccount(int i,String s,double d)
	{
		super(i,s);
		balance=d;
		
	}
	
	public String toString()
	{
		return super.toString()+" SAVING BALANCE :"+balance;
	}

}
