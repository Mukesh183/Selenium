package learnselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadResumeExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.foundit.in/");

		//driver.findElement(By.xpath("//div[@class='heroSection-buttonContainer_secondaryBtn secondaryBtn']")).click();

		//driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\sivapriya\\Downloads\\Mukesh__Resume.pdf");

		driver.get("https://www.grammarly.com/plagiarism-checker");
		driver.findElement(By.xpath("//span[text()='Upload a file']")).click();
		
		String uploadFileLocation = "C:\\Users\\sivapriya\\Downloads\\MukeshPSoftwareTestEngineerLetter.TXT";
		
		StringSelection selectUploadFile = new StringSelection(uploadFileLocation);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectUploadFile, null);;
		
		Robot robot = new Robot();
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
