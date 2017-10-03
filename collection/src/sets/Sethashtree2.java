package sets;


import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Sethashtree2 {

	public static void main(String[] args) {
		Set<String> set=new TreeSet<String>();
	        set.add("vishant");
	        set.add("yashasvi");
	        set.add("ritu");
	        set.add("munish");
	        set.add("vishant");
	 //  for(String x:set)
	//	   System.out.println(x);
	// second way
	   Iterator<String> itr =set.iterator();
	   while(itr.hasNext())
System.out.println(itr.next());	   
	}

}
