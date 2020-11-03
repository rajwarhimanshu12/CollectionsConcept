import java.util.ArrayList;
import java.util.ListIterator;

//Bidirectional cursor ,can move to forward as well as backward direction
//also can add (insertion) while traversing
//Child interface of iterator

public class ListIteratorBasic {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		for(int i=0;i<10;i++) {
			al.add(i);
		}
	    ListIterator li = al.listIterator();
	    while(li.hasNext()) {
	    	
	    	String s = (String)li.next();
	    }
		
		
	}

}
