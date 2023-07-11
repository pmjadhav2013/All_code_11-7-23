package UdemyCourse.AllCodes.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignement1_1 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement element = driver.findElement(By.id("checkBoxOption1"));

		// Verify option1 not selected

		Assert.assertFalse(element.isSelected());

		// select 'option1" checkbox

		element.click();

		// Verify option1 selected

		Assert.assertTrue(element.isSelected());

		// Unselect 'option1" checkbox

		element.click();

		// Verify option1 not selected

		Assert.assertFalse(element.isSelected());
		System.out.println("Done");
	}

}
