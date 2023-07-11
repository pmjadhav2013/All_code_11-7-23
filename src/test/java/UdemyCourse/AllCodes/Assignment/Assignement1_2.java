package UdemyCourse.AllCodes.Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assignement1_2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		int count = (driver.findElements(By.xpath("//input[contains(@id,'checkBox')]"))).size();
		System.out.println("Total no of checkbox : "+ count);

	driver.close();
	}

}
