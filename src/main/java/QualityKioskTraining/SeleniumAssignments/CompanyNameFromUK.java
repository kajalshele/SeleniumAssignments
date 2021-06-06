package QualityKioskTraining.SeleniumAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CompanyNameFromUK {

	public static void main(String[] args) {

		// Establish the driver connection
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kajal Shele\\OneDrive\\Documents\\driver\\chromedriver.exe");

		// Initiate the chromedriver
		ChromeDriver driver = new ChromeDriver();

		// Go to the website
		// https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");

		// Maximize the web page window
		driver.manage().window().maximize();

		//Switch the frame
		driver.switchTo().frame("iframeResult");
		
		String country="UK";
		
		//Locate the webelement
		WebElement ukCompany = driver.findElementByXPath("//table/descendant::td[text()='"+country+"']/parent::tr/child::td[1]");

		// Print a name of a company from UK country
		System.out.println(ukCompany.getText()+" company is from "+country);

	}

}
