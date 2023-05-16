package list_Assignment;

import java.util.LinkedList;

public class C_02_LinkedList {

	public static void main(String[] args) {
		 LinkedList<Integer> queue = new LinkedList<Integer>();
		 
	      
	 
	        queue.offer(10);
	 
	        queue.offer(20);
	 
	        queue.offer(30);
	 
	        queue.offer(40);
	 
	 
	        System.out.println(queue);     
	       
	        System.out.println(queue.poll());    
	        System.out.println(queue.poll());   
	}

}
