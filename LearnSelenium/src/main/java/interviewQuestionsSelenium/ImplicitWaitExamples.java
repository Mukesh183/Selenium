package interviewQuestionsSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //a[text()='Log in']
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.navigate().to("https://letcode.in/");
		
		WebElement clickLogin = driver.findElement(By.xpath("//a[text()='Log in']"));
		clickLogin.click();

	}

}
