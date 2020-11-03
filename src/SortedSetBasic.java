import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetBasic {

	public static void main(String[] args)
	{
		SortedSet<String>  ss = new TreeSet<String>();
		{
			ss.add("A");
			ss.add("D");
			ss.add("B");
			ss.add("C");
			ss.add("E");
			
			System.out.println(ss);
			System.out.println(ss.first());
			System.out.println(ss.last());
			System.out.println(ss.headSet("B"));
			System.out.println(ss.tailSet("B"));
			System.out.println(ss.subSet("D","E"));
			System.out.println(ss.comparator());
		}

	}

}
