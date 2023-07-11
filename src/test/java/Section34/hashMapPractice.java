package Section34;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
// Q: create a hash table; and print its details as a key and value separately using iterator
public class hashMapPractice {
public static void main(String[] args) {
	
	HashMap<Integer,String> hp = new HashMap<Integer,String>();
			hp.put(1, "prashant");
			hp.put(2, "arati");
			hp.put(3, "saket");
			
//			System.out.println(hp);
//			System.out.println(hp.remove(1));
//			System.out.println(hp);
//			
//			hp.replace(2, "prashant");
//			System.out.println(hp);
//			System.out.println(hp.get(2));
			
			Set sn = hp.entrySet();
			Iterator it = sn.iterator();
			
			while(it.hasNext())
			{
			System.out.println(it.next());	//if we print in this way we will get the error
//			Map.Entry mp = (Map.Entry) it.next();
//			System.out.println(mp.getKey());
//			System.out.println(mp.getValue());
			}
}
}
