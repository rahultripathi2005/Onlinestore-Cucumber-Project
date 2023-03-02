package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_Steps {

	public static WebDriver driver ;
	public static String s="C:/E Drive backup/profile/selenium driver/chromedriver_win32/chromedriver.exe";
	
	@Given("^User is on homepage$")
	public void user_is_on_homepage() throws Throwable{
		System.setProperty("webdriver.chrome.driver",s);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
		
	}
	@When("^User Navigate to LogIn Page$")
	
	public void user_Navigate_to_LogIn_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //Launch the Online Store Website

        driver.get("https://www.toolsqa.com");
	    
	}

	@When("^User enters UserName and Password$")
	public void user_enters_UserName_and_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.xpath("//button[@id='login']")).click();
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("rahultripathi2005");

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Q1@rahu!");
        driver.findElement(By.xpath("//button[@id='login']")).click();
	    
	}

	@Then("^Message displayed Login Successfully$")
	public void message_displayed_Login_Successfully() throws Throwable {
		
	    // Write code here that turns the phrase above into concrete actions
		
		

        // Print a Log In message to the screen

        System.out.println("Login Successfully");

	    
	}

	@When("^User LogOut from the Application$")
	public void user_LogOut_from_the_Application() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 // Find the element that's ID attribute is 'account_logout' (Log Out)

        driver.findElement(By.xpath("//button[@id='submit']")).click();

        // Print a Log In message to the screen

       

	    
	}

	@Then("^Message displayed LogOut Successfully$")
	public void message_displayed_LogOut_Successfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		 System.out.println("LogOut Successfully");
		  driver.quit();
	   
	}
	
	
}
