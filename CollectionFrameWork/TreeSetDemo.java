package CollectionFrameWork;
import java.util.*;

public class TreeSetDemo {

	public static void main(String[] args) {
		
      TreeSet<Integer>set=new TreeSet<Integer>();
		
		
		
		//inserting elements
		
		
		set.add(1);
		set.add(10);
		set.add(3);
		set.add(15);
		set.add(5);
		set.add(25);
		set.add(2);
		set.add(2);
		
		System.out.println(set);
		
		
		
		//Searching elements
		
		if(set.contains(3)) {
			System.out.println("Set contains value");
		}
		else {
			System.out.println("not present in set");
		}
		
		
		
		////OR//////////
		if(!set.contains(5)) {
			System.out.println("value not present in set");
		}else {
			System.out.println("present");
		}
		
		/////////////////////delete////
		
		set.remove(5);
		System.out.println(set);
		
		//////////Size////
		System.out.println(set.size());
		
		
		//Iterating set//
		
		Iterator it =set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		

		

	}

}
