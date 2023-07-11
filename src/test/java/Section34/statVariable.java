package Section34;

public class statVariable {

	String name;
	String address;
	String city;
	
	statVariable(String name, String address,String city)
	{
		this.name = name;
		this.address = address;
		this.city = city;		
	}
	
	public void getname()
	{
		System.out.println(name);
	}
	public void getaddress()
	{
		System.out.println(address);
	}
	public void getcity()
	{
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		
		statVariable obj = new statVariable("prashant", "ichalkaranji","kolhapur") ;
				
		statVariable obj1 = new statVariable("arati", "chiplun","ratnagiri") ;
		obj.getaddress();
		obj1.getaddress();
	}

}
