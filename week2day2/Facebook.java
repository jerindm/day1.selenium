package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("JERIN");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("DM");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8908908901");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("123456789");
		//WebElement findElement0 = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		//Select jerin1=new Select(findElement0);
		driver.findElement(By.xpath("//option[contains(@value,'27')]")).click();
		//WebElement findElement1 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		//Select jerin2 = new Select(findElement1);
		driver.findElement(By.xpath("//option[contains(text(),'Dec')]")).click();
		//WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		//Select jerin3 = new Select(findElement2);
		driver.findElement(By.xpath("//option[contains(text(),'1997')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

	}

}
