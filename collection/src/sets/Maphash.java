package sets;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Maphash {

	public static void main(String[] args) {
		/*
		 * hash map and hash table have same implementation but hashtable is synchronized 
		 * whereas hashmap is not synchronized.hashtable is used when mulithreads are there
		 * hashmap is used in case of one thread
		 */
		Map<String,String> map=new HashMap<String,String>();
		map.put("employee id","100");
		map.put("employee name", "vishant");
		System.out.println(map);
		Set<String>	keyset1=map.keySet();
		Iterator<String> itr1 =keyset1.iterator();
		while(itr1.hasNext()){
			String key1=(String) itr1.next();
			System.out.println("Key="+key1);
			System.out.println("value="+map.get(key1));
		}
//--------------------------------------------------------------------------
		map.put("employee id","101");
		map.put("employee name", "Yashasvi");
		System.out.println(map);
	Set<String>	keyset=map.keySet();
	Iterator<String> itr =keyset.iterator();
	while(itr.hasNext()){
		String key=(String) itr.next();
		System.out.println("Key="+key);
		System.out.println("value="+map.get(key));
	}
		
			
	}

}
