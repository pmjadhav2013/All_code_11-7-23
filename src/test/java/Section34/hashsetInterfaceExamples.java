package Section34;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetInterfaceExamples {

	// hashset, treeset, linkedhashset are implements set interface
	public static void main(String[] args) {
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("prashant");
		hs.add("saket");
		hs.add("arati");
//		System.out.println(hs);
//		hs.remove("arati");
//		System.out.println(hs);
//		System.out.println(hs.size());
//		hs.removeAll(hs);
//		System.out.println(hs.isEmpty());
				
		//-----------------------
		// traverse through hashset
		hs.add("he");
		hs.add("she");
		
		System.out.println(hs);
		Iterator<String> test = hs.iterator();
//		System.out.println(test.next());
//		System.out.println(test.next());
		
		// to print all the elements of hashset
		
		while(test.hasNext())
		{
			System.out.println(test.next());
		}
	}
}
