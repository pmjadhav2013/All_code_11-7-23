package load_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class All_Video {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://php8-dev-player.flimp.live/Flimp_HRBenefitsVideoLibrary");
		//driver.findElements(By.)
	}

}
