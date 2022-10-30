package characterstolowercase;

import java.util.Scanner;

public class Othermethodforchartolower {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char[] c = s.toCharArray();
		for(int i = 0; i < c.length ; i++) {
			int b = (int)c[i];
			int d = b+32;
			char e = (char)(d);
			System.out.print(e);
		}

	}

	

}
