package Extends_Array_Study;

public class arrayStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc[][] = {{2,4,5},{13,1,7},{1,10,9}};
		// 11	2	8
		// 3	9	32
		// 6	4	8
		for(int a=0;a<=2;a++)
		{
			for(int b=0;b<=2;b++)
			{
				System.out.print(abc[a][b]+"	");
			}
			System.out.println(" ");
		}
		int min=abc[0][0];
		//int j=0;
		int minCol=0;
		int max=abc[0][minCol];
		for (int i=0; i<3;i++)
		{
			for(int j=0; j<3; j++)
			{
				if(abc[i][j] < min)
				{
				min = abc[i][j];
				minCol = j;
				}				
					
			}
			
			int k=0;
			while(k<3)
			{
				if(abc[k][minCol]>max)
				{
					max=abc[k][minCol];
					
				}
				k++;
			}
		
		
	    System.out.println(" ");
		}
		
		
		System.out.println("min no is:" +min);
		System.out.println("max no is:" +max);
	}

}

