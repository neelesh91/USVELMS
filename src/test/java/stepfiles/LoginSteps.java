package stepfiles;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps 
{
	WebDriver driver;
	
		@Given("^user is  on homepage$")
		public void user_is_on_homepage() throws Throwable 
		{
			System.setProperty("webdriver.chrome.driver","E:/Neelesh_LMS/Selenium_Import/chromedriver_win32/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://lms-emmersive.obinco.com/");
		    
		}

		@When("^user navigates to Login Page$")
		public void user_navigates_to_Login_Page() throws Throwable 
		{
			driver.findElement(By.xpath("//a[text()='Login']")).click();
		    
		}

		@When("^user enters username and Password$")
		public void user_enters_username_and_Password() throws Throwable 
		{
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("979797");
	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Admin@123");
	     
		    
		}

		@Then("^success message is displayed$")
		public void success_message_is_displayed() throws Throwable 
		{
			driver.findElement(By.xpath("//input[@id='loginbtn']")).click();
			driver.quit();
		    
		}

	}

