package characterstolowercase;

import java.util.Scanner;

public class ReplaceOneletterwithother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a string");
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		char[] c = a.toCharArray();
		String s = "";
		for(int i = 0; i <a.length(); i++) {
			
			if(c[i]== 'd') {
				c[i] = 'a';
			}
			s += c[i];
			
		}
		System.out.println(s);
	}

}
