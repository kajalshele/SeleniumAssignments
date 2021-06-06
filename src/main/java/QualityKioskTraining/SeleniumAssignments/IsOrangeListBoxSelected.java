package QualityKioskTraining.SeleniumAssignments;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsOrangeListBoxSelected {
	/*
	 * 6. Use below link https://letskodeit.teachable.com/p/practice Select option
	 * Orange in ListBox and check if option selected is indeed Orange or Not Check
	 * whether correct options are seen in Listbox or not
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
		
		//Locate the listBox element
		WebElement listBox = driver.findElementById("multiple-select-example");
		Select select = new Select(listBox);

		//Select orange option from list by value
		select.selectByValue("orange");

		//Check whether orange option is selected or not
		List<WebElement> selectedOptions=select.getAllSelectedOptions();
		
		for(WebElement option:selectedOptions) {
			if(option.getText().equals("Orange")) {
				System.out.println("Yes, Its selected");
			}else {
				System.out.println("No,Its not selected");
			}
		}
		
		//List of Expected options in list
		List<String> expectedFruitName = new ArrayList<>();
		expectedFruitName.add("Apple");
		expectedFruitName.add("Orange");
		expectedFruitName.add("Peach");

		//Check expected option are their in list or not
		List<WebElement> allFruitOption = select.getOptions();
		
		// foreach loop
		for (WebElement option : allFruitOption) {

			if (expectedFruitName.contains(option.getText())) {
				System.out.println(option.getText()+" Yes ,Its expected one option ");
			} else {
				System.out.println(option.getText()+" No ,Its not expected one");
			}
		}
	}
}
