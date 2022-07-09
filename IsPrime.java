package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=41;
		boolean divisibility=false;

		for (int i = 2; i <= n-1; i++) {
			if(n%i ==0) 
			{
				divisibility = true;
			}
		}


		if(divisibility==true) {
			System.out.println(+n+ " is not Prime Number");
		}
		else{
			System.out.println(+n+ " is a prime Number");
		}


	}
}
