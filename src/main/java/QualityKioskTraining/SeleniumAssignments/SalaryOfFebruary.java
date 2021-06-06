package QualityKioskTraining.SeleniumAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalaryOfFebruary {

	/*
	 * 7.Use below link:
	 * https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_table_test
	 * 
	 * Identify td element showing Savings of month February,retrieve the savings
	 * value and print on console
	 */
	public static void main(String[] args) {

		// Establish the driver connection
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kajal Shele\\OneDrive\\Documents\\driver\\chromedriver.exe");

		// Initiate the chromedriver
		ChromeDriver driver = new ChromeDriver();

		// Go to the website https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_table_test
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_table_test");

		// Maximize the web page window
		driver.manage().window().maximize();

		// Switch to frame
		driver.switchTo().frame("iframeResult");

		String month = "February";

		// locate the february salary
		WebElement Salary = driver.findElementByXPath("//table//td[text()='" + month + "']//following-sibling::td");

		// Print Savings of february
		System.out.println("Salary of " + month + " month is " + Salary.getText());

	}

}
