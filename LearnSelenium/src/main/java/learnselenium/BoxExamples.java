package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BoxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/buttons");
		
		WebElement xyLocation = driver.findElement(By.id("position"));
		Point xyPoint= xyLocation.getLocation();
		int XLocation = xyPoint.getX();
		int YLocation = xyPoint.getY();
		
		System.out.println("X location is : "+XLocation+" Y Location is : "+YLocation);
		
		WebElement colorBox = driver.findElement(By.id("color"));
		String getColor = colorBox.getCssValue("background-color");
		System.out.println(getColor);
		
		WebElement HWButton = driver.findElement(By.id("property"));
		int HeightButton = HWButton.getSize().getHeight();
		int WidthButton = HWButton.getSize().getWidth();
		System.out.println("Height of the button : "+HeightButton+" Width of the button : "+WidthButton);
		
		WebElement UseRect = driver.findElement(By.id("property"));
		Rectangle RectBox = UseRect.getRect();
		Dimension xyDime = RectBox.getDimension();
		int xDime = xyDime.getHeight();
		int yDime = xyDime.getWidth();
		System.out.println("Height of xDime:"+xDime+" Width of yDime:"+yDime);
		
		WebElement EnableButton = driver.findElement(By.id("isDisabled"));
		boolean isEnableButton = EnableButton.isEnabled();
		System.out.println(isEnableButton);
		
	}

}
