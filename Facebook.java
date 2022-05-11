package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("surya");
		driver.findElement(By.name("lastname")).sendKeys("E");
		driver.findElement(By.name("reg_email__")).sendKeys("sivarajasurya16@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("sivarajasurya16@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("fjahbvyr2343GFDGF**");
		
		WebElement day=driver.findElement(By.id("day"));		
		Select dd1=new Select(day);
		dd1.selectByIndex(15);
		
		WebElement month = driver.findElement(By.id("month"));
		Select dd2=new Select(month);
		dd2.selectByIndex(2);
		
		WebElement year = driver.findElement(By.id("year"));
		Select dd3=new Select(year);
		dd3.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		

		
	}

}
