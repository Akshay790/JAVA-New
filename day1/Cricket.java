package day1;

public class Cricket {
	
	//data member
	String player,team; 
	
	int num,run;
	
	public void initplayer()//method
	{
		num=7;
		run=183;
		player="M.S.DHONI";
		team ="INDIA";
		team="CSK";
	}
	
	public void printPlayer()
	{
		
		System.out.println("PLAYER NAME:"+player);
		System.out.println("JOURASY NUMBER :"+num);
		System.out.println("BEST RUN:"+run);
		System.out.println( "TEAM :"+team);
	}
	
	
	public static void main(String[]args){
	
		
		Cricket c1=new Cricket();//object create
		c1.initplayer();
		c1.printPlayer();//call method
		
	}
	
	
	

}
