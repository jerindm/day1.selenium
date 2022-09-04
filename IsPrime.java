package mavenproject;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=37;
		int count=0;
		for (int i=2;i<n;i++)
		{
			if(n%i==0) {
				count=count+1;
			}
		}
		if(count!=0)
			System.out.println(n + " is Not a prime number");
		else
			System.out.println(n+ " is a Prime number");

	}

}
