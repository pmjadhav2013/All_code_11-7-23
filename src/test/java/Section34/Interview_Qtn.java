package Section34;

import java.util.ArrayList;

public class Interview_Qtn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// count the number from a number list
		int num[] = {3,4,6,7,3,4,6,4,3,3,5,5};
//		for(int i=0; i<=num.length-1; i++)
//		{
//		System.out.println(num[i]);
//		}
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0; i<=num.length; i++)
		{
			int k=0;
		 if(!al.contains(num[i]))
		 {
			al.add(num[i]);
			k++;
			
			for(int j=i+1; j<num.length;j++)
			{
				if(num[i]==num[j])
				{
					k++;
				}
			}
			System.out.println(num[i]);
			 System.out.println(k);
		 }
		 
		}
		
	}

}
