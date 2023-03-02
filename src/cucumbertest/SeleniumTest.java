package cucumbertest;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest {



		private static WebDriver driver = null;
		public static String s="C:/E Drive backup/profile/selenium driver/chromedriver_win32/chromedriver.exe";
		public static void main(String[] args) {
			// Create a new instance of the Chrome driver
			System.setProperty("webdriver.chrome.driver",s);
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	        //Launch the Online Store Website

	        driver.get("https://www.demoqa.com/books");

	        // Find the element that's ID attribute is 'account'(My Account) 

	        

	        // Find the element that's ID attribute is 'log' (Username)

	        // Enter Username on the element found by above desc.

	        driver.findElement(By.xpath("//button[@id='login']")).click();
	        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("rahultripathi2005");

	        // Find the element that's ID attribute is 'pwd' (Password)

	        // Enter Password on the element found by the above desc.

	        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Q1@rahu!");

	        // Now submit the form. WebDriver will find the form for us from the element 

	        driver.findElement(By.xpath("//button[@id='login']")).click();

	        // Print a Log In message to the screen

	        System.out.println("Login Successfully");

	        // Find the element that's ID attribute is 'account_logout' (Log Out)

	        driver.findElement(By.xpath("//button[@id='submit']")).click();

	        // Print a Log In message to the screen

	        System.out.println("LogOut Successfully");

	        // Close the driver

	        driver.quit();
		
		
	}

}
