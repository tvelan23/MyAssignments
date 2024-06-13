package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		//Using id
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//using classname
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Le")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("1002");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String leadId = driver.findElement(By.linkText("11974")).getText();
		
		driver.findElement(By.linkText("11974")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.partialLinkText("Find Le")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		String errMsg = driver.findElement(By.className("x-paging-info")).getText();
		
		if(errMsg.contains("No records to display")) {
			System.out.println("Passed");
		}else {
		System.out.println("Failed");
		}
		
		driver.close();
	}

}
