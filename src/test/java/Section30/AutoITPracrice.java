package Section30;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoITPracrice {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Prashant Jadhav\\Desktop\\AutoITPractice\\test.exe");
		Thread.sleep(3000);
		driver.findElement(By.id("processTaskTextBtn")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1[class='title2']")));
		// to check how file get downloaded
		System.out.println(driver.findElement(By.cssSelector("h1[class='title2']")).getText());
		Thread.sleep(10000);
		File f = new File("C:\\Users\\Prashant Jadhav\\Downloads\\test.docx");
		if(f.exists())
		{
			System.out.println("File Found");
		}
		else
			System.out.println("File not found");
	
	//	driver.close();
	}
}
