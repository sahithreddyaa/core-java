package addodddigitsinagivenumber;

import java.util.Scanner;

public class AddOddDigitsInAGivenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int sum = 0;
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			int a = Integer.parseInt(String.valueOf(c));
			if(a%2==0) {
				
			}else {
				sum += a;
			}
			
		}
		System.out.println(sum +" Total sum");
	}

}
