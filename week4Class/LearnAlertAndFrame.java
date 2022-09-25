package week4Day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertAndFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();////h2[text() = 'JavaScript Prompt']/following-sibling::button
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Jerin");
		alert.getText();
		alert.accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		String jer= "Hello Jerin! How are you today?";
		if (text.equals(jer)) {
			System.out.println("same matches");
		}
		
		
		
		
		

	}

}
