package week3Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FirstMostDuplicate {

	public static void main(String[] args) {
		String input = "abbaba";
		// Creating object for HAshMap class
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int maxOccurance = 0;
		char maxOccuranceChar = 0;
		// convert the String into Chararray
		char[] charArray = input.toCharArray();
		for (char c : charArray) {
			// puting the each value with number of occurance to map object
			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		// Convey the value as each set
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		// Check each set value to find the maximum occurance character
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > maxOccurance) {
				maxOccuranceChar = entry.getKey();
				maxOccurance = entry.getValue();
			}

		}
		System.out.println("First most duplicate character is : " + maxOccuranceChar);

	}

}
