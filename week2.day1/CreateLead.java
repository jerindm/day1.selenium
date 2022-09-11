package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("DemoSalesManager");
	
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	String name="jerin java";
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
	name = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("DM");
    WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd = new Select(findElement);
	dd.selectByValue(("LEAD_CONFERENCE"));
	Thread.sleep(3000);
	driver.findElement(By.className("smallSubmit")).click();
	String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
	System.out.println(firstName);
	if (firstName.equals(name)) {
		System.out.println(true);
	}
	else{
			System.out.println(false);
		}
		driver.close();
	}
}

