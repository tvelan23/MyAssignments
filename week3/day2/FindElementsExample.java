package week3.day2;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsExample {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://www.facebook.com/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int totalLinks = links.size();
		System.out.println(totalLinks);
		
		for (int i = 0; i < links.size(); i++) {			
			String text = links.get(i).getText();
			System.out.println(text);			
		}
		
		driver.close();
	}
}
