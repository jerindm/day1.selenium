package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		String[] input = {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> values=new ArrayList<String>();
		for (String string : input) {
			values.add(string);
			
		}
		System.out.println(values);
System.out.println(values.size());
Collections.sort(values);
System.out.println(values);

		
		

	}

}
