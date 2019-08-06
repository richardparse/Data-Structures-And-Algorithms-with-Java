package CollectionFramework;

import java.awt.List;
import java.util.*;

/* Following is an example to explain few methods from 
 * various class
 implementations of the above collection methods: */

public class CollectionDemo {

	public static void main(String[] args) {

		// ArrayList
		ArrayList a1 = new ArrayList();
		a1.add("Zara");
		a1.add("Mahnaz");
		a1.add("Ayan");
		System.out.println(" ArrayList Elements");
		System.out.print("\t" + a1);

		// LinkedList
		LinkedList l1 = new LinkedList();
		l1.add("Zara");
		l1.add("Mahnaz");
		l1.add("Ayan");
		System.out.println();
		System.out.println(" LinkedList Elments");
		System.out.println("\t" + l1);

		// HashSet
		Set s1 = new HashSet();
		s1.add("Zara");
		s1.add("Mahnaz");
		s1.add("Ayan");
		System.out.println();
		System.out.println("Set Elements");
		System.out.print("\t" + s1);

		// HashMap
		Map m1 = new HashMap();
		m1.put("Zara", "8");
		m1.put("Mahnaz", "31");
		m1.put("Ayan", "12");
		m1.put("Daisy", "14");
		System.out.println();
		System.out.println(" Map Elements");
		System.out.println("\t" + m1);
	}
}