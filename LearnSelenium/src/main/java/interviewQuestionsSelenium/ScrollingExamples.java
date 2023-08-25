package interviewQuestionsSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingExamples {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub Ananda Vikatan
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Vikram_(2022_film)");
		driver.manage().window().maximize();
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		//it goes to specified point and return back if give -1000 like this
		/*
		 * executor.executeScript("window.scroll(0,1000)", ""); Thread.sleep(3000);
		 * executor.executeScript("window.scroll(0,-1000)", "");
		 */
		
		//go to down to the page
		/*
		 * executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		 * Thread.sleep(3000); executor.executeScript("window.scroll(0,0)", "");
		 */
		
		WebElement reviewMagazine = driver.findElement(By.linkText("Ananda Vikatan"));
		executor.executeScript("arguments[0].scrollIntoView(true)", reviewMagazine);
		Thread.sleep(3000);
		Robot robot = new Robot();	
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		
		
		
	}

}
