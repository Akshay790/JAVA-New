package polymorphism;

public class FixedDeposite extends Account {
	
	double amount;
	float duration;

	public FixedDeposite()
	{
		super();
		amount=100000;
		duration=7;
		
	}
	
	public FixedDeposite(int a,String s,double am,float f)
	{
		super(a,s);
		amount=am;
		duration=f;
	}
	
	public String toString()
	{
		return super.toString()+" Amount : "+amount+" DURATION :"+duration;
	}
}
