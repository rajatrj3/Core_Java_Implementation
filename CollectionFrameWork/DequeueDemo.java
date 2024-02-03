package CollectionFrameWork;

import java.util.ArrayDeque;

public class DequeueDemo {

	public static void main(String[] args) {
		
		
		ArrayDeque<Integer>adq=new ArrayDeque<Integer>();
		
		
		
		adq.offer(10);
		adq.offer(25);
		adq.offerLast(55);
		adq.offerFirst(15);
		
		
		System.out.println(adq);
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		System.out.println(adq.peek());
		
		System.out.println(adq.pollFirst());
		
		System.out.println(adq);
		
		
		System.out.println(adq.pollLast());
		System.out.println(adq);
		
		System.out.println(adq.poll());
		
		
		
		
		
		

	}

}
