package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class InvalidLogin {
	
WebDriver driver;
@Given("^User lands on login page$")
public void user_lands_on_login_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\selenium_software\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/login");
	driver.manage().window().maximize();
   
}

@When("^User enters incorrect email and/or password and clicks Login button$")
public void user_enters_incorrect_email_and_or_password_and_clicks_Login_button() throws Throwable {
	driver.findElement(By.id("Email")).sendKeys("neetikayap@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("neetikio");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
 
   
}

@Then("^User should see a message \"([^\"]*)\"$")
public void user_should_see_a_message(String arg1) throws Throwable {
	String message=driver.findElement(By.xpath("//*[contains(text(), 'Login was unsuccessful')]")).getText();
	Assert.assertEquals("Invalid Credentials", message);
}

}
