package learnselenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		WebElement alertButton = driver.findElement(By.id("accept"));
		alertButton.click();
		Alert alertBox = driver.switchTo().alert();
		alertBox.accept();
		
		WebElement confirmButton = driver.findElement(By.id("confirm"));
		confirmButton.click();
		Alert confirmBox = driver.switchTo().alert();
		String confirmText = confirmBox.getText();
		confirmBox.dismiss();
		System.out.println(confirmText);
		
		WebElement promptButton = driver.findElement(By.id("prompt"));
		promptButton.click();
		Alert promtBox = driver.switchTo().alert();
		promtBox.sendKeys("Mukesh");
		promtBox.accept();

	}

}
