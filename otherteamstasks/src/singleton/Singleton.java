package singleton;

import java.util.Scanner;

public class Singleton {
	private static Singleton singleton = null;
	private Singleton() {
		
	}
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	public void doUpiPayment(String upiId, float amount ) {
		float balance = 50000;
		try {
			if(amount < balance) {
				System.out.print(amount + " Amount is paid successfully to"+ upiId + ".");
			}else {
				throw new AmountNotEnough("Balance is not enough");
			}
		}catch(AmountNotEnough e){
			System.out.println(e.getMessage());
		}
		
	}
	public void doCreditCardPayment(String cardNumber, float amount) {
		float bill = 40000;
		float min_bill = 2000;
		try {
			if(amount > min_bill && amount == bill) {
				System.out.println("Total bill was paid to CardNumber"+ cardNumber + ".");
			}else if(amount > min_bill && amount < bill) {
				System.out.println(amount + " Bill was paid."+ (bill-amount) +" Amount was left");
			}else {
				throw new PayMinBill("Please Pay Minimum Bill of "+min_bill + ".");
			}
		}catch(PayMinBill e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for upiPayment or 2 for Credit card payment");
		int value = sc.nextInt();
		if(value == 1) {
			System.out.println("Enter upiId");
			String upiId = sc.next();
			System.out.println("Enter amount");
			float amount = sc.nextFloat();
			s1.doUpiPayment(upiId, amount);
		}else if(value == 2) {
			System.out.println("Enter credit card number");
			String cardNumber = sc.next();
			System.out.println("Enter amount");
			float amount = sc.nextFloat();
			s1.doCreditCardPayment(cardNumber, amount);
		}
		
		
	}

}
