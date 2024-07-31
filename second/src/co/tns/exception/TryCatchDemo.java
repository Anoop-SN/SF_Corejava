package co.tns.exception;

public class TryCatchDemo {

	public static void main(String[] args) {
		int a =10,b=0,c=0;
		try{
			c=a/b;
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Catch Block");
			
		}
		System.out.println(c);
		
		

	}

}
