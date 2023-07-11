package Section34;

public class keyword_Super {

	int a =20;

public void testing()
		{
		int a = 10;
		System.out.println(a);
		System.out.println(this.a);
		}

public static void main(String[] args) 
{
	
	keyword_Super tt= new keyword_Super();
		tt.testing();
}
}