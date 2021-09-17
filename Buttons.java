package week2.day2;



import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Buttons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		System.out.println(driver.findElement(By.xpath("//button[text()='Get Position']")).getLocation());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"size\"]")).getSize());
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		driver.findElement(By.id("home")).click();
		
		
	
		
	}

}
