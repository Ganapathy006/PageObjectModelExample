package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pageObjects.LoginPageObject;

public class LoginPagetestcase {
	
	@Test
	public void login(){
		
		System.setProperty("webdriver.chrome.driver", "E:/Selenium_Supportedfiles/Browsers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		
		PageFactory.initElements(driver, LoginPageObject.class);
		
		LoginPageObject.username.sendKeys("Admin");
		
		LoginPageObject.password.sendKeys("admin123");
		
		LoginPageObject.loginbutton.click();
		
		/*WebElement username = driver.findElement(By.id("txtUsername"));
		
		username.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		loginbutton.click();
		*/
	}

}
