package week3Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		int iteration = 1;
		// Using ArrayList class
		List<Integer> values = new ArrayList<Integer>();
		// add the array value to Arraylist
		for (Integer input : arr) {
			values.add(input);
		}
		// sort the list value in ascending order
		Collections.sort(values);
		// for loop to find the missing element and print it
		for (Integer eachInput : values) {
			if (eachInput != iteration) {
				System.out.println("Missing element: " + iteration);
				break;
			}
			iteration++;
		}

	}

}
