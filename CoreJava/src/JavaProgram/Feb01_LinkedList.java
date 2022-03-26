package JavaProgram;

import java.util.Set;
import java.util.TreeSet;

public class Feb01_LinkedList {

	public static void main(String[] args) {
		Set<Integer> s1=new TreeSet<Integer>();
		Set<Integer> s2=new TreeSet<Integer>();
		
		s2.add(3);
		s2.add(7);
		
		s1.add(10);
		s1.add(20);
		s1.add(10);
		System.out.println(s1);
		
		s1.addAll(s2); // Add another collection like set or list etc
		System.out.println(s1);
		
		/*for (Integer i:s1)  //For each loop
		{
			System.out.println(i);
		}
		
		Iterator<Integer> itr=s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
		s2.add(89);
		System.out.println(" is set empty? " +s1.isEmpty());
		System.out.println(" does set contains 20 " +s1.contains(20));
		System.out.println(" does set contains 40 " +s1.contains(40));
		
		System.out.println(" does set contains s2 " +s1.containsAll(s2)); // to check all the values are present		
		s1.clear(); //Clears all the values
		System.out.println(s1);
		System.out.println(" is set empty? "+s1.isEmpty());
		
		
		

	}

}
