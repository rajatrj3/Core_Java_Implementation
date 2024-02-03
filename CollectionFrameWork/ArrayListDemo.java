package CollectionFrameWork;
import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		
		ArrayList<Integer>arr=new ArrayList<Integer>();
		
		
		//inserting Element//
		
		arr.add(50);
		arr.add(100);
		arr.add(150);
		arr.add(200);
		arr.add(250);
		System.out.println(arr);
		
		
		//setting element at specific index
		arr.set(0, 0);
		System.out.println(arr);
		
		
		//removing element at index
		arr.remove(4);
		System.out.println(arr);
		
		//size of array
		System.out.println(arr.size());
		
		//adding element at index
		arr.add(3, 250);
		System.out.println(arr);
		
		//Reversing element
         Collections.reverse(arr);
         System.out.println(arr);
         
         //getting element at specific index
         System.out.println(arr.get(4));
         
         //iterating array using iterator
         //while loop
         
         Iterator<Integer> it=arr.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		 //iterating array using for each
        for (Integer integer : arr) {
        	System.out.println(integer);
			
		}
        
        //iterating using for loop
        for (int i = 0; i < arr.size(); i++) {
        	System.out.println(arr.get(i));
			
		}
		
		
	}

}
