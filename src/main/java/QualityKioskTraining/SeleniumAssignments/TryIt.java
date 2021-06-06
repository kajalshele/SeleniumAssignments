package QualityKioskTraining.SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryIt {

	/*
	 * 2. Use following link:
	 * https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
	 * 
	 * Click TryIt button.Once prompt alert will be shown,enter Name in the edit
	 * field of prompt box. and close the alert
	 */
	public static void main(String[] args) {
		// Establish the driver connection
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kajal Shele\\OneDrive\\Documents\\driver\\chromedriver.exe");

		// Initiate the chromedriver
		ChromeDriver driver = new ChromeDriver();

		// Go to the website
		// https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// Maximize the web page window
		driver.manage().window().maximize();

		// Switch to frame
		driver.switchTo().frame("iframeResult");

		// Locate the button element
		WebElement tryItBtn = driver.findElementByTagName("button");
		// Click the button
		tryItBtn.click();

		// Switch to Alert section
		Alert text = driver.switchTo().alert();

		// Send data to alert section
		text.sendKeys("Kajal");

		// Click Ok
		text.accept();

		// Locate msgField to check that send data is present there or not
		WebElement msgField = driver.findElementById("demo");

		// Print text of msgField
		System.out.println(msgField.getText());

	}
}
