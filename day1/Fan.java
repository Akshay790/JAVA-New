package day1;

public class Fan {

	//data member
	int no_blades;
	String  company;
	String colour;

	public void initfan()//method
	{
		no_blades=3;
		company="crompton";
		colour="silver";
	}
	 public void printfan()
	 {
		 System.out.println("nofoblades="+no_blades);
		 System.out.println("company="+company);
		 System.out.println("colour="+colour);
		 
	 }
	 public static void main(String []args)
	 {
		 Fan c1=new Fan();//create object
		 c1.initfan();//call method
		 c1.printfan();
	 }
	
}
