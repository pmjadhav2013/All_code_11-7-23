package UdemyCourse.AllCodes.Section28;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

public class SetGeoLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver",
		//		"E:\\Clarion Selenium Java framework\\Section28_218\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		Map<String, Object> coordinates = new HashMap<String, Object>();
		coordinates.put("latitude", 40.416775);
		coordinates.put("longitude", -3.703790);
		coordinates.put("accuracy", 100);
		
		driver.executeCdpCommand("Emulation.setGeolocationOverride", coordinates);
		Thread.sleep(3000);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("netflix",Keys.ENTER);
		driver.findElements(By.cssSelector(".LC20lb")).get(0).click();
		String title = driver.findElement(By.cssSelector("h1[class='default-ltr-cache-19f4kxn ejqbulh8']")).getText();
		System.out.println(title);
		
		System.out.println("Completed");
		 
		driver.close();

	}

}
