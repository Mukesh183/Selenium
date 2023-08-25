package interviewQuestionsSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub //button[text()='LOGIN']
		
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
		
		WebDriverWait wait= new WebDriverWait(driver, 30);
		WebElement loginButtonClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='LOGIN']")));
		loginButtonClick.click();
		

	}

}
