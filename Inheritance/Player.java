package Inheritance;

public class Player {

	String name;
	int Id;
	String city;
	
	public Player()
	{
		Id=7;
		name="M.S.DHONI";
		city="RANCHI";
	
	}
	
	public Player(int i,String n,String c)
	{
		Id=i;
		name=n;
		city=c;
	}
	
	public String toString()
	{
		return Id+"  "+name+"  "+city;
	}
	
}
