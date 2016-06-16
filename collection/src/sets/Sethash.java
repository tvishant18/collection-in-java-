package sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Sethash {

	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
	        set.add("vishant");
	        set.add("yashasvi");
	        set.add("ritu");
	        set.add("munish");
	        set.add("vishant");
	  for(String x:set)
		   System.out.println(x);
	// second way
	  /* Iterator itr =set.iterator();
	   while(itr.hasNext())
System.out.println(itr.next());*/	   
		
		
		
	}

}
