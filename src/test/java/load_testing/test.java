package load_testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://php8-dev-player.flimp.live/Flimp_HRBenefitsVideoLibrary");
		//Wait wa = new WebDriverWait(driver,java.time.Duration.ofSeconds(120));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement logo = driver.findElement(By.id("element1fdbce-3f46-f2a2-a78-c2eb61aca07e"));
		wait.until(ExpectedConditions.visibilityOf(logo));
		
		driver.findElement(By.id("videobbf4a1-24-8174-f045-5e45d0b55ec2")).click();
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("div[id='loading']"))));
		driver.switchTo().frame("receiver");
		
		WebElement button = driver.findElement(By.cssSelector("button[class='vjs-big-play-button']"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button.click();
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a[class='modal_close']"))));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='modal_close']")).click();
		
		System.out.println("done first test");
		
		// test 2
		wait.until(ExpectedConditions.visibilityOf(logo));
		
		driver.findElement(By.id("video41b3231-0a51-e6c-07b2-48ac5afa48b")).click();
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("div[id='loading']"))));
		driver.switchTo().frame("receiver");
		
		WebElement button1 = driver.findElement(By.cssSelector("button[class='vjs-big-play-button']"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		button1.click();
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("a[class='modal_close']"))));
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='modal_close']")).click();
		System.out.println("done second test");
		driver.close();
	}

}
