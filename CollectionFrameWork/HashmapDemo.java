package CollectionFrameWork;

import java.util.*;

public class HashmapDemo {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		
		
		//Inserting the values in Key Value pair format////
		
		map.put("India", 120);
		map.put("China", 130);
		map.put("US", 89);
		map.put("Japan", 50);
		System.out.println(map);
		
		
	       ///searching key(LOOK UP)////
		
		if(map.containsKey("UAE")){
	                  System.out.println("Key is present");
	                  
	                  
	          }else {
	        	  System.out.println("Key not present");
	          }
		
		/////////////////////////Getting////////////////
		System.out.println(map.get("Japan"));
		
		
		////////////////////ITERATING MAP////////////////
		
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
			
		}
		////////////////////////////////////Iterating Keys///////////
		Set<String>keys=map.keySet();
		for(String key :keys) {
			System.out.print(" "+key+""+map.get(key));
		}
		
	       ///////////////////REMOVING PAIR////////////
		
		map.remove("china");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		
		
		

}}
