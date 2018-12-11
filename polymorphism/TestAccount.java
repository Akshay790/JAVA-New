package polymorphism;

public class TestAccount {
	
	public static void main(String[] args)
	{
		SavingAccount s=new SavingAccount();
		System.out.println(s.toString());
		
		SavingAccount s1=new SavingAccount(15214,"Sudhir",454654);
		System.out.println(s1.toString());
		
		
		FixedDeposite f=new FixedDeposite();
		System.out.println(f.toString());
		
		FixedDeposite f1=new FixedDeposite(10001,"OM",78787,4);
		System.out.println(f1.toString());
		
		
	}

}
