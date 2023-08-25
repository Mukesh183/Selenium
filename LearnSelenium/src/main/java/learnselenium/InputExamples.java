package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub value
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		
		WebElement enterName = driver.findElement(By.id("fullName"));
		enterName.sendKeys("Mukesh");
		
		WebElement gooBoy = driver.findElement(By.id("join"));
		gooBoy.sendKeys(" Boy"+ Keys.TAB);
		
		WebElement insideText = driver.findElement(By.id("getMe"));
		String getinsideText = insideText.getAttribute("value");
		System.out.println(getinsideText);
		
		WebElement clearText = driver.findElement(By.id("clearMe"));
		clearText.clear();
		
		WebElement isTextEnable = driver.findElement(By.id("noEdit"));
		boolean enableOrNot = isTextEnable.isEnabled();
		System.out.println(enableOrNot);
		
		WebElement isTextReadOnly = driver.findElement(By.id("dontwrite"));
		String readOnlyeOrNot = isTextReadOnly.getAttribute("readonly");
		System.out.println(readOnlyeOrNot);
		
		
	}

}
