package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select drop1 = new Select(dropDown1);
		drop1.selectByIndex(1);
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select drop2 = new Select(dropDown2);
		drop2.selectByVisibleText("UFT/QTP");
		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select drop3 = new Select(dropDown3);
		drop3.selectByValue("4");
	}

}
