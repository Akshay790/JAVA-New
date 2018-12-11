package Day2;

public class Moblie_acc_muta {
	
	int EMIno,Worrenty;
	String mobile_name; 
	
	public String getMobile_name( )//get method=show name
									//return must be write
	{
		mobile_name="Apple 7+";
		return mobile_name;
	}
	
	public void setWorrenty(int a)
	{
		Worrenty=1;
		System.out.println("OLD WORRENTY :"+Worrenty);
		
		Worrenty=a;
		System.out.println("NEW WORRENTY :"+ a);
		
		
	}
	
	public static void main(String[] args){
		
		 Moblie_acc_muta m=new  Moblie_acc_muta();
		 String s=m.getMobile_name();
		 System.out.println("MOBLIE NAME IS :"+s);
		 m.setWorrenty(2);
		
	}

}
