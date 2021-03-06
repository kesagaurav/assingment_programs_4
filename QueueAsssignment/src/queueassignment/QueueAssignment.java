package queueassignment;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Queue<String> pq = new PriorityQueue<>(); 
		  //add 
	        pq.add("Geeks"); 
	        pq.add("For"); 
	        pq.add("Geeks"); 
	        System.out.println("Initial Queue " + pq); 
	        //remove
	        pq.remove("Geeks"); 
	  
	        System.out.println("After Remove " + pq); 
	  
	        System.out.println("Poll Method " + pq.poll()); 
	  
	        System.out.println("Final Queue " + pq); 
	       
	}

}
