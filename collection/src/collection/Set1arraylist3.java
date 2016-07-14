
package collection;
// properties or functions of arraylist
import java.util.ArrayList;
import java.util.List;

public class Set1arraylist3 {

	public static void main(String[] args) {
		List<Integer> mylist=new ArrayList<Integer>();
        mylist.add(5);
        mylist.add(6);
        mylist.add(7);
        mylist.add(8);
        mylist.add(9);
        
        for(Integer x:mylist){
        	System.out.println(x);
        }
        System.out.println("size="+mylist.size());
//---------------------------------------------------------------
        mylist.remove(2);
        for(Integer x:mylist){
        	System.out.println(x);
        }
        System.out.println("size="+mylist.size());
//----------------------------------------------------------------
        mylist.set(2,100);
        for(Integer x:mylist){
        	System.out.println(x);
        }
        System.out.println("size="+mylist.size());
        
        
        
 //------------------------------------------------------------
        mylist.clear();
        for(Integer x:mylist){
        	System.out.println(x);
        }
        for(Integer x:mylist){
        	System.out.println(x);
        }
        System.out.println("size="+mylist.size());
        //------------------------------------------------------------       
  /*  Iterator itr= mylist.iterator();
    while(itr.hasNext()){
    	Integer value=(Integer)itr.next();
      System.out.println(value);*/
        //-----------------------------------------------
    }
	}


