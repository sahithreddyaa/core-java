package swap;

import java.util.Scanner;

public class SwapTwoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter one string");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		System.out.println("Enter second string");
		String s2 = sc.nextLine();
		s1 = s1 + s2;
		s2 = s1.substring(0,(s1.length()-s2.length()));
		s1 = s1.substring(s2.length());
		System.out.print(s1);
		System.out.print(s2);
	}

}
