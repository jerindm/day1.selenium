package week1.day2;

import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
	
		int[] nums = {12, 25, 12, 56, 89, 25};
		
		Arrays.sort(nums); // sorting from asc to des order
		
for (int i = 0; i < nums.length-1; i++) {
	
	if (nums[i]==nums[i+1]) {
		
		System.out.println(nums[i]);
		
	}
}

	}

}
