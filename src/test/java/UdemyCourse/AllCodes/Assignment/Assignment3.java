package UdemyCourse.AllCodes.Assignment;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assignment3 {
	
	public static void main(String[] args) {

	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://rahulshettyacademy.com/loginpagePractise/");

	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

	String username = driver.findElement(By.cssSelector("div[class=form-group] p b i")).getText();

	driver.findElement(By.name("username")).sendKeys(username);

	driver.findElement(By.name("password")).sendKeys("learning");

	driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));

	driver.findElement(By.id("okayBtn")).click();

	Select drop = new Select(driver.findElement(By.xpath("//select[@class='form-control']")));

	drop.selectByVisibleText("Consultant");

	driver.findElement(By.id("terms")).click();

	driver.findElement(By.id("signInBtn")).click();

	wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));

	addItem(driver);

	driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();

	System.out.println("done");
	driver.close();
	}

	public static void addItem(WebDriver driver) {

	List<WebElement> items = driver.findElements(By.xpath("//button[@class ='btn btn-info']"));

	for(int i=0;i<items.size();i++) {

	items.get(i).click();

	}

	}

	
}
