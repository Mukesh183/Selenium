package learnselenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExample {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/file");
		
		
		WebElement uploadClick = driver.findElement(By.xpath("//span[@class='file-cta']//span[1]"));
		uploadClick.click();
		
		Thread.sleep(3000);
		
		String uploadFileLocation = "C:\\Users\\sivapriya\\sample.pdf";
		
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
