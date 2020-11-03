import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetStringdescSort {
	
	public static void main(String args[]) {
		
		TreeSet<String> ts = new TreeSet<String>(new compare());
		ts.add("Jony");
		ts.add("Butler");
		ts.add("Warner");
		ts.add("Dhawan");
		ts.add("Williamson");
		
	}

}

class compare implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String s1 = (String)obj1;
		String s2 = (String)obj2;
		
		return s1.compareTo(s2);
	}
}