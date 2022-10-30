package randomnumbers;

import java.util.Scanner;

public class RandomNumbers {
	public void Guessgame() {
	
	int score = 0 ;
	
	while(true) {
		float a = (float) Math.random()*100;
		//System.out.println(a);
		float b = (float) Math.random()*100;
		//System.out.println(b);
		System.out.println("Guess the number and enter whether second number is higher or lower than the first");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter '1' it means higher or '0' it means lower or '2' it means exit");
		int c = sc.nextInt();
	if(c== 1) {
		if(b>a) {
		score += 10;
		System.out.println("Well Guessed");
		}else {
			score -= 10;
			System.out.println("Sorry, Wrong guess");
		}
	}if(c == 0) {
		if(a>b) {
		score += 10;
		System.out.println("Well Guessed");
		}else {
			score -= 10;
			System.out.println("Sorry, Wrong guess");
		}
	}if(c == 2) {
		System.out.println("Your final score is:");
		System.out.print(score);
		break;
		
	}
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNumbers r = new RandomNumbers();
		r.Guessgame();
		
	}

}
