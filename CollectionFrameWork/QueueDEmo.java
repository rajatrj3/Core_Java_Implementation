package CollectionFrameWork;

import java.util.*;

public class QueueDEmo {

	public static void main(String[] args) {
		
		Queue<Integer>queue=new LinkedList();
		
		queue.offer(15); //<----------------First in First Out
		queue.offer(20);
		queue.offer(25);
		queue.offer(30);
		queue.offer(35);
		
		
		
		System.out.println(queue.poll());
		
		System.out.println(queue);
		
		System.out.println(queue.peek());


		
		
		

	}

}
