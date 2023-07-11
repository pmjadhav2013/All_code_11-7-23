package UdemyCourse.AllCodes.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignement8 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement text = driver.findElement(By.cssSelector("#autocomplete"));

		Actions act = new Actions(driver);

		act.moveToElement(text).click().sendKeys("ind").build().perform();

		Thread.sleep(1000);

		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);

		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);

		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.ENTER);

		System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getAttribute("value"));

		driver.quit();

	}

}
