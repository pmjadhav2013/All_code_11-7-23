package Section34;

public class loops_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// invertes sequece pyramid pattern using thrird variable
		int k=0;
		for(int i =1; i<5; i++)
		{
			for(int j =1; j<=i; j++)
			{
				k++;
				System.out.print(k +"  " );
				 
			}
			System.out.println(" ");
		}
		
		// for 1to 4 nos
		for(int i =1; i<5; i++)
		{
			for(int j =1; j<=i; j++)
			{
				System.out.print(j +"  " );
				 
			}
			System.out.println(" ");
		}
	}

}
