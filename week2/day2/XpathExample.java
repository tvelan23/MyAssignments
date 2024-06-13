package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tvelan23@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("xxxx");
		
		driver.findElement(By.xpath("//button[contains(@name,'log')]")).click();
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
