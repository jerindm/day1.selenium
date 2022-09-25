package week4Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {
//	ClassRoom1:
//		1. Navigate to https://erail.in/
//		2. Type MAS and enter in From Station
//		3. Type CBE and enter in To Station
//		4. Uncheck Sort on Date
//		5. Get the train names and verify if there are duplicate train names

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		WebElement j1=driver.findElement(By.id("txtStationFrom"));
		j1.clear();
		j1.sendKeys("MAS");
		j1.sendKeys(Keys.ENTER);
		WebElement j2=driver.findElement(By.id("txtStationTo"));
		j2.clear();
		j2.sendKeys("CBE");
		j2.sendKeys(Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.findElement(By.id("buttonFromTo")).click();
		List<WebElement> trainNames = driver.findElements(By.xpath("//div[@id='divTrainsList']/table[1]//td[2]"));
		int size=trainNames.size();
		System.out.println(size);
		for (WebElement webElement : trainNames) {
			System.out.println(webElement.getText());
			
		}
		

	}

}
