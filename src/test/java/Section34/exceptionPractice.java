package Section34;

public class exceptionPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 1;

		try 
		{
			int c = a / b;
//			int ab[]=new int[5];
//			System.out.println(ab[6]);
		} 
		
		catch (ArithmeticException et) 
		{
			System.out.println("this is ArithmeticException");
		}
		
//		catch(ArrayIndexOutOfBoundsException ae)
//		{
//			System.out.println("this is ArrayIndexOutOfBoundsException");
//		}
//		
		catch (Exception e) 
		{
			System.out.println("this is exception");
		}
		
		finally // used for delete the cookies when script stops in between
		{
			System.out.println("delete cookies");
		}
	}

}
