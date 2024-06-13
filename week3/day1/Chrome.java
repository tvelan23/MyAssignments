package week3.day1;

public class Chrome extends Browser {

	public void openIncognito() {
		System.out.println("I am Chrome Class - openIncognito");
	}
	
	public void clearCache() {
		System.out.println("I am Chrome Class - clearCache");
	}
	
	public static void main(String[] args) {

      Chrome c1 = new Chrome();
      c1.browserName = "Chrome";
      c1.browserVersion = "121.23.2";
      System.out.println(c1.browserName);
      System.out.println(c1.browserVersion);
      c1.openURL();
      c1.closeBrowser();
      c1.navigateBack();
      
      c1.openIncognito();
      c1.clearCache();
	}

}
