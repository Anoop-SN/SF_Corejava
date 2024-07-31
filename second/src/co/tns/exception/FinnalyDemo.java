package co.tns.exception;
public class FinnalyDemo {

	public static void main(String[] args) {
		int a =10,b=2,c=0;
		try{
			c = a/b;
		}catch(Exception e) {
			System.out.println(e);
			System.out.println("Catch Block");

		}
		finally {
			System.out.println("Finally Demo");
		}
		System.out.println(c);



	}

}
