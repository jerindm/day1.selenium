package week1.day2;

import java.util.Arrays;

public class FindMinMax {

	public static void main(String[] args) {
		
		int nums[] = {22, 3982, -17, 82, 0, 45, 37};
		
		int length = nums.length;//to find the total length of array
		
		Arrays.sort(nums);// sorting from asc to des order
		
		//System.out.println(length);
		
		System.out.println(nums[0]+ " is the min"); //printing the first number which is the minimum
		
		System.out.println(nums[length-1]+ " is the max"); //printing the last number which is the maximum

	}

}
