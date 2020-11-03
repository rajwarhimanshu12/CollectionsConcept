import java.util.TreeSet;

//for non empty treeSet if we add null will get exception
//for empty treeSet if we add null we can but on adding another element we will get exception
//homogenous and comparable
//default sorting using compareto
//if treeset ts =  new treeset(new comparator()) then sorting according to comparator
public class TreesetBasic {

	public static void main(String[] args) {
		
		TreeSet<String>  ts = new TreeSet<String>();
		ts.add("A");
		ts.add("B");
		ts.add("a");
		ts.add("Z");
		ts.add("L");
		//ts.add(null);
		
		
		System.out.println(ts);
		System.out.println("A".compareTo("A"));
		System.out.println("A".compareTo("a"));
		System.out.println("z".compareTo("k"));
		

	}

}
