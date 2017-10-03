package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hash_map {

	public static void main(String[] args) {
		/*
		 * map is an interface which is implemented by HashMap,LinkedHashMap,HashTable,Treemap
		 * put method is used to insert elements to map and get() method is used to retrieve elements from map
		 */
		Map<Integer,String> map=new HashMap<>();
		map.put(101, "Vishant");
		map.put(102, "YAshasvi");
		map.put(104, "Ritu");
		map.put(103,"Kajol");
		/*
		 * method to reterieve keyset from  map
		 */
		Set<Integer> key=map.keySet();
		for(Integer i:key)
		  {
			System.out.println("key="+i+"value="+map.get(i));
		  }
		/*
		 * method to reterieve key+values from map
		 */
		Map<Integer,String> map1=new HashMap<>();
		map1.put(105, "Vish");
		map1.put(106, "Yash");
		map1.put(108, "Ritu");
		map1.put(107,"Kajol");
		
		Set<Map.Entry<Integer, String>> value=map1.entrySet();
		/*
		 * map is an interface and entry is also an interface within map interface
		 */
		for(Map.Entry<Integer, String> e:value)
		{
		System.out.println("key="+e.getKey()+"value="+e.getValue());
		}
      }
    }
