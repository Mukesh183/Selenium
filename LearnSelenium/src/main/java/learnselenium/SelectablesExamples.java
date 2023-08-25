package learnselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectablesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/selectable");
		
		List <WebElement> selectBox = driver.findElements(By.xpath("//*[@id=\'container\']/div"));
		int sizeofBox = selectBox.size();
		System.out.println(sizeofBox);
		
		/*Actions actions = new Actions(driver);
		actions.clickAndHold(selectBox.get(0));
		actions.clickAndHold(selectBox.get(1));
		actions.clickAndHold(selectBox.get(2));
		actions.clickAndHold(selectBox.get(3));
		actions.build().perform(); 	*/
		
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(selectBox.get(0)).click(selectBox.get(1)).click(selectBox.get(2)).click(selectBox.get(3)).build().perform();
		
	}

}
