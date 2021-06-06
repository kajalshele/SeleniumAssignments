package QualityKioskTraining.SeleniumAssignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsNameExistInMsg {
	/*
	 * 1.Use https://letskodeit.teachable.com/p/practice
	 * 
	 * 1.Enter name in "Enter Your Name" field.Click on Confirm button.Check value
	 * entered in the field indeed exists in the message shown by confirmation
	 * window.Close confirmation window by clicking on No button
	 * 
	 */
	public static void main(String[] args) {
		//Establish the driver connection
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kajal Shele\\OneDrive\\Documents\\driver\\chromedriver.exe");
		
		//Initiate the chromedriver
		ChromeDriver driver=new ChromeDriver();
		
		//Go to the website https://letskodeit.teachable.com/p/practice
		driver.get("https://letskodeit.teachable.com/p/practice");
		
		//Maximize the web page window
		driver.manage().window().maximize();
		
		//Locate the text field
		WebElement textField=driver.findElementById("name");
		//Send data to the field
		textField.sendKeys("Swapnali");
		
		//Store data in one variable
		String text=textField.getText();
		
		//Locate the confirm button on web page
		WebElement confirmBtn=driver.findElementById("confirmbtn");
		//Click the button
		confirmBtn.click();
		
		//Switch focus on Alert section
		Alert alertWindow=driver.switchTo().alert();
	
		//Check whether Alert Section contain entered text or not
		if(alertWindow.getText().contains(text)) {
			System.out.println("Yes,Your text exist in Alert section");
		}else {
			System.out.println("No ,Your text is not exist in Alert section");
		}
		
		//click on cancel button
		alertWindow.dismiss();
	}

}
