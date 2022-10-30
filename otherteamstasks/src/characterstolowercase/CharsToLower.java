package characterstolowercase;

import java.util.Scanner;

public class CharsToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s.toLowerCase());
		System.out.println(s.replace('a', 'd'));
		
	}

}
