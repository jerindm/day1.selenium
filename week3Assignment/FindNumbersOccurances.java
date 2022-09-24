package week3Assignment;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class FindNumbersOccurances {

	public static void main(String[] args) {
		int[] input = { 2, 3, 5, 6, 3, 2, 1, 4, 2, 1, 6, -1 };
		// declaring map object field with Treemap class
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i : input) {
			// check whether the key value already there
			if (map.containsKey(i)) {
				// If yes add one to the value of the key
				map.put(i, map.get(i) + 1);
			} else {
				// if not have the value for key is 1
				map.put(i, 1);
			}
		}
		//Convey the value as each set and print the output
		Set<Entry<Integer, Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.print(entry.getKey());
			System.out.print(" -> ");
			System.out.println(entry.getValue());

		}
		
	}

}
