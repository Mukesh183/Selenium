package interviewQuestionsSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaysToSearchInGoogle {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		WebElement searchField = driver.findElement(By.name("q"));
		//searchField.sendKeys("Chennai"+Keys.ENTER);
		/*
		 * searchField.sendKeys("Chennai"); searchField.submit();
		 */
		/*
		 * searchField.sendKeys("Chennai"); Robot robot = new Robot();
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 */
		 searchField.sendKeys("Chennai \n");
	}

}
