package learnselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/frame");
		
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		int sizeFrame= totalFrames.size();
		System.out.println(sizeFrame);
		
		WebElement firstFrame = driver.findElement(By.id("firstFr"));
		driver.switchTo().frame(firstFrame);
		WebElement firstName = driver.findElement(By.name("fname"));
		firstName.sendKeys("Mukesh");
		WebElement lastName = driver.findElement(By.name("lname"));
		lastName.sendKeys("Perumal");
		driver.switchTo().defaultContent();
		driver.switchTo().frame(firstFrame);
		WebElement secondFrame = driver.findElement(By.xpath("//div[contains(@class,'container has-text-centered')]//iframe[1]"));
		driver.switchTo().frame(secondFrame);
		WebElement emailField = driver.findElement(By.name("email"));
		emailField.sendKeys("mukesh.perumal00@gmail.com");
		driver.switchTo().defaultContent();
		
		
		
	}

}
