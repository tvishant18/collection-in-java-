package com.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Linked_Hash_Map {

	public static void main(String[] args) {
/*
 * Linkedhashmap is used when we require the same order as followed during insertion of key+values to map
 */
		
		Map<Integer,String> map1=new LinkedHashMap<>();
		map1.put(105, "Vish");
		map1.put(106, "Yash");
		map1.put(108, "Ritu");
		map1.put(107,"Kajol");
		
		Set<Map.Entry<Integer, String>> value=map1.entrySet();
		/*
		 * map is an interface and entry is also an interface within map interface
		 */
		for(Map.Entry<Integer, String> e:value){
		System.out.println("key="+e.getKey()+"value="+e.getValue());
		}
	}

}
