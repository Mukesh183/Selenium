package learnselenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAdvanceExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/broken");
		
		WebElement validLink1 = driver.findElement(By.linkText("Click Here for Valid Link"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", validLink1);

		driver.navigate().back();
		
		WebElement invalidLink1 = driver.findElement(By.linkText("Click Here for Broken Link"));
		String invalidAttributeName = invalidLink1.getAttribute("href");
		System.out.println(invalidAttributeName);
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].click();",invalidLink1);
		String title = driver.getTitle();
		if (title.contains("Internet")) {
			System.out.println("Broken Link not Working");
			
		} else {
			System.out.println("Link Working");

		}
		
		driver.navigate().back();
		
		WebElement validLink2 = driver.findElement(By.linkText("Click Here for Valid Link"));
		JavascriptExecutor js2 = (JavascriptExecutor)driver;
		js2.executeScript("arguments[0].click();", validLink2);
		driver.navigate().back();
		
		List<WebElement>totalLinks = driver.findElements(By.tagName("a"));
		int totalCount = totalLinks.size();
		System.out.println(totalCount);
	}

}
