package CaseStudy5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Case_Study5_ArrayList_10 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> lst=new ArrayList<Integer>();
		
		lst.add(10);
		lst.add(15);
		lst.add(2);
		lst.add(5);
		lst.add(8);
		lst.add(12);
		lst.add(18);
		lst.add(53);
		lst.add(25);
		lst.add(55);
		
		System.out.println("List Size : "+lst.size());
		
		Iterator itr= lst.iterator();
		
		while (itr.hasNext()) {
			 
           
            System.out.println(itr.next());
        }
		
		

	}

}
