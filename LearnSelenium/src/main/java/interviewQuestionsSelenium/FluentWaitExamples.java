package interviewQuestionsSelenium;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://letcode.in/");
		
		WebElement clickLogin = driver.findElement(By.xpath("//a[text()='Log in']"));
		clickLogin.click();
		
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("automationtesting@gmail.com");
		
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Password@123");
		
		/*
		 * WebElement loginButton =
		 * driver.findElement(By.xpath("//button[text()='LOGIN']")); loginButton.click();
		 */
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement loginButton = wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//button[text()='LOGIN']"));
			}
		});
		
		loginButton.click();
		
	}

}
