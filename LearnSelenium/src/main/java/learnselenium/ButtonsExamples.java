package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		WebElement xyCordinate =  driver.findElement(By.id("position"));
		Point xyPoints =xyCordinate.getLocation();
		int xPoint= xyPoints.getX();
		int yPoint= xyPoints.getY();
		System.out.println("X co-ordinate is "+xPoint+" Y co-ordinate is "+yPoint);
		
		WebElement findColor = driver.findElement(By.id("color"));
		String buttonColor = findColor.getCssValue("background-color");
		System.out.println(buttonColor);
		
		WebElement buttonSize = driver.findElement(By.id("color"));
		int buttonHeight = buttonSize.getSize().getHeight();
		int buttonWidth = buttonSize.getSize().getWidth();
		System.out.println("Button Height is "+buttonHeight+" Button Width is "+buttonWidth);
		
		WebElement isButtonEnable = driver.findElement(By.xpath("//button[@class='button is-info']"));
		boolean isEnabled = isButtonEnable.isEnabled();
		System.out.println(isEnabled);
		
		WebElement longPress = driver.findElement(By.xpath("(//button[@id='isDisabled'])[2]"));
		Actions longPressActions = new Actions(driver);
		longPressActions.clickAndHold(longPress).build().perform();
	}

}
