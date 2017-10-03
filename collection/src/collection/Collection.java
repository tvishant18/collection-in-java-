package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		/*
		 * collection is a concept 
		 * Collection is an Interface
		 * Collections is a class
		 * List , Set are also interfaces that implements Collection interface
		 * Collection doesn't support index whereas list and set supports index
		 * collection without generics gives runtime error instead of compile time error
		 * Arraylist is a class  
		 */
		
		
		List list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(new String("vishant"));
		list.add("thakur");
	// 1,vishant belongs to object[] type
		
		Iterator i=list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	
	
	
	}

}
