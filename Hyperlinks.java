package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hyperlinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.get("http://leafground.com/pages/Link.html");
		WebElement href=driver.findElement(By.xpath("//a[@href='Button.html']"));
		String href1=href.getAttribute("href");
		System.out.println(href1);
		driver.findElement(By.linkText("Verify am I broken?")).click();
		driver.getPageSource().contains("404"); 
		System.out.println(driver.getTitle());
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a")).click();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/a")).click();
		List<WebElement> links = driver.findElements(By.tagName("a"));
	      System.out.println(links.size());
		
	}

}
