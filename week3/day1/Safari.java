package week3.day1;

public class Safari extends Edge {

	public void readerMode() {
		System.out.println("I am in Safri class - readerMode");
	}
	
	public void fullScreenMode() {
		System.out.println("I am in safri class - fullScreenMode");
	}
	
	public static void main(String[] args) {
     
		Safari s1 = new Safari();
		s1.readerMode();
		s1.fullScreenMode(); //Safari class
		
		s1.browserName = "Safari";
		System.out.println(s1.browserName);
		s1.openURL();
		s1.clearCookies(); // Edge class
		s1.closeBrowser(); // Browser class

	}

}
