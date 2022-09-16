package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v101.browser.Browser;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[@style='color: black;']")).click();  //a[@text='CRM/SFA'] - user parent to clild- having doubt
        //driver.findElement(By.xpath("//a[@text='Leads']")).click();
		driver.findElement(By.xpath("//li[@class='sectionTabButtonUnselected']//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();  	//doubt
		driver.findElement(By.xpath("(//div[@class='x-form-element']//input[@name='firstName'])[3]")).sendKeys("Jerin");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(), 'Find Leads')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='10229']")).click(); //(//a[@class='linktext']/ancestor::td)[1]
		String title1 = driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("new company name dustleaf");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String newCompanyName = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']")).getText();
		System.out.println(newCompanyName);
		driver.close();


	}


}
