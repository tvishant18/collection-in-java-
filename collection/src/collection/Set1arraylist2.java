package collection;
// type safety in arraylist;
import java.util.ArrayList;
import java.util.Iterator;

public class Set1arraylist2 {

	public static void main(String[] args) {
/*	ArrayList<Integer> mylist=new ArrayList<Integer>();
        mylist.add(5);
        mylist.add(6);
    //mylist.add(new String("mango"));  
        mylist.add(7);
        mylist.add(8);
        System.out.println(mylist);
      Iterator<Integer> itr= mylist.iterator();
    while(itr.hasNext())
    	System.out.println(itr.next());
  */
		ArrayList<Integer> mylist=new ArrayList<Integer>();
		for(int i=0;i<=31;i++){
			mylist.add(i);
		}
//		day_combo.setModel(new javax.swing.DefaultComboBoxModel(mylist));
	    System.out.println(mylist);
	
	}

}
