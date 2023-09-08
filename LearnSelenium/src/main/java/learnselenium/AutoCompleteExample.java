package learnselenium;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		
		WebElement clickLang = driver.findElement(By.id("lang"));
		clickLang.click();
		List<WebElement> porgLang = driver.findElements(By.xpath("//*[@id=\'lang\']/option"));
		for (WebElement selectLang : porgLang) {
			if (selectLang.getText().equals("Java")) {
				selectLang.click();
				System.out.println("Correct Language");
				break;
				
				
			}else {
				System.out.println("Unmatch Language");
			}
			
		}
		driver.quit();

	}

}
