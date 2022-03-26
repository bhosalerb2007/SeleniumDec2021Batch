package JavaProgram;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Feb02_Map {

	public static void main(String[] args) {
		Map<Integer, String> mymap = new TreeMap<Integer, String>();
		mymap.put(1234, "Hemant");
		mymap.put(123, "Nilesh");
		mymap.put(12,"Ravi");
		System.out.println(mymap);
		
		System.out.println(mymap.containsKey(1234));
		System.out.println(mymap.containsValue("Ravi"));
		
		System.out.println(mymap.get(123));
		
		Set<Integer> keys=mymap.keySet();
		System.out.println(keys);
		
	
		
		mymap.clear(); // Clears all the contents of map
		System.out.println(mymap);
		
		
		
		
	}

}
