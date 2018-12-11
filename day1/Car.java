package day1;

public class Car {

		//data object
		String name;
		String  company;
		String colour;
		int speed;

		public void initcar()//method
		{
			name="ritz";
			company="maruti";
			colour="silver";
			speed=180;
		}
		 public void printcar()
		 {
			 System.out.println("name="+name);
			 System.out.println("company="+company);
			 System.out.println("colour="+colour);
			 System.out.println("TOP SPEED:"+speed);
			 
		 }
		 public static void main(String []args)
		 {
			 Car c1=new Car();//create object
			 c1.initcar();
			 c1.printcar();
		 }
		}

	

