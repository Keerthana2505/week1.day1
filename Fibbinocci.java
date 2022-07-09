package week1.day1;

public class Fibbinocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=11;
		int firstNum=0;
		int secNum=1;
		int sum=0;
		
		System.out.println("First Number = "+firstNum);
		System.out.println("Second Number = "+secNum);
		
		System.out.println("FIBONACCI SERIES");
		for(int i=1;i<=num;i++)
		{		
			sum=firstNum+secNum;
			System.out.println(firstNum);
			firstNum=secNum;
			secNum=sum;		
		}

	}

}
