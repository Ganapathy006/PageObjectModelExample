package testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjects.LoginPageObject;
import pageObjects.TimePageObject;

public class TimePageTestcase {

	@Test
	public void timepage(){

		System.setProperty("webdriver.chrome.driver", "E:/Selenium_Supportedfiles/Browsers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, LoginPageObject.class);

		LoginPageObject.username.sendKeys("Admin");
		
		LoginPageObject.password.sendKeys("admin123");
		
		LoginPageObject.loginbutton.click();
		
		PageFactory.initElements(driver, TimePageObject.class);
		
		TimePageObject.leavebutton.click();
	
		Select sUnit = new Select(TimePageObject.subUnit);
		sUnit.selectByIndex(1);
		
		
		
		
		/*WebElement timebutton = driver.findElement(By.id("menu_time_viewTimeModule"));
		timebutton.click();

		WebElement firstdayofweek=driver.findElement(By.id("time_startingDays"));

		Select select = new Select(firstdayofweek);

		select.selectByIndex(1);
		
		WebElement savebutton = driver.findElement(By.id("btnSave"));
		savebutton.click();*/

	}

}
