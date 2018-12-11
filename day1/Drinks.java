package day1;

public class Drinks {

	//data member
	String colour;
	String name;
	String type;

public void initcolddrink()//method
{
	colour="orange";
	name="maza";
	type="soft";
	
}
public void printcolddrink()
{
	System.out.println("colour="+colour);
	System.out.println("name="+name);
	System.out.println("TYPES ="+type);
	
}
public static void main(String []arg)
{
	Drinks cd1=new Drinks();//create object
	cd1.initcolddrink();
	cd1.printcolddrink();
}
	
	
	
}
