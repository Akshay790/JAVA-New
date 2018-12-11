package day1;

public class Doctor {
	
	//data member
	String specility;
	String name;
	String hospital;


	public void initdoctor()//method
	{
		specility="neuro sergion";
		name="SAM";
		hospital="NAVALE hospital pune";
		
	}
	public void printdoctor()
	{
		System.out.println("specility="+specility);
		System.out.println("name="+name);
		System.out.println("hospital="+hospital);

	}

	public static void main(String []args)
	{
		Doctor s1=new Doctor();//create object
		s1.initdoctor();// call method
		s1.printdoctor();
	}
	}


