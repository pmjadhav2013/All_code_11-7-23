package UdemyCourse.AllCodes.Section28;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.emulation.Emulation;
import org.openqa.selenium.devtools.v113.emulation.model.DisplayFeature;
import org.openqa.selenium.devtools.v113.emulation.model.ScreenOrientation;
import org.openqa.selenium.devtools.v113.page.model.Viewport;

public class MobileEmulatorTest {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "E:\\Clarion Selenium Java
		// framework\\Section28_218\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		DevTools devTools = driver.getDevTools();

		devTools.createSession();
		// send commands to cdp > chrome dev tools protocol
		// cdp methods invole and get access to chrome dev tools
		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 80, true,Optional.<Number> empty(),
	            Optional.<Integer> empty(), Optional.<Integer> empty(), Optional.<Integer> empty(), 
	            Optional.<Integer> empty(), Optional.<Boolean> empty(), Optional.<ScreenOrientation> empty(), 
	            Optional.<Viewport> empty(), Optional.<DisplayFeature> empty()));
//		devTools.send(Emulation.setDeviceMetricsOverride(600, 1000, 80, true, Optional.empty(), Optional.empty(),
//				Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
//				Optional.empty(), Optional.empty()));
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		driver.findElement(By.cssSelector(".navbar-toggler-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Library")).click();
		Thread.sleep(3000);
		System.out.println("successfull");
		driver.close();
	}
}
