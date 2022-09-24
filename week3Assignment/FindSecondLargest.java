package week3Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = { 3, 2, 11, 4, 6, 7 };
		List<Integer> values = new ArrayList<Integer>();

		for (Integer data1 : data) {  // Adding integer array data into List 

			values.add(data1);
		}
		Collections.sort(values); // Sorting List values
		System.out.println(values.get(values.size() - 2)); // Printing 2nd largest value in list

	}

}
