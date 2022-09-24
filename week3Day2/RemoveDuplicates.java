package week3.day2;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String leaf="PayPal India";
		char[] charArray = leaf.toCharArray();
		Set<Character> leaf1=new LinkedHashSet<Character>();
		for (char ch : charArray) {
			if (ch!=' ') {
				leaf1.add(ch);
			}
		}
		for (Character leaf2 : leaf1) {
			System.out.print(leaf2);
		}

	}

}
