package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/dropable");
		
		WebElement DragBox = driver.findElement(By.id("draggable"));
		WebElement DropBox = driver.findElement(By.id("droppable"));
		
		Actions dragAndDropActions = new Actions(driver);
		//dragAndDropActions.dragAndDrop(DragBox, DropBox).perform();
		dragAndDropActions.clickAndHold(DragBox).moveToElement(DropBox).release(DropBox).perform();

	}

}
