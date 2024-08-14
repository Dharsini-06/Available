package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fb {
	WebDriver driver;
	@Given("To launch the webBrowser")
	public void to_launch_the_webBrowser() {
		
    System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva\\eclipse-workspace\\Project\\driver\\chromedriver.exe");
    
   
    
	}

	@When("To launch the url of the facebook")
	public void to_launch_the_url_of_the_facebook() {
		 driver = new ChromeDriver();
		 driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
	
	   
	}

	@When("Enter the valid username")
	public void enter_the_valid_username() throws InterruptedException {
		Thread.sleep(2000);
		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
		mail.sendKeys("dharshdharsu");
	   
	}

	@When("Enter the invalid password")
	public void enter_the_invalid_password() throws InterruptedException {
		Thread.sleep(2000);
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("1234567890");
	   
	}

	@When("Click the login button")
	public void click_the_login_button() throws InterruptedException {
		Thread.sleep(2000);
		WebElement touch = driver.findElement(By.name("login"));
	    touch.click();
	}

	@When("check the credentials")
	public void check_the_credentials() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("credentials checked");
	    
	}

	@Then("close the browser")
	public void close_the_browser() throws InterruptedException {
		Thread.sleep(2000);
	   driver.close();
	}



}
