package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signin {
	
	WebDriver driver;
	
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
	  
	}

	@When("^User enters email and password and clicks Login button$")
	public void user_enters_email_and_password_and_clicks_Login_button() throws Throwable {
		 driver.findElement(By.id("Email")).sendKeys("neetikayap@gmail.com");
		 driver.findElement(By.name("Password")).sendKeys("neetik");
		 driver.findElement(By.xpath("//input[@value='Log in']")).click();
	  
	}

	@Then("^user should see logout link$")
	public void user_should_see_logout_link() throws Throwable {
		boolean view = driver.findElement(By.linkText("Log out")).isDisplayed();
		Assert.assertTrue(view);
		driver.findElement(By.linkText("Log out")).click();
	    driver.close();
	   
	}



}
