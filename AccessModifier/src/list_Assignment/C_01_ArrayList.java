package list_Assignment;

import java.util.ArrayList;
import java.util.Iterator;

public class C_01_ArrayList {

	public static void main(String[] args) {
		
		
		ArrayList<String> list=new ArrayList<String>(); 
		  list.add("Mango"); 
		  list.add("Apple");    
		  list.add("Banana");    
		  list.add("Grapes");    
		 
		  Iterator itr=list.iterator();  
		  while(itr.hasNext()){
		   System.out.println(itr.next());
	}

}
}
