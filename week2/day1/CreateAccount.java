package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.linkText("Create Account")).click();
		
		//using id
		driver.findElement(By.id("accountName")).sendKeys("Acc123");
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps”");
				
		//using name
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		
		
		//Dropdown Feature
		WebElement db = driver.findElement((By.name("industryEnumId")));		
		Select opt = new Select(db);
		opt.selectByValue("IND_SOFTWARE");
		
		WebElement db1 = driver.findElement((By.name("ownershipEnumId")));		
		Select opt1 = new Select(db1);
		opt1.selectByVisibleText("S-Corporation");
		
		WebElement db2 = driver.findElement((By.id("dataSourceId")));		
		Select opt2 = new Select(db2);
		opt2.selectByValue("LEAD_EMPLOYEE");
		
		WebElement db3 = driver.findElement((By.id("marketingCampaignId")));		
		Select opt3 = new Select(db3);
		opt3.selectByIndex(6);
		
		WebElement db4 = driver.findElement((By.id("generalStateProvinceGeoId")));		
		Select opt4 = new Select(db4);
		opt4.selectByValue("TX");
						
		//using class
		driver.findElement(By.className("smallSubmit")).click();
		
		String str = driver.getTitle();
		
		if(str.contains("Account Details")) {
			System.out.println("Passed");
		}else {
			System.out.println("Failed");
		}
		Thread.sleep(3000);
		driver.close();
	}

}
