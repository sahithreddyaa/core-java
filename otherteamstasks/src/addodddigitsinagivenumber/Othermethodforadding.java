package addodddigitsinagivenumber;

import java.util.Scanner;

public class Othermethodforadding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long number = sc.nextLong();
		long sum = 0;
		while(number >0) {
			if((number%10)%2!=0) {
				sum = sum + (number%10);
				number = number/10;
			}
		}
		System.out.print("The sum of Odd Values is:");
		System.out.println(sum);
	}

}
