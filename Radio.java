package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.findElement(By.id("yes")).click();
		WebElement radio1 = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		System.out.println(radio1.getAttribute("value"));
		System.out.println("The default selected radio button is Checked");
		WebElement radio3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input[2]"));
		if (radio3.isEnabled())
			System.out.println("Already Selected");
		else
			radio3.click();

	}

}
