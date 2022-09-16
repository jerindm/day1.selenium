package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[@style='color: black;']")).click(); 
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); 
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).clear();
		driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys(" ");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("98");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		//driver.findElement(By.xpath("//a[@class='linktext']/ancestor::tr")).click();
		String text1 = driver.findElement(By.xpath("//a[text()='11171']")).getText();
		driver.findElement(By.xpath("//a[text()='11171']")).click();
		System.out.println(text1);
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click(); 
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text1);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click(); 
		String text2 = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(text2);
//		String text3="No records to display";
//		if(text2.equals(text3)) {
//		System.out.println(text3);
//		}
//		else {
//        System.out.println("Failed");
//     
//	}
		   driver.close();
	}
	}
