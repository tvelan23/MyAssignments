package week3.day1;

public class ReverseString {

	public void reverseString(String str) {
		
		char[] chars= str.toCharArray();
		for (int i = chars.length -1; i>=0 ; i--) {
			System.out.print(str.charAt(i));
			
		}
	}
	public static void main(String[] args) {
		ReverseString rs = new ReverseString();
		
		rs.reverseString("Madam");

	}

}
