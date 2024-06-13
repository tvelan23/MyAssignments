package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://leafground.com/checkbox.xhtml");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//div[contains(@class,'ui-chkbox-box ui-widget')]")).click();
		
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
		
		driver.findElement(By.xpath("//ul[contains(@class,'ui-selectcheckboxmenu-multiple-container ui-widget')]")).click();
		
		driver.findElement(By.xpath("(//label[text()='Miami'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Berlin'])[2]")).click();
		
		
		Thread.sleep(3000);
		driver.close();
	}

}
