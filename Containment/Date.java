package Containment;

public class Date {
	
	
	int DD,MM,YY;
	
	 public Date()
	 {
		 DD=01;
		 MM=12;
		 YY=2018;
		 
	 }
	 
	 public Date(int d,int m,int y)
	 {
		 DD=d;
		 MM=m;
		 YY=y;
	 }
	 
	 public String toString()
	 {
		 return DD+" / "+MM+" / "+YY;
	 }

}
