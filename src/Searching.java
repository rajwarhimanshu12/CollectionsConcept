import java.util.ArrayList;
import java.util.Collections;

//public static int  binarysearch((list l,object target)  index is returned               ----------------for default sorting order
//public static int  binarysearch(list l,object target,comparator c)  index is returned  -----------------for customized sorting

public class Searching {

	public static void main(String[] args) {
		
		ArrayList<String> al = new ArrayList<String>();
			al.add("Z");
			al.add("A");
			al.add("M");
			al.add("K");
			al.add("a");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		System.out.println(Collections.binarySearch(al, "Z")); //Returning index 0-1-2-3-4-5
		System.out.println(Collections.binarySearch(al, "X")); //not found so returing insertion indesx -1-2-3-4-5
		
	}
}
	
	