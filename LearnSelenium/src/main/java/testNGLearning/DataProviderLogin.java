package testNGLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogin {
	
	String[][] data = {{"admin1","passs123"},{"Admin","asdf123"},{"usee231","admin123"},{"Admin","admin123"}};
	
	@DataProvider(name = "logindata")
	public String[][] loginDataProvider() {
		return data;
		
	}
	@Test(dataProvider = "logindata")
	public void login(String uName, String Pword) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(5000);
		
		WebElement usernameORM = driver.findElement(By.name("username"));
		usernameORM.sendKeys(uName);
		
		WebElement passwordORM = driver.findElement(By.name("password"));
		passwordORM.sendKeys(Pword);
		
		WebElement clickLogin = driver.findElement(By.xpath("//button[text()=' Login ']"));
		clickLogin.click();
		
		driver.quit();
	}

}
