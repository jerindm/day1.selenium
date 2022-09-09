package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String jer1 = "madam";
		String jer2 = "";
		for (int i =jer1.length()-1;i>=0; i--) { //condition 
			jer2=jer2+jer1.charAt(i); //for printing th letters
		}
		//System.out.println(jer2);
		if (jer1.equals(jer2)) //equals condition
			System.out.println("palindrome");
			else 
				System.out.println("not a palindrome");
		
		}
		

	}
