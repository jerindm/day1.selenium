package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1st {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//WebElement userName = driver.findElement(By.id("username"));
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
			//userName.sendKeys("DemoSalesManager");
			
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			
			driver.findElement(By.className("decorativeSubmit")).click();
			
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jerin");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("DM");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("nirej");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("healthcare department");
			driver.findElement(By.id("createLeadForm_description")).sendKeys("nirej is working in a healthcare department in testleaf");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jerin@testleaf.com");
			WebElement findElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select jer1=new Select(findElement);
			jer1.selectByValue(("NY"));
			driver.findElement(By.className("smallSubmit")).click();
			String title = driver.getTitle();
			System.out.println("The title is : "+ title);
	}	

}
