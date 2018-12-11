package Day2;

public class Array {
	
	
	public static void main(String[] args){
		
		int []c={10,20,30};
		int sum=0;
		
		for(int x:c)
		{
			System.out.println(x);
			sum=sum+x;
		}
		
		 float avg1=(float)sum/c.length;
		 System.out.println("AVG"+avg1);
		
		
	}

}
