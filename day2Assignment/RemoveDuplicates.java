package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] jer1 = text.split(" ");
		int count = 0;
		//char[] charArray = text.toCharArray();
		for (int i = 0; i < jer1.length; i++) {
			for (int j = i+1; j < jer1.length; j++) {
				if (jer1[i].equals(jer1[j])) {
					count++;
					jer1[j]="";
			
				}	
			}
			
		}
		if (count>1) {
			for (int k = 0; k < jer1.length; k++) {
				System.out.print(jer1[k]+" ");
			}
			
		}

	}

}
