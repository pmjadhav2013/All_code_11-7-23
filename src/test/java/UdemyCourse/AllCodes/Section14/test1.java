package UdemyCourse.AllCodes.Section14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//import org.junit.Test;
import org.testng.Assert;
import org.testng.annotations.Test;

//import org.testng.annotations.Test;

public class test1 
{
	@Test
	public void streamFilter() 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijeet");
		names.add("ramesh");
		names.add("suresh");
		names.add("ram");
		names.add("don");
		long d = Stream.of("ram", "sham", "mukund", "rakesh", "amit").filter(s -> {
			s.startsWith("a");
			return false;
		}).count();
		System.out.println(d);
		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s)); // this will pringt 3 names
		// to print only firt result out of filter
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
		System.out.println("in upper case");
		names.stream().filter(s-> s.startsWith("r")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		// to check element present in list or not using assertion
		boolean flag = names.stream().anyMatch(s->s.equalsIgnoreCase("Ram"));
		Assert.assertTrue(flag);
		System.out.println("assertion is : " + flag);
		//System.out.println("pass");
	}
	
	@Test
	public void streamCollect()
	{
		List<Integer> numbers = Arrays.asList(1,2,2,3,4,5,6,5,4);
		numbers.stream().forEach(s->System.out.println(s));
	}
}
