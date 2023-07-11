package UdemyCourse.AllCodes.Section28;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v112.fetch.Fetch;

public class NetworkMocking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Clarion Selenium Java framework\\Section28_218\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		devTools.send(Fetch.enable(Optional.empty(), Optional.empty()));
		devTools.addListener(Fetch.requestPaused(), request -> 
		{
			if (request.getRequest().getUrl().contains("shetty")) 
			{
				String mockedUrl = request.getRequest().getUrl().replace("=shetty", "=BadGuy");
				System.out.println(mockedUrl);

				devTools.send(Fetch.continueRequest(request.getRequestId(), Optional.of(request.getRequest().getUrl()),
						Optional.of(request.getRequest().getMethod()),
						Optional.empty(), Optional.empty(), Optional.empty()));

			}
		});
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[routerlink='/library']")).click();
	}
}
