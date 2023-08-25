package interviewQuestionsSelenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MaximizeScreenExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.navigate().to("https://www.google.co.in/");
	//	driver.manage().window().maximize();
		
		//driver.manage().window().fullscreen();
		/*
		 * Dimension targetSize = new Dimension(1920, 1080);
		 * driver.manage().window().setSize(targetSize);
		 */
	}

}
