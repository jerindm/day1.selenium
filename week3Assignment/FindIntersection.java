package week3Assignment;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int[] input1 = { 3, 2, 11, 4, 6, 7, 8 }; // First input
		int[] input2 = { 1, 2, 8, 4, 9, 7 }; // second input
		// Creating object for ArrayList class
		List<Integer> inputList1 = new ArrayList<Integer>();
		// Looping first array
		for (Integer value1 : input1) {
			// add the input1 value to list object
			inputList1.add(value1);
		}
		// for loop for second array
		for (Integer value2 : input2) {
			// checking whether ArrayList have the value from second array
			if (inputList1.contains(value2)) {
				System.out.print(value2 + ",");
			}
		}

	}

}
