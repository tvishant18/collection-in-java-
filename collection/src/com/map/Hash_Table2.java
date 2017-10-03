package com.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class Hash_Table2 {

	public static void main(String[] args) {
		/*
		 *Hashtable is introduced in java 1.0(legacy version)
		 */
		Map<Integer,String> map=new Hashtable<>();
		map.put(101, "Vishant");
		map.put(102, "YAshasvi");
		map.put(104, "Ritu");
		map.put(103,"Kajol");
		
		Set<Map.Entry<Integer, String>> value=map.entrySet();
		/*
		 * map is an interface and entry is also an interface within map interface
		 */
		for(Map.Entry<Integer, String> e:value){
		System.out.println("key="+e.getKey()+"value="+e.getValue());
		}
	}

}
