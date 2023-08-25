package learnselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTablesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		WebElement tableMain = driver.findElement(By.id("simpletable"));
		List<WebElement> headTable= tableMain.findElements(By.tagName("th"));
		for (WebElement headTableName : headTable) {
			String stringheadTableName = headTableName.getText();
			System.out.println(stringheadTableName);
			
		}
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@id ='simpletable']/tbody/tr"));
		for (WebElement row : allRows) {
			List<WebElement> colums = row.findElements(By.tagName("td"));
			WebElement firstColumns = colums.get(0);
			System.out.println(firstColumns.getText());
		}
		for (WebElement row : allRows) {
			List<WebElement> colums = row.findElements(By.tagName("td"));
			WebElement secondColumns = colums.get(1);
			String selectRaj = secondColumns.getText();
			if (selectRaj.equals("Raj")) {
				WebElement clickPresent = colums.get(3).findElement(By.tagName("input"));
				clickPresent.click();
				
			}
		}
	}

}
