package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		WebElement dropdown=driver.findElement(By.xpath("//*[@id=\"dropdown1\"]"));
		Select dropdown1=new Select(dropdown);
		dropdown1.selectByIndex(4);
		WebElement drop=driver.findElement(By.name("dropdown2"));
		Select dropdown2=new Select(drop);
		dropdown2.selectByVisibleText("Appium");
		WebElement drop3=driver.findElement(By.id("dropdown3"));
		Select dropdown3=new Select(drop3);
		dropdown3.selectByValue("3");
		WebElement drop4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select dropdown4=new Select(drop4);
		List<WebElement> l = dropdown4.getOptions();
		System.out.println(l.size());
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select")).sendKeys("Selenium");
		new Select(driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select")));
		
	}

}
