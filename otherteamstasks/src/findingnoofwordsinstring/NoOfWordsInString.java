package findingnoofwordsinstring;

import java.util.Scanner;

public class NoOfWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		//System.out.println(s.length());
		/*char[] ch = s.toCharArray();
		int count = 0;
		for(char a : ch) {
			count++;
		}
		System.out.println(count +" no of characters in a string");*/
		//finding No of words in a string
		String[] a = s.split(" ");
		System.out.println(a.length);
	}

}
