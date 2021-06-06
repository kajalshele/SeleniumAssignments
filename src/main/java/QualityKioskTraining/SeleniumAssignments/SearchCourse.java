package QualityKioskTraining.SeleniumAssignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCourse {
	/*
	 * 3.Use link below: https://letskodeit.teachable.com/p/practice
	 * 
	 * Type course name in the search field of Iframe given in Iframe example
	 * section
	 */
	public static void main(String[] args) {
		// Establish the driver connection
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Kajal Shele\\OneDrive\\Documents\\driver\\chromedriver.exe");

		// Initiate the chromedriver
		ChromeDriver driver = new ChromeDriver();

		// Go to the website https://letskodeit.teachable.com/p/practice
		driver.get("https://letskodeit.teachable.com/p/practice");

		// Maximize the web page window
		driver.manage().window().maximize();
		
		//Switch to frame
		driver.switchTo().frame("courses-iframe");
		
		//Locate searchField 
		WebElement searchField=driver.findElementById("search-courses");
		//send data to searchField
		searchField.sendKeys("python");
		
		//Locate searchBtn
		WebElement searchBtn=driver.findElementById("search-course-button");
		//Click searchBtn
		searchBtn.click();
		
		//Locate course
		WebElement course=driver.findElementByCssSelector("div[title='Learn Python 3 from scratch']");
		//Click on course 
		course.click();
		}

}
