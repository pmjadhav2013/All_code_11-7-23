package UdemyCourse.AllCodes.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignement2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();

		// TODO Auto-generated method stub

		driver.get("http://rahulshettyacademy.com/angularpractice/");

		driver.manage().window().maximize();

		driver.findElement(By.name("name")).sendKeys("Prashant");

		driver.findElement(By.name("email")).sendKeys("Prashant@gmail.com");

		driver.findElement(By.cssSelector("#exampleInputPassword1")).sendKeys("prashant");

		driver.findElement(By.xpath("//input[contains(@id,'Check1')]")).click();

		WebElement Dropdown = driver.findElement(By.cssSelector("select[id*='Form']"));

		Select options = new Select(Dropdown);

		options.selectByVisibleText("Male");

		driver.findElement(By.id("inlineRadio2")).click();

		driver.findElement(By.name("bday")).sendKeys("01-06-2023");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		System.out.println(driver.findElement(By.cssSelector("div[class*='alert']")).getText());

		driver.close();
	}

}
