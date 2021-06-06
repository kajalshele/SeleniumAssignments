package QualityKioskTraining.SeleniumAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsButtonDisabled {
	/*
	 * 4.Use below link
	 * https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled
	 * 
	 * Open page using script and confirm that Click Me! button is DISABLED.
	 * 
	 */
	public static void main(String[] args) {
		// Establish the driver connection
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kajal Shele\\OneDrive\\Documents\\driver\\chromedriver.exe");

		// Initiate the chromedriver
		ChromeDriver driver = new ChromeDriver();

		// Go to the website https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_button_disabled");

		// Maximize the web page window
		driver.manage().window().maximize();

		// Switch to frame
		driver.switchTo().frame("iframeResult");

		// Locate button element
		WebElement clickMebutton = driver.findElementByCssSelector("button[type='button']");

		// Check whether button is disable or enable
		if (clickMebutton.isEnabled()) {
			System.out.println("No ,Its enabled");
		} else {
			System.out.println("Yes,Its Disabled");
		}

	}

}
