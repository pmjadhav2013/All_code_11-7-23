package UdemyCourse.AllCodes.Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement7 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> column = driver
				.findElements(By.xpath("//div[@class='left-align']//table[@id='product']//tr//th"));

		System.out.println("No of columns : " + column.size());

		List<WebElement> rows = driver.findElements(By.xpath("//div[@class='left-align']//table[@id='product']//tr"));

		System.out.println("No of rows : " + rows.size());

		WebElement secondRow = driver.findElement(By.xpath("//div[@class='left-align']//table[@id='product']//tr[3]"));

		System.out.println(secondRow.getText());

		driver.quit();

	}

}
