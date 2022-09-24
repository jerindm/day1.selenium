package week3Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioExercise {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("Bags", Keys.ENTER);
		// To the left of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(4000);
		// Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(4000);
		// Print the count of the items Found.
		WebElement items = driver.findElement(By.xpath("//div[@class='length']"));
		System.out.println("Total " + items.getText());

		// Get the list of brand of the products displayed in the page and print the list
		int i=1,j=1;
		List<WebElement> bagBrandProducts = driver.findElements(By.className("brand"));
		System.out.println("List of Brand Products: ");
		for (WebElement result : bagBrandProducts) {
			String text = result.getText();
			System.out.println("       " + i + "." + text);
			i++;
		}

		// Get the list of names of the bags and print.
		List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
		System.out.println("List of Bag Names :");
		for (WebElement bagEle : bagNames) {
			String text1 = bagEle.getText();
			System.out.println("       " + j + "." + text1);
			j++;
		}

	}

}
