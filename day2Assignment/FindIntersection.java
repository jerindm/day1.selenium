package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int[] jer1 = {3,2,11,4,6,7};
		
		int[] jer2 = {1,2,8,4,9,7};
		
		//System.out.println(jer1.length);
		//System.out.println(jer2.length);
		
		for (int i = 0; i < jer1.length; i++) {
			
			for (int j = 0; j < jer2.length; j++) {
				
				if (jer1[i]==jer2[j]) {
					
					System.out.print(" "+jer1[i]);
					
				}
			}
		}
		
			
		

	}

}
