package learnselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortableExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub sortable //div[@class='vertical-list-container mt-4']/div
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/sortable");
		Thread.sleep(3000);
		List<WebElement> sortElements= driver.findElements(By.xpath("//div[@class='vertical-list-container mt-4']/div"));
		WebElement fromElement= sortElements.get(2);
		WebElement toElement= sortElements.get(0);
		Thread.sleep(3000);
		Actions actions = new Actions(driver);
		actions.clickAndHold(fromElement);
		actions.moveToElement(toElement);
		Thread.sleep(3000);
		actions.release(toElement);
		actions.build().perform();

	}

}
