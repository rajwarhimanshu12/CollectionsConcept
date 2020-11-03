import java.util.Comparator;
import java.util.TreeSet;


public class nondefaultsortedTreeSet {

	public static void main(String[] args) {
		
		
		TreeSet<Integer> ts = new TreeSet<Integer>(new Mycomparator());
		ts.add(10);
		ts.add(2);
		ts.add(6);
		ts.add(1);
		ts.add(23);
		ts.add(99);
		
		System.out.println(ts);
	}	
}
		class Mycomparator implements Comparator{
			
			public int compare(Object obj1,Object obj2)
			{
				Integer i1 = (Integer)obj1;
				Integer i2 = (Integer)obj2;
				if (i1<i2) {
					return 1;
				}
				else if(i1>i2){
					return -1;
				}
				else
					return 0;
				
			}
			
		}

	


