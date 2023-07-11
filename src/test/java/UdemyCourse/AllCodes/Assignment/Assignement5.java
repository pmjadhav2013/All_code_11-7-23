package UdemyCourse.AllCodes.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement5 {

	public static void main(String[] args) {

		String webURL = "https://the-internet.herokuapp.com/";

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(webURL);

		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();

		driver.switchTo().frame(0);

		driver.switchTo().frame(1);

		System.out.println(driver.findElement(By.id("content")).getText());

		driver.switchTo().defaultContent();
		
		driver.close();

		}
		}

