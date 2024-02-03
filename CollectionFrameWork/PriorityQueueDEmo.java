package CollectionFrameWork;

import java.util.*;

public class PriorityQueueDEmo {

	public static void main(String[] args) {
		
		
		PriorityQueue<Integer>pq=new PriorityQueue<Integer>();//Comparator.reverseOrder()  will give priority to large value
		
		
		
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		pq.offer(10);
		pq.offer(50);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
         System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		

	}

}
