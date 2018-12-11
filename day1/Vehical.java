package day1;

public class Vehical {
	
	//data member
	String company;
	 String name;
	 int average;
	 
	 public void initvehical()//method
	 {
		company="honda";
		name="livo";
		average=60;
		
	 }
	 public void printvehical()
	 {
		 System.out.println("company="+company);
		 System.out.println("name="+name);
		 System.out.println("average="+average);
		 
	 }
	 public static void main(String []args)
	 {
		 Vehical v1= new Vehical();//create object
		 v1.initvehical();//call method
		 v1.printvehical();
		 
		 
	 }

}
