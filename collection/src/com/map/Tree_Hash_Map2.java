package com.map;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Tree_Hash_Map2 {

	public static void main(String[] args) {
/*
 * TreeHashMap is used to get keys from the map in the form of sorted order  
 */
		
		Map<Integer,String> map1=new TreeMap<>();
		map1.put(107, "Vish");
		map1.put(105, "Yash");
		map1.put(108, "Ritu");
		map1.put(106,"Kajol");
		
		Set<Map.Entry<Integer, String>> value=map1.entrySet();
		/*
		 * map is an interface and entry is also an interface within map interface
		 */
		for(Map.Entry<Integer, String> e:value){
		System.out.println("key="+e.getKey()+"value="+e.getValue());
		}
	}

}
