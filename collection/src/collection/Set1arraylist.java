package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Set1arraylist {

	public static void main(String[] args) {
		ArrayList mylist=new ArrayList();
        mylist.add(5);
        mylist.add(6);
    mylist.add(new String("mango"));   
    Iterator itr= mylist.iterator();
    while(itr.hasNext()){
    	Integer value=(Integer)itr.next();
    	System.out.println(value);
    }
	}

}
