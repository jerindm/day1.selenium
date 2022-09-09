package week1.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] jer1 = test.split(" ");//spliting into separets words
		
		for (int i = 0; i < jer1.length; i++) {
			if (i%2!=0) { //to reverse only even index- condition
				char[] charArray = jer1[i].toCharArray(); //separating the words into separete letters
				       for (int j = charArray.length-1;j>=0; j--) {  //for printing each letters- condition
					   System.out.print(charArray[j]);
				       }
				
	        }
			else { //if condition not satisfies - print this
				System.out.print(" "+jer1[i]+" ");
			     }
		}

	}

}
