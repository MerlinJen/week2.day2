package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		WebElement contactsButton = driver.findElement(By.linkText("Contacts"));
		contactsButton.click();
		WebElement createContact = driver.findElement(By.linkText("Create Contact"));
		createContact.click();
		WebElement firstName = driver.findElement(By.id("firstNameField"));
		firstName.sendKeys("Glory");
		WebElement lastName = driver.findElement(By.id("lastNameField"));
		lastName.sendKeys("Janet");
		WebElement firstNameLocal = driver.findElement(By.id("createContactForm_firstNameLocal"));
		firstNameLocal.sendKeys("Gl777");
		WebElement lastNameLocal = driver.findElement(By.id("createContactForm_lastNameLocal"));
		lastNameLocal.sendKeys("Ja555");
		WebElement department = driver.findElement(By.name("departmentName"));
		department.sendKeys("Data Administration");
		WebElement description = driver.findElement(By.xpath("//textarea[@name='description']"));
		description.sendKeys("'M' Level");
		WebElement eMail = driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']"));
		eMail.sendKeys("gloryjanet123@yahoo.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateOrProvince=new Select(state);
		stateOrProvince.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@value='Create Contact']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//textarea[@name='description']")).clear();
		driver.findElement(By.name("importantNote")).sendKeys("Joined on 20.05.2021");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title1 = driver.getTitle();
		System.out.println("Title: " + title1);
	}

}

///*
// * //Pseudo Code
// * 
// * 1. Launch URL "http://leaftaps.com/opentaps/control/login"
// * 
// * 2. Enter UserName and Password Using Id Locator
// * 
// * 3. Click on Login Button using Class Locator
// * 
// * 4. Click on CRM/SFA Link
// * 
// * 5. Click on contacts Button
// * 
// * 6. Click on Create Contact
// *  
// * 7. Enter FirstName Field Using id Locator
// * 
// * 8. Enter LastName Field Using id Locator
// * 
// * 9. Enter FirstName(Local) Field Using id Locator
// * 
// * 10. Enter LastName(Local) Field Using id Locator
// * 
// * 11. Enter Department Field Using any Locator of Your Choice
// * 
// * 12. Enter Description Field Using any Locator of your choice 
// * 
// * 13. Enter your email in the E-mail address Field using the locator of your choice
// * 
// * 14. Select State/Province as NewYork Using Visible Text
// * 
// * 15. Click on Create Contact
// * 
// * 16. Click on edit button 
// * 
// * 17. Clear the Description Field using .clear
// * 
// * 18. Fill ImportantNote Field with Any text
// * 
// * 19. Click on update button using Xpath locator
// * 
// * 20. Get the Title of Resulting Page.
