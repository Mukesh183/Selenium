package learnselenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicTables2Examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/table");
		
		List<WebElement> colums = driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]/thead/th"));
		int columsSize = colums.size();
		System.out.println("No of Colums :"+columsSize);
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]/tr"));
		int rowsSize = rows.size();
		System.out.println("No of Rows :"+rowsSize);
		
		WebElement iceCream = driver.findElement(By.xpath("//td[text()='Ice cream']/following-sibling::td[1]"));
		String iceCreamCalories = iceCream.getText();
		System.out.println("No of Calories Ice Cream has "+iceCreamCalories);
		
		List<WebElement> fatDatas = driver.findElements(By.xpath("//table[contains(@class,'mat-sort table')]/tr/td[3]"));
		List<Integer> integerFatDatas = new ArrayList<Integer>();
		for (WebElement indivdualData : fatDatas) {
			String getData = indivdualData.getText();
			int intgerFatValues = Integer.parseInt(getData);
			integerFatDatas.add(intgerFatValues);
			
		}
		System.out.println("Array list :"+integerFatDatas);
		int lowFatData = Collections.min(integerFatDatas);
		System.out.println(lowFatData);
		
		List<WebElement> AttendanceTable = driver.findElements(By.xpath("//table[@id='simpletable']/tbody/tr"));
		for (WebElement nameList : AttendanceTable) {
			List<WebElement> nameListStudents = nameList.findElements(By.tagName("td"));
			WebElement firstName =nameListStudents.get(0);
			String firstNameStudents =firstName.getText();
			if (firstNameStudents.contains("Iron")) {
				WebElement presentAttendance =nameListStudents.get(3).findElement(By.tagName("input"));
				presentAttendance.click();
				
				
			}
			
		}
		
		
	}

}
