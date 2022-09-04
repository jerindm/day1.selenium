package mavenproject;

public class Fibbinocci {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int sum = first + second;
		System.out.println(first);
        System.out.println(second);
		for (int i = 1; i <=11; i++) {
			
			first = second;
			second = sum;
			sum = first + second;
			System.out.println(sum);
		
		}
		
		

	}

}
