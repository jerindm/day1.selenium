package week1.day2;

public class FindCharCount {

	public static void main(String[] args) {

		String str = "cognizant i i c";
		
		char find ='c';  // i have to find how many "c" are present
		
		int count=0;
		
		char[] charArray = str.toCharArray(); //converting into charecter array
		
		for (int i = 0; i < charArray.length; i++) {
			
			if (charArray[i]==find) { // checking if both values matching
				
				count++;
				
			}
		}
		
		System.out.println(count);
		
	}
}
