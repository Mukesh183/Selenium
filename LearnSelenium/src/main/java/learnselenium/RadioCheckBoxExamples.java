package learnselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBoxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/radio");
		
		WebElement yesButton = driver.findElement(By.id("yes"));
		yesButton.click();
		
		WebElement noButton = driver.findElement(By.id("two"));
		noButton.click();
		
		WebElement fooSelected = driver.findElement(By.id("foo"));
		if(fooSelected.isSelected()) {
			System.out.println("foo is selected");
			}
		WebElement barSelected = driver.findElement(By.id("notfoo"));
		if(barSelected.isSelected()) {
			System.out.println("bar is selected");
		}
		WebElement lastFieldEnable = driver.findElement(By.id("maybe"));
		boolean enableornot = lastFieldEnable.isEnabled();
		System.out.println(enableornot);
		
		WebElement checkBoxSelected = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[6]/label[2]/input"));
		boolean checkButton= checkBoxSelected.isSelected();
		System.out.println(checkButton);
		
		WebElement termBox = driver.findElement(By.xpath("/html/body/app-root/app-radio-check/section[1]/div/div/div[1]/div/div/div[7]/label[2]/input"));
		termBox.click();
		}

}
