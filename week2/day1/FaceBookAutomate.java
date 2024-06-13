package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAutomate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();		
		driver.get("https://en-gb.facebook.com/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Thanigaivelan");
		driver.findElement(By.name("lastname")).sendKeys("Dhandapani");
		driver.findElement(By.name("reg_email__")).sendKeys("8825932571");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Tvx@123233322222@");		
		
		WebElement db = driver.findElement(By.id("day"));
		Select opt = new Select(db);
		opt.selectByValue("17");
		
		WebElement db1 = driver.findElement(By.id("month"));
		Select opt1 = new Select(db1);
		opt1.selectByVisibleText("Jul");
		
		WebElement db2 = driver.findElement(By.id("year"));
		Select opt2 = new Select(db2);
		opt2.selectByVisibleText("1994");
		
		Thread.sleep(3000);
				
		driver.close();
	}

}
