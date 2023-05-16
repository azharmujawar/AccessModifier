package set_Assignment;

import java.util.Iterator;
import java.util.TreeSet;

public class C_03_TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 TreeSet<String> set=new TreeSet<String>();  
         set.add("Ravi");  
         set.add("Vijay");  
         set.add("Ajay");  
         System.out.println("Traversing element through Iterator in descending order");  
         Iterator i=set.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.println(i.next());  
         }  

	}

}
