package CollectionFramework;

/* SortedSet have its implementation in various classes like TreeSet. 
Following is an example of a TreeSet class */

import java.util.*;

public class SortedSetTest {

	public static void main(String[] args) {

		// Create the sorted set
		SortedSet set = new TreeSet();

		// Add elements to the set
		set.add("b");
		set.add("c");
		set.add("a");

		// Iterating over the elements
		Iterator it = set.iterator();

		while (it.hasNext()) {
			// Get element
			Object element = it.next();
			System.out.println(element.toString());
		}
	}
}