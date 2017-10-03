
package collection;
// properties or functions of arraylist


import java.util.LinkedList;

public class setlinklist1 {

	public static void main(String[] args) {
		// where insertion order is required
		LinkedList<String> mylist=new LinkedList<String>();
        mylist.add("vishant");
        mylist.add("yashasvi");
        mylist.add("ritu");
        mylist.add("munish");
        mylist.add("veeenu");
        for(String x:mylist){
        	System.out.println(x);
        }
        System.out.println("size="+mylist.size());
//---------------------------------------------------------------
        mylist.remove(2);
        for(String x:mylist){
        	System.out.println(x);
        }
        System.out.println("size="+mylist.size());
//----------------------------------------------------------------
        mylist.set(3,"vikram");
        for(String x:mylist){
        	System.out.println(x);
        }
        System.out.println("size="+mylist.size());
 //--------------------------------------------------------- 
        mylist.addFirst("Thakur");
        mylist.addLast("sidhant");
        for(String x:mylist){
        	System.out.println(x);
        }
        System.out.println("size="+mylist.size());
 
        
 //------------------------------------------------------------
        mylist.clear();
        for(String x:mylist){
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


