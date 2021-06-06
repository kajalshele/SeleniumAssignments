package QualityKioskTraining.SeleniumAssignments;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPasteName {
	/*
	 * 11.Use below link:
	 * https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test
	 * 
	 * Enter your name in FirstName field.Select entered value using Ctr1 a,copy
	 * using ctrl c and paste it in LastName field using Ctrl v
	 */

	public static void main(String[] args) throws InterruptedException {

		// Establish the driver connection
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kajal Shele\\OneDrive\\Documents\\driver\\chromedriver.exe");

		// Initiate the chromedriver
		ChromeDriver driver = new ChromeDriver();

		// Go to the website
		// https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test");

		// Maximize the web page window
		driver.manage().window().maximize();

		//switch frame
		driver.switchTo().frame("iframeResult");
		
		//Locate firstName element
		WebElement firstName=driver.findElementById("fname");
		//Send data
		firstName.sendKeys("Kajal");
		
		Actions action=new Actions(driver);
		Thread.sleep(5000);
		
		//With clicking control type a
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		Thread.sleep(5000);
		
		//With clicking control type c
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		Thread.sleep(5000);
		
		//Locate lastName element
		WebElement lastName=driver.findElementById("lname");
		Thread.sleep(5000);
		
		//With clicking control type v
		action.keyDown(lastName,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
			}
}
