package Section34;

public class Loops_pyramid {

	public static void main(String[] args) {
					
		for (int a=1; a<=5; a++)
		{
			for (int b=1; b<=a;b++)
			{
				System.out.print(b);
			}
			System.out.println(" ");
		}
		
		System.out.println("reverse pyramid");
		
		for (int c=5; c>=1; c--)
		{
			for (int d=1; d<=c;d++)
			{
				System.out.print(d);
			}
			System.out.println(" ");
		}
		
		System.out.println("descending order");
		
		for (int c=1; c<=5; c++)
		{
			for (int d=5; d>=c;d--)
			{
				System.out.print(d);
			}
			System.out.println(" ");
		}
		
System.out.println("descending order reverse");
		
		for (int c=5; c>=1; c--)
		{
			for (int d=1; d<=c;d++)
			{
				System.out.print(d);
			}
			System.out.println(" ");
		}
		
System.out.println("other way");
		 
		for (int c=5; c>=1; c--)
		{
			for (int d=1; d<=5-c;d++)
			{
				System.out.print(d);
			}
			System.out.println(" ");
		}
	}
}
