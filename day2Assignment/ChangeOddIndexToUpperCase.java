package week1.day2;

public class ChangeOddIndexToUpperCase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char[] charArray = test.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i%2 != 0) {
		        //String character=" ";
				//character.toUpperCase();
				System.out.print(charArray[i]);
				//String charArray[i] = "helo"
				//string jer = charArray[i].toUpperCase();
				//char jer;
				//charArray[i]=jer;
				//jer.toUpperCase();
				
			}
		}
	}

}
