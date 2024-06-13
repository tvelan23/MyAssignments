package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		
		//using linkText 
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ICU");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thanigaivelan");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Dhandapani");
		
		//using name
		driver.findElement(By.name("generalProfTitle")).sendKeys("Senior Lead");
		
		//using Classname
		driver.findElement(By.className("smallSubmit")).click();
		
		String titleText = driver.findElement(By.id("viewLead_generalProfTitle_sp")).getText();
		
		if(titleText.contains("Senior Lead") ) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		driver.close();
	}
}
