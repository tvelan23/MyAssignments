package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LauchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
				
		driver.close();

	}

}
