import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Searchingcustomizedsorted {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Z");
		al.add("A");
		al.add("M");
		al.add("K");
		al.add("a");
	System.out.println(al);
	Collections.sort(al,new mycompare());
	System.out.println(al);
	System.out.println(Collections.binarySearch(al, "Z", new mycompare())); //Returning index 0-1-2-3-4-5
	System.out.println(Collections.binarySearch(al, "X",new mycompare())); //not found so returing insertion indesx -1-2-3-4-5

	}
}

class mycompare implements Comparator {
			public int compare(Object ob1,Object ob2) {
			String s1 = (String)ob1;
			String s2 = (String)ob2;
			return s1.compareTo(s2);
		}

	}


