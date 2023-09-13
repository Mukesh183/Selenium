package learnselenium;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		
		String oldWindow = driver.getWindowHandle();
		WebElement homePage = driver.findElement(By.id("home"));
		homePage.click();
		
		Set<String> handles=driver.getWindowHandles();
		for (String newWindows : handles) {
			driver.switchTo().window(newWindows);
			
		}
		
		WebElement newPage = driver.findElement(By.xpath("/html/body/app-root/app-test-site/section[2]/div/div/div/div[1]/app-menu/div/footer/a"));
		newPage.click();
		driver.close();
		
		driver.switchTo().window(oldWindow);
		
		WebElement multiWindow =driver.findElement(By.id("multi"));
		multiWindow.click();
		
		int noOfWindows = driver.getWindowHandles().size();
		System.out.println("no of Windows:"+noOfWindows);
		
		Set<String> newWindows = driver.getWindowHandles();
		for (String multiNewWindows : newWindows) {
			if (!multiNewWindows.equals(oldWindow)) {
				driver.switchTo().window(multiNewWindows);
				String titleText = driver.getTitle();
				System.out.println("Child Windows titles :"+titleText);
				driver.close();
				
			}
			
		}
		driver.quit();
	}

}
