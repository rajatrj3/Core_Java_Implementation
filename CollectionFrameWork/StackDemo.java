package CollectionFrameWork;

import java.util.*;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<Integer> stack= new Stack<Integer>();
		
		
		stack.push(15);
		stack.push(20);
		stack.push(25);
		stack.push(30);
		stack.push(15);  //<--------------- Last in will be first out
		System.out.println(stack);
		System.out.println(stack.size());
		
		//fetching top  value     LIFO
		 
		System.out.println( stack.peek());
		
		stack.pop();	
		
		System.out.println(stack);
		System.out.println( stack.peek());
		  
		  
		

	}

}
