package week2.day2;

import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		List<WebElement> AllCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		int size = AllCheckboxes.size();
		for (int i = 0; i < size; i++) {

			String value = AllCheckboxes.get(i).getAttribute("value");

			if (value.equalsIgnoreCase("VB")) {
				if (value.equalsIgnoreCase("SQL")) {
					AllCheckboxes.get(i).click();
					break;
				}
			}
		}
	}
}
