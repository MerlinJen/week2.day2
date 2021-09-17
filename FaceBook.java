package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement createNewAccount = driver.findElement(By.linkText("Create New Account"));
		createNewAccount.click();
		WebElement firstName1 = driver.findElement(By.name("firstname"));
		firstName1.click();
		firstName1.sendKeys("Diana");
		WebElement lastName1 = driver.findElement(By.name("lastname"));
		lastName1.sendKeys("Maxwell");
		WebElement mobNum1 = driver.findElement(By.name("reg_email__"));
		mobNum1.sendKeys("8633524981");
		WebElement passWord = driver.findElement(By.id("password_step_input"));
		passWord.sendKeys("dian!12");
		WebElement dropDown1 = driver.findElement(By.id("day"));
		Select drop1 = new Select(dropDown1);
		drop1.selectByValue("11");
		WebElement dropDown2 = driver.findElement(By.id("month"));
		Select drop2 = new Select(dropDown2);
		drop2.selectByVisibleText("May");
		WebElement dropDown3 = driver.findElement(By.id("year"));
		Select drop3 = new Select(dropDown3);
		drop3.selectByValue("1995");
		WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
		gender.click();
		WebElement signUp = driver.findElement(By.name("websubmit"));
		signUp.click();		
	}
}
//Step 1: Download and set the path 
//Step 2: Launch the chromebrowser
//Step 3: Load the URL https://en-gb.facebook.com/
//Step 4: Maximise the window
//Step 5: Add implicit wait
//Step 6: Click on Create New Account button
//Step 7: Enter the first name
//Step 8: Enter the last name
//Step 9: Enter the mobile number
//Step 10: Enterthe password
//Step 11: Handle all the three drop downs
//Step 12: Select the radio button "Female" 
       //  ( A normal click will do for this step) 