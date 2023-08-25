package interviewQuestionsSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectAllCheckBoxex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		
		List<WebElement> totalBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement webElement : totalBoxes) {
			if(webElement.isSelected()) {
				continue;
			}else {
				webElement.click();
			}
		}
	}

}
