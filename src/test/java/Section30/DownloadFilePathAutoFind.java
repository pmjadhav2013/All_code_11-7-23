package Section30;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class DownloadFilePathAutoFind {

	public static void main(String[] args) throws InterruptedException, IOException {

		String downloadPath = System.getProperty("user.dir");

		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();

		chromePrefs.put("profile.default_content_settings.popups", 0);

		chromePrefs.put("download.default_directory", downloadPath);

		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", chromePrefs);

		WebDriver driver = new ChromeDriver(options);
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
		driver.findElement(By.id("pickfiles")).click();
		Thread.sleep(20000);
		File f = new File(downloadPath + "\test.docx");
		if (f.exists()) {
			Assert.assertTrue(f.exists());

			if(f.delete())

			System.out.println("file deleted");

			}

		driver.close();
	}
	
}
