package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement firstName = driver.findElement(By.name("UserFirstName"));
		firstName.sendKeys("Susan");
		WebElement lastName = driver.findElement(By.name("UserLastName"));
		lastName.sendKeys("Meryl");
		WebElement eMail = driver.findElement(By.name("UserEmail"));
		eMail.sendKeys("susanmeryl77@gmail.com");
		WebElement companyName = driver.findElement(By.name("CompanyName"));
		companyName.sendKeys("SGT Technologies");
		WebElement phoneNum = driver.findElement(By.name("UserPhone"));
		phoneNum.sendKeys("9877725555");
		WebElement jobTitle = driver.findElement(By.name("UserTitle"));
		Select jobTit = new Select(jobTitle);
		jobTit.selectByVisibleText("IT Manager");
		WebElement employees = driver.findElement(By.name("CompanyEmployees"));
		Select employ = new Select(employees);
		employ.selectByVisibleText("15 - 100 employees");
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select coun = new Select(country);
		coun.selectByValue("AF");
		WebElement checkBox = driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBox);
		driver.close();
	}
}

//SalesForce:
// Step 1: Download and set the path
// Step 2: Launch the chromebrowser
// Step 3: Load the URL
// https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk
// Step 4: Maximise the window
// Step 5: Add implicit wait
// Step 6: Fill in all the text boxes
// Step 7: Handle all the dropdowns
// Step 8: Click the check box
// Step 9: Close the browser
//	*Note: No need click Start my freeTrial
