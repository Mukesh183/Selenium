package interviewQuestionsSelenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotExample {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//TakesScreenshot 
		/*
		 * TakesScreenshot screenshot=(TakesScreenshot) driver; 
		 * File sourceFile=screenshot.getScreenshotAs(OutputType.FILE);
		 * File destinationFile = new File("D:\\ScreenShot\\UsingTakesScreenshot.png");
		 * FileHandler.copy(sourceFile, destinationFile);
		 */

		WebElement alertButton = driver.findElement(By.id("accept"));
		alertButton.click();
		//Robot method
		Robot robot =new Robot();
		Dimension rectangle = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle screenSize = new Rectangle(rectangle);
		BufferedImage sourceFile = robot.createScreenCapture(screenSize);
		File destinationFile = new File("D:\\ScreenShot\\UsingRobotMethod2.png");
		ImageIO.write(sourceFile, "png", destinationFile);
		
		
		
	}

}
