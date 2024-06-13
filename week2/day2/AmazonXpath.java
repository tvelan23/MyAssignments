package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]")).click();
		
		// Partial Text based xpath	//a[contains(text(),'Mobiles')]
		
		Thread.sleep(10000);
		
		driver.close();
	}

}
