package interviewQuestionsSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RefreshingWays {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub input

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Learn Automation Online");

		//Navigate method
		//driver.navigate().refresh();

		//getCurrenturl
		//driver.get(driver.getCurrentUrl());

		//Javascript executor
		//	JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("history.go(0)");//location.reload()

		//using robot
//		Robot robot =new Robot();
//		robot.keyPress(KeyEvent.VK_F5);
//		robot.keyRelease(KeyEvent.VK_F5);
		
		//actions not working
//		Actions actions = new Actions(driver);
//		actions.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
		


	}

}
