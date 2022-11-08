package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> names = new HashMap<>();
		names.put("ranjith", 123);
		names.put("ranjith", 143);
		names.put("hello", 144);
		names.put("hii", 144);
		for(Map.Entry<String, Integer> entry : names.entrySet())
		System.out.println(entry.getKey()+" "+entry.getValue());
		//for (Entry<String, Integer> string : names.entrySet()) {
		//	System.out.println(string.getKey()+string.getValue());
			
		}

	}


