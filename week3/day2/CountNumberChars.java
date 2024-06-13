package week3.day2;

public class CountNumberChars {

	public static int countChars(String name, char c) {
		int count = 0;		
		for (int i = 0; i < name.length(); i++) {
			if(name.charAt(i) == c)
				count += 1;
		}	
		return count;
	}
	
	public static void main(String[] args) {
		
	System.out.println(countChars("Thanigaivelan Dhandapani", 'a'));

	}

}
