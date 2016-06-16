package collection;
// type safety in arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class Set1arraylist2 {

	public static void main(String[] args) {
		ArrayList<Integer> mylist=new ArrayList();
        mylist.add(5);
        mylist.add(6);
    //mylist.add(new String("mango"));  
        mylist.add(7);
        mylist.add(8);
        System.out.println(mylist);
    Iterator itr= mylist.iterator();
    while(itr.hasNext())
    	System.out.println(itr.next());
    
	}

}
