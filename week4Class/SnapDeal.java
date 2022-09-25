package week4Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
//	ClassRoom2:
//		1. Navigate to https://www.snapdeal.com/
//		2. Mouse Hover on Men's Fashion
//		3. Click on Shirts
//		4. Mouse Hover on First shirt
//		5. Click on Quick View
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//options.addArguments("disable-notifications");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement men = driver.findElement(By.xpath("//span[@class='catText'][text()=\"Men's Fashion\"]"));
		Actions action = new Actions(driver);
		action.moveToElement(men).perform();
		WebElement shirts = driver.findElement(By.xpath("//span[@class='linkTest'][text()='Shirts']"));
		Thread.sleep(5000);
		shirts.click();
		WebElement firstShirt = driver.findElement(By.xpath("//img[@class='product-image ']"));
		Thread.sleep(5000);
		action.moveToElement(firstShirt).perform();
		WebElement quickView = driver.findElement(By.xpath("//div[@class='clearfix row-disc']/div"));
		Thread.sleep(5000);
		quickView.click();

	}

}
