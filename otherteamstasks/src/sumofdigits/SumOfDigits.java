package sumofdigits;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
		Long l = sc.nextLong();
		long sum = 0;
		while(l>0) {
			long b = (l%10);
			l = l/10;
			sum += b;
		}
		System.out.print("The sum of digits is:");
		System.out.println(sum);
	}

}
