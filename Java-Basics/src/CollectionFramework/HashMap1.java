package CollectionFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer>  data = new HashMap<>();
		
		data.put("Radha", 12345);
		data.put("Sita",  23456);
		data.put("Rama",  98765);
		data.put("Lakshman", 53467);
		
		 
		for ( Map.Entry<String, Integer>  entrydata : data.entrySet()){
			
			System.out.println(entrydata.getKey() +"  " + entrydata.getValue()) ;
			
		}
		
	}

} 