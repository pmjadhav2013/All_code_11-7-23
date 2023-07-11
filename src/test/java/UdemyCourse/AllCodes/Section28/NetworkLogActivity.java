package UdemyCourse.AllCodes.Section28;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v113.network.Network;
import org.openqa.selenium.devtools.v113.network.model.Request;
import org.openqa.selenium.devtools.v113.network.model.Response;
//import org.openqa.selenium.devtools.v113.network.Network;

public class NetworkLogActivity {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"E:\\Clarion Selenium Java framework\\Section28_218\\driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		DevTools devTools = driver.getDevTools();
		devTools.createSession();

		devTools.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
		
		devTools.addListener(Network.requestWillBeSent(), request ->
		{
			Request req = request.getRequest();
			System.out.println(req.getUrl());
		});
		devTools.addListener(Network.responseReceived(), response ->
		{
			Response res = response.getResponse();
			// System.out.println(res.getUrl());
		//	System.out.println(res.getStatus());
			
			// to check failed urls
			
			if(res.getStatus().toString().startsWith("4"))
					{
					System.out.println(res.getUrl() + " is failing with status code " + res.getStatus());
					}
		});
		
		driver.get("https://rahulshettyacademy.com/angularAppdemo/");
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[routerlink='/library']")).click();
		
	}

}
