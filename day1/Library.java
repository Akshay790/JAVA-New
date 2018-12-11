package day1;

public class Library {
	
	//data member
	int book_id,price;
	String book_name;
	
	
	public void initLibrary()//method
	{
		
		book_id=101;
		book_name="JAVA";
		price=500;
		
	}
	
	public void printlibrary()//method
	{
		System.out.println("BOOK ID = "+book_id);
		System.out.println("BOOK NAME :"+book_name);
		System.out.println("price :"+price);
		
	}
	

	
	public static void main(String[]args){

		
		Library l1=new Library();//create object
		l1.initLibrary();//call method
		l1.printlibrary();
		
		
		
	}
	

}
