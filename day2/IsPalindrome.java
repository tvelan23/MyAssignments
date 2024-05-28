package week1.day2;

public class IsPalindrome {

	public static void main(String[] args) {
		
		int num = 121;
		int reverse=0,remainder;
		for(int i = num; i>0 ; ) {
			remainder = i % 10;
			reverse = reverse * 10 + remainder;
			i = i / 10;
		}
		
		if(num == reverse) {
			System.out.println(num + " is Palindrome");
		}
		else {
			System.out.println(num + " is not Palindrome");
		}
		
	}
}
