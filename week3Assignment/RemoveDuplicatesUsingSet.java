package week3Assignment;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" "); // Splitting the string

		Set<String> set = new LinkedHashSet<String>();
		for (String s : split) {  // Adding String array data into Set
			/*if (set.add(s) == false) { System.out.println(s);}  for finding duplicate values  */
			set.add(s);
		}
		System.out.println(set); // To print set after removing duplicates
		System.out.println(String.join(" ", set)); // to convert set into String

	}

}
