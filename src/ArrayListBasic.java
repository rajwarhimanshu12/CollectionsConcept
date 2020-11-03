import java.util.*;
import java.io.*;

public class ArrayListBasic {

	public static void main(String[] args) {
		
		int n = 5;
		ArrayList<String> al = new ArrayList<String>(n);
        al.add("Himanshu");
        al.add("1");
        al.set(1,"Rajwar");
        al.add(null);
        al.add("10");
        al.add(4,"23");
        
        for(int i = 0; i <al.size();i++)
        	System.out.println("Arraylist is "+ al.get(i));
	
	
	Iterator itr = al.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	   
	}
}





