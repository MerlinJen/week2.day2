package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.findElement(By.name("username")).sendKeys("Jancy Flora");
		driver.findElement(By.name("firstname")).sendKeys("Jancy");
		driver.findElement(By.name("lastname")).sendKeys("Flora");
		driver.findElement(By.name("email")).sendKeys("jancyflora199@gmail.com");
		WebElement country=driver.findElement(By.name("country_id"));
		Select countryName=new Select(country);
		countryName.selectByValue("38");
		driver.findElement(By.name("password")).sendKeys("Jan7Flo!");
		
	}

}
