import java.util.HashSet;

public class HashSetBasic {

	public static void main(String[] args) {
		 
		HashSet<String> hs = new HashSet<String>();
		System.out.println(hs.add("A"));
		System.out.println(hs.add("B"));
		System.out.println(hs.add("A"));
		System.out.println(hs.add(""));
		System.out.println(hs.add("10"));
		System.out.println(hs);

	}

}
