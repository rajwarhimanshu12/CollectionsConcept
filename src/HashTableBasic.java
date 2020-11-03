import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableBasic {

	public static void main(String[] args) {
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();
		hm.put(101,"David");
		hm.put(102,"Rahul");
		hm.put(101,"Bhaji");
		hm.put(103,"Shaw");

		
		System.out.println(hm);
		
		Set s = hm.keySet();
		System.out.println(s);
		
		Set s1 = hm.entrySet();
		System.out.println(s1);
		
		Collection c = hm.values();
		System.out.println(c);
		
		Iterator itr = s1.iterator();
		while(itr.hasNext())
		{
			Map.Entry m = (Map.Entry)itr.next();
			
			
			if (m.getKey().equals(102)) {
				m.setValue("Rahul Dravid");
				
			}
			System.out.println(m);
		}
		
	}

	}

