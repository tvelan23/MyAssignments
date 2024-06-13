package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownPractise {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.manage().window().maximize();
		
		WebElement db = driver.findElement(By.className("ui-selectonemenu"));
		
		Select options = new Select(db);
		
		options.selectByIndex(3);
		Thread.sleep(3000);
//		options.selectByValue("Selenium");
		
		options.selectByVisibleText("Cypress");		
		
		Thread.sleep(3000);
				
		driver.close();

	}

}
