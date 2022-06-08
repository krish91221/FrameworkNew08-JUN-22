package com.crm.practice;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Parameters("browser")
public class SeleniumGridPractice {
	RemoteWebDriver driver;
	@BeforeClass
	public void launchBrowserInRemoteachine(String browser) throws IOException
	{
		URL url=new URL("https://192.168.43.101:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		if(browser.equals("chrome"))
		{
			//cap.setPlatform(windows);
			cap.setBrowserName("chrome");
		}
		else if(browser.equals("firefox"))
		{

			cap.setBrowserName("chrome");
		}
		driver=new RemoteWebDriver(url,cap);
		//driver.get("https://www.flipkart.com");
	}
	@Test
	public void launchApplication()
	{
		driver.get("https://www.flipkart.com");
	}

}
