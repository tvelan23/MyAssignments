package week3.day2;

public class Amazon extends CanaraBank {

	public void cashOnDeliver() {
	System.out.println("cashOnDeliver...");		
	}

	public void upiPyments() {
		System.out.println("upiPyments...");		
	}

	public void cardPayments() {
		System.out.println("cardPayments...");		
	}

	public void internetBanking() {
		System.out.println("internetBanking....");		
	}
	
	public static void main(String[] args) {
		
		Amazon a1 = new Amazon();		
		a1.cashOnDeliver();
		a1.upiPyments();
		a1.cardPayments();
		a1.internetBanking();
		
		a1.recordPaymentDetails();
	}

}
