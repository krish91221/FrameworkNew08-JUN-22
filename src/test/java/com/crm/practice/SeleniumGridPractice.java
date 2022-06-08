package com.crm.practice;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class SeleniumGridPractice {
	@Parameters("browser")
	@Test
	public void launchBrowserInRemoteachine(String browser) throws IOException, InterruptedException
	{
		RemoteWebDriver driver;
		URL url=new URL("http://192.168.0.114:4444/wd/hub");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setPlatform(Platform.WINDOWS);
		if(browser.equals("chrome"))
		{
			cap.setBrowserName("chrome");
		}
		else if(browser.equals("firefox"))
		{
			cap.setBrowserName("firefox");
		}
		driver=new RemoteWebDriver(url,cap);
		driver.get("http://www.flipkart.com");
		Thread.sleep(2000);
		driver.close();
	}

}
