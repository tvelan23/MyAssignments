package week3.day1;

public class Browser {

	String browserName = "" , browserVersion = "";
	
	public void openURL() {
		System.out.println("I am in Grand Parent class - openURL");
	}
	
	public void closeBrowser() {
        System.out.println("I am in Grand Parent Class - closeBrowser");
	}
	
	public void navigateBack() {
		System.out.println("I am in Grand Parent Class - navigateBack");
	}
}
